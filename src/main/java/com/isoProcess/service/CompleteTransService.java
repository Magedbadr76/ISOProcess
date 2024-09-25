package com.isoProcess.service;

import com.isoProcess.entity.CompleteTrans;

import java.util.List;
import java.util.Optional;

public interface CompleteTransService {
    CompleteTrans saveCompleteTrans(CompleteTrans completeTrans);
    Optional<CompleteTrans> getCompleteTransById(Integer id);
    List<CompleteTrans> getAllCompleteTrans();
    void deleteCompleteTransById(Integer id);
}