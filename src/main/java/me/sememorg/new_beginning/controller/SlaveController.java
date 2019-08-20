package me.sememorg.new_beginning.controller;

import me.sememorg.new_beginning.controller.exchange.CreateSlaveRequest;
import me.sememorg.new_beginning.model.Slave;
import me.sememorg.new_beginning.service.SlaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/slaves")
public class SlaveController {

    @Autowired
    private SlaveService slaveService;

    @GetMapping(value = "/{id}")
    public Optional<Slave> getSlave(@PathVariable Integer id) {
        return slaveService.readSlave(id);
    }

    @PostMapping(value = "/")
    public ResponseEntity<Slave> postSlave(@RequestBody CreateSlaveRequest request) {
        Slave slave = slaveService.createSlave(new Slave(
                request.getName(),
                request.getGender(),
                request.getCost()));
        return new ResponseEntity<>(slave, HttpStatus.OK);
    }

    @PutMapping(value = "/{id}")
    public Slave putSlave(@RequestBody Slave slave, @PathVariable("id") Integer id) {
        Slave newSlave = new Slave(
                id,
                slave.getName(),
                slave.getGender(),
                slave.getCost());
        return slaveService.updateSlave(newSlave);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteSlave(@PathVariable Integer id) {
        slaveService.deleteSlave(id);
    }

}
