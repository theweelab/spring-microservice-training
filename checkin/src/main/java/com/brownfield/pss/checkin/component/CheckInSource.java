package com.brownfield.pss.checkin.component;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface CheckInSource {

	public static String CHECKINQ = "checkInQ";
	public static String BAGGAGEQ = "baggageQ";
	public static String HAS_BAGGAGE = "HAS_BAGGAGE";

	@Output(CheckInSource.CHECKINQ)
	public MessageChannel checkInQ();
	@Input(CheckInSource.BAGGAGEQ)
	public MessageChannel baggageQ();
}
