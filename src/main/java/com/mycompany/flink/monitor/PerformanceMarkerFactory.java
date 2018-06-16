package com.mycompany.flink.monitor;

public class PerformanceMarkerFactory {
	private long samplingDuration = 0L;
	private final String statsdHost;
	private final int statsdPort;
	private boolean flag;

	public PerformanceMarkerFactory(String statsdHost, int statsdPort,
			long samplingDuration_ms, boolean flag) {
		this.statsdHost = statsdHost;
		this.statsdPort = statsdPort;
		this.samplingDuration = samplingDuration_ms;
		this.flag = flag;
	}

	public StatsdPerformanceMarker getMarker() {
		return flag ? new StatsdPerformanceMarker(statsdHost, statsdPort, samplingDuration) : null;
	}

}
