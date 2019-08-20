package me.sememorg.new_beginning.service.impl;

import me.sememorg.new_beginning.model.Master;
import me.sememorg.new_beginning.repository.MasterRepository;
import me.sememorg.new_beginning.service.MasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MasterServiceImpl implements MasterService {

    @Autowired
    private MasterRepository masterRepository;

    @Override
    public Optional<Master> readMaster(String name) {
        return masterRepository.findByName(name);
    }

    @Override
    public Master updateMaster(Master master) {
        if (!masterRepository.existsById(master.getId()))
            return null;

        return masterRepository.save(master);    }

    @Override
    public void deleteMaster(String name) {
        masterRepository.deleteByName(name);
    }

    @Override
    public Master createMaster(Master master) {
        if (!masterRepository.existsByName(master.getName())){
            Master newMaster = masterRepository.save(master);
            return newMaster;
        }
        return null;
    }
}
