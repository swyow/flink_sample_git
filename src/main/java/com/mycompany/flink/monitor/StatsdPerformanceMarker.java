package com.mycompany.flink.monitor;

import java.io.Serializable;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicLong;

import com.timgroup.statsd.NonBlockingStatsDClient;
import com.timgroup.statsd.StatsDClient;

public class StatsdPerformanceMarker implements Serializable {
	private transient StatsDClient client = null;
	private final AtomicLong processedRecordCount = new AtomicLong(0);
	private final AtomicLong batchRecordCount = new AtomicLong(0);
	private long samplingDuration = 0L;
	private String seriesName;
	private String statsdHost;
	private int statsdPort;

	private Timer timer;

	public StatsdPerformanceMarker(String statsdHost, int statsdPort,
			long samplingDuration_ms) {
		this.samplingDuration = samplingDuration_ms;
		this.statsdHost = statsdHost;
		this.statsdPort = statsdPort;
	}
	
	public void init() {
		client = new NonBlockingStatsDClient("EL", statsdHost, statsdPort);
		startTimer();
	}
	 
	public void setName(String seriesName) {
		this.seriesName = seriesName;
	}

	/**
	 * Increase count on each call,sent to statsd server when reach sampling
	 * duration. Count is reset upon each sampling duration.
	 */
	public void count() { 
		processedRecordCount.incrementAndGet();
	}

	private void startTimer() {
		TimerTask task = new TimerTask() {
			public void run() {
				long processedRecord = processedRecordCount.getAndSet(0);
				client.count(seriesName, processedRecord);
			}
		};
		timer = new Timer(this.seriesName);
		timer.scheduleAtFixedRate(task, 1, samplingDuration);
	}

	public void stopMarker() {
		timer.cancel();
	}
	
	/**
	 * Increase counter when called, will not send to statsd until sendBatchAndReset() called .
	 * 
	 */
	public void batchCount() {
		batchRecordCount.incrementAndGet();
	}
 
	/**
	 * Send total batch count since started to statsd, then reset counter.
	 */
	public void sendBatchAndReset() {
		long count = batchRecordCount.getAndSet(0);
		client.count(seriesName, count);
	}

}
