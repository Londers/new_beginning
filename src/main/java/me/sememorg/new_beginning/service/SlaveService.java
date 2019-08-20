package me.sememorg.new_beginning.service;

import me.sememorg.new_beginning.model.Slave;

import java.util.Optional;

public interface SlaveService {

    Optional<Slave> readSlave(Integer id);
    Slave updateSlave(Slave slave);
    void deleteSlave(Integer id);
    Slave createSlave(Slave slave);
}
