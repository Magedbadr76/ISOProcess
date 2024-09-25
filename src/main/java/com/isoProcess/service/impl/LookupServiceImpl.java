package com.isoProcess.service.impl;

import java.util.List;
import java.util.Optional;

import com.isoProcess.entity.Lookup;
import com.isoProcess.repo.LookupRepository;
import com.isoProcess.service.LookupService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LookupServiceImpl implements LookupService {

	@Autowired
    private LookupRepository lookupRepository;

    @Override
    public Lookup saveLookup(Lookup lookup) {
        return lookupRepository.save(lookup);
    }

    @Override
    public Optional<Lookup> getLookupById(int id) {
        return lookupRepository.findById(id);
    }

    @Override
    public List<Lookup> getAllLookups() {
        return lookupRepository.findAll();
    }

    @Override
    public void deleteLookupById(int id) {
        lookupRepository.deleteById(id);
    }
}