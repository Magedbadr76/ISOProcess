package com.isoProcess.service.impl;

import java.util.List;
import java.util.Optional;

import com.isoProcess.entity.NCTrans;
import com.isoProcess.repo.NCTransRepository;
import com.isoProcess.service.NCTransService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NCTransServiceImpl implements NCTransService {

	 @Autowired
    private NCTransRepository ncTransRepository;

 

    @Override
    public NCTrans saveNCTrans(NCTrans ncTrans) {
        return ncTransRepository.save(ncTrans);
    }

    @Override
    public Optional<NCTrans> getNCTransById(int id) {
        return ncTransRepository.findById(id);
    }

    @Override
    public List<NCTrans> getAllNCTrans() {
        return ncTransRepository.findAll();
    }

    @Override
    public void deleteNCTransById(int id) {
        ncTransRepository.deleteById(id);
    }
}