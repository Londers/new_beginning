package me.sememorg.new_beginning.controller;


import me.sememorg.new_beginning.controller.exchange.CreateMasterRequest;
import me.sememorg.new_beginning.model.Master;
import me.sememorg.new_beginning.service.MasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.management.modelmbean.ModelMBean;
import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping
public class MasterController {

    @Autowired
    MasterService masterService;

    @GetMapping(value = "/")
    public ModelAndView getHello(){
        return new ModelAndView("welcomePage");
    }

    @GetMapping(value = "/{name}")
    public Optional<Master> getMaster(@PathVariable() String name){
        return masterService.readMaster(name);
    }

    @PostMapping(value = "/")
    public ResponseEntity<Master> postMaster(@RequestBody CreateMasterRequest request){
        Master master = masterService.createMaster(new Master(
                request.getName(),
                request.getCountry(),
                request.getAge()));
        return new ResponseEntity<>(master, HttpStatus.OK);
    }

    @PutMapping(value = "/{name}")
    public Master updateMaster(@RequestBody Master master, @PathVariable("name") String name) {
        Master newMaster = new Master(
                master.getName(),
                master.getCountry(),
                master.getAge());
        return masterService.updateMaster(newMaster);
    }

    @DeleteMapping(value = "/{name}")
    public void deleteMaster(@PathVariable String name) {
        masterService.deleteMaster(name);
    }
}
