package com.isoProcess.service;

import com.isoProcess.entity.Lookup;

import java.util.List;
import java.util.Optional;

public interface LookupService {

    Lookup saveLookup(Lookup lookup); // Create or update Lookup

    Optional<Lookup> getLookupById(int id); // Get Lookup by id

    List<Lookup> getAllLookups(); // Get all Lookup records

    void deleteLookupById(int id); // Delete Lookup by id
}