package com.brownfield.pss.baggage.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.brownfield.pss.baggage.component.BagggageComponent;
import com.brownfield.pss.baggage.entity.BaggageRecord;

@RestController
@CrossOrigin
@RequestMapping("/baggage")
public class BaggageController {

	BagggageComponent bagggageComponent;
	
	@Autowired
    public BaggageController(BagggageComponent bagggageComponent) {
		this.bagggageComponent = bagggageComponent;
	}
	
	private static final Logger LOG = LoggerFactory.getLogger(BaggageController.class);
	
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    long checkIn (@RequestBody BaggageRecord baggage) {
        LOG.info("Baggage : " + baggage);
        return bagggageComponent.attach(baggage);
    }

}
