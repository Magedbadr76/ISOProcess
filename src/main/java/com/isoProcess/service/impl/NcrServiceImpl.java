package com.isoProcess.service.impl;

import java.util.List;
import java.util.Optional;

import com.isoProcess.entity.Ncr;
import com.isoProcess.repo.NcrRepository;
import com.isoProcess.service.NcrService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NcrServiceImpl implements NcrService {

	@Autowired
    private NcrRepository ncrRepository;


    @Override
    public Ncr saveNcr(Ncr ncr) {
        return ncrRepository.save(ncr);
    }

    @Override
    public Optional<Ncr> getNcrById(int id) {
        return ncrRepository.findById(id);
    }

    @Override
    public List<Ncr> getAllNcrs() {
        return ncrRepository.findAll();
    }

    @Override
    public void deleteNcrById(int id) {
        ncrRepository.deleteById(id);
    }
}
