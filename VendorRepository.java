package com.jbevents.backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.jbevents.backend.model.Vendor;

public interface VendorRepository extends MongoRepository<Vendor, String> {}
