package com.brownfield.pss.baggage.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.brownfield.pss.baggage.repository.BaggageRepository;
import com.brownfield.pss.baggage.component.Sender;
import com.brownfield.pss.baggage.entity.BaggageRecord;

@Component
public class BagggageComponent {
	private static final Logger logger = LoggerFactory.getLogger(BagggageComponent.class);

	BaggageRepository baggageRepository;
	Sender sender;
	
	@Autowired
	public BagggageComponent(BaggageRepository baggageRepository, Sender sender) {
		this.baggageRepository = baggageRepository;
		this.sender = sender;
	}

	public long attach(BaggageRecord baggage) {
		logger.info("Saving baggage ");
		//save
		long id = baggageRepository.save(baggage).getId();
		logger.info("Successfully saved baggage ");
		//send a message back to check-in to update status
		logger.info("Sending baggage for checkinId id "+ baggage.getCheckinId());
		sender.send(baggage.getCheckinId());	
		return id;
	}
	
	public BaggageRecord getBaggageRecord(long id){
		return baggageRepository.findOne(id);
	}
}
