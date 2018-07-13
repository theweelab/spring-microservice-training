package com.brownfield.pss.checkin.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Component;

@EnableBinding(CheckInSource.class)
@Component
public class Receiver {

	@Autowired
	CheckinComponent checkinComponent;

	public Receiver() {

	}

	/**
	 * public Receiver(CheckinComponent checkinComponent){ this.checkinComponent =
	 * checkinComponent; }
	 * 
	 * 
	 * @RabbitListener(queues = "BaggageQ") public void processMessage(long
	 *                        checkinId ) {
	 *                        checkinComponent.updateBaggageStatus(CheckInSource.HAS_BAGGAGE,
	 *                        checkinId); }
	 **/
	
	@ServiceActivator(inputChannel = CheckInSource.BAGGAGEQ)
	public void accept(long checkinId) {
		System.out.println("Update to BaggageQ");
		checkinComponent.updateBaggageStatus(CheckInSource.HAS_BAGGAGE, checkinId);
		System.out.println("Updated to BaggageQ");
	}
}
