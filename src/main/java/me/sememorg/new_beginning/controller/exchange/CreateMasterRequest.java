package me.sememorg.new_beginning.controller.exchange;

import me.sememorg.new_beginning.model.Slave;

import java.math.BigDecimal;
import java.util.List;

public class CreateMasterRequest {
    private String name;
    private String country;
    private Integer age = 0;
    private List<Slave> mySlaves;

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public Integer getAge() {
        return age;
    }

}