package me.sememorg.new_beginning.controller.exchange;

import java.math.BigDecimal;

public class CreateSlaveRequest {
    private String name;
//    private String race;
    private String gender;
//    private Integer age;
//    private Integer weight;
//    private Integer height;
    private BigDecimal cost;

    public BigDecimal getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

//    public String getRace() {
//        return race;
//    }

    public String getGender() {
        return gender;
    }

//    public Integer getAge() {
//        return age;
//    }
//
//    public Integer getWeight() {
//        return weight;
//    }
//
//    public Integer getHeight() {
//        return height;
//    }
}