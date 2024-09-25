package com.isoProcess.service;


import com.isoProcess.entity.NCTransExceeded;
import java.util.List;
import java.util.Optional;

public interface NCTransExceededService {

    NCTransExceeded saveNCTransExceeded(NCTransExceeded ncTransExceeded); // Create or update NCTransExceeded

    Optional<NCTransExceeded> getNCTransExceededById(int id); // Get NCTransExceeded by id

    List<NCTransExceeded> getAllNCTransExceeded(); // Get all NCTransExceeded records

    void deleteNCTransExceededById(int id); // Delete NCTransExceeded by id
}
