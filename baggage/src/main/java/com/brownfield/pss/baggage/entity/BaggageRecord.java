package com.brownfield.pss.baggage.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class BaggageRecord {

	int baggageWeight;
	long checkinId;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "baggage_record_generator")
	@SequenceGenerator(name = "baggage_record_generator", sequenceName = "seq_baggagerecord", allocationSize = 1)
	long id;
	
	public BaggageRecord() {
	}
	
	public BaggageRecord(int baggageWeight, long checkinId) {
		this.baggageWeight = baggageWeight;
		this.checkinId = checkinId;
	}
	public int getBaggageWeight() {
		return baggageWeight;
	}
	
	public long getCheckinId() {
		return checkinId;
	}
	public long getId() {
		return id;
	}
	public void setBaggageWeight(int baggageWeight) {
		this.baggageWeight = baggageWeight;
	}
	public void setCheckinId(long checkinId) {
		this.checkinId = checkinId;
	}

	@Override
	public String toString() {
		return "BaggageRecord [baggageWeight=" + baggageWeight + ", checkinId=" + checkinId + "]";
	}
	
}
