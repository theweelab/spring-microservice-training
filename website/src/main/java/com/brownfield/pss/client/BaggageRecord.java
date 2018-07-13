package com.brownfield.pss.client;

public class BaggageRecord {
 	long baggageWeight;
    long checkinId;
	public BaggageRecord(long baggageWeight, long checkinId) {
		super();
		this.baggageWeight = baggageWeight;
		this.checkinId = checkinId;
	}
	public long getBaggageWeight() {
		return baggageWeight;
	}
	public long getCheckinId() {
		return checkinId;
	}
	public void setBaggageWeight(long baggageWeight) {
		this.baggageWeight = baggageWeight;
	}
	public void setCheckinId(long checkinId) {
		this.checkinId = checkinId;
	}
}
