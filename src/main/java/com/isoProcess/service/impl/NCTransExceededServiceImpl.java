package com.isoProcess.service.impl;

import java.util.List;
import java.util.Optional;

import com.isoProcess.entity.NCTransExceeded;
import com.isoProcess.repo.NCTransExceededRepository;
import com.isoProcess.service.NCTransExceededService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NCTransExceededServiceImpl implements NCTransExceededService {

	@Autowired
    private NCTransExceededRepository ncTransExceededRepository;


    @Override
    public NCTransExceeded saveNCTransExceeded(NCTransExceeded ncTransExceeded) {
        return ncTransExceededRepository.save(ncTransExceeded);
    }

    @Override
    public Optional<NCTransExceeded> getNCTransExceededById(int id) {
        return ncTransExceededRepository.findById(id);
    }

    @Override
    public List<NCTransExceeded> getAllNCTransExceeded() {
        return ncTransExceededRepository.findAll();
    }

    @Override
    public void deleteNCTransExceededById(int id) {
        ncTransExceededRepository.deleteById(id);
    }
}