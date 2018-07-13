package com.brownfield.pss.baggage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brownfield.pss.baggage.entity.BaggageRecord;

@Repository
public interface BaggageRepository extends JpaRepository<BaggageRecord,Long> {

}
