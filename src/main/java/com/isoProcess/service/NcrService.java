package com.isoProcess.service;

import com.isoProcess.entity.Ncr;
import java.util.List;
import java.util.Optional;

public interface NcrService {

    Ncr saveNcr(Ncr ncr); // Create or update Ncr

    Optional<Ncr> getNcrById(int id); // Get Ncr by id

    List<Ncr> getAllNcrs(); // Get all Ncr records

    void deleteNcrById(int id); // Delete Ncr by id
}
