package com.isoProcess.service.impl;

import java.util.List;
import java.util.Optional;

import com.isoProcess.entity.CompleteTrans;
import com.isoProcess.repo.CompleteTransRepository;
import com.isoProcess.service.CompleteTransService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompleteTransServiceImpl implements CompleteTransService {

    @Autowired
    private CompleteTransRepository completeTransRepository;

    @Override
    public CompleteTrans saveCompleteTrans(CompleteTrans completeTrans) {
        return completeTransRepository.save(completeTrans);
    }

    @Override
    public Optional<CompleteTrans> getCompleteTransById(Integer id) {
        return completeTransRepository.findById(id);
    }

    @Override
    public List<CompleteTrans> getAllCompleteTrans() {
        return completeTransRepository.findAll();
    }

    @Override
    public void deleteCompleteTransById(Integer id) {
        completeTransRepository.deleteById(id);
    }
}
