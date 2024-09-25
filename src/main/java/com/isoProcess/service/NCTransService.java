package com.isoProcess.service;

import com.isoProcess.entity.NCTrans;
import java.util.List;
import java.util.Optional;

public interface NCTransService {

    NCTrans saveNCTrans(NCTrans ncTrans); // Create or update NCTrans

    Optional<NCTrans> getNCTransById(int id); // Get NCTrans by id

    List<NCTrans> getAllNCTrans(); // Get all NCTrans records

    void deleteNCTransById(int id); // Delete NCTrans by id
}