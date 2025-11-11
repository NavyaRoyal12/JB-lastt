package com.jbevents.backend.repository;

import com.jbevents.backend.model.Booking;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends MongoRepository<Booking, String> {
    // extra query methods can be declared here if needed
}
