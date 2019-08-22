package me.sememorg.new_beginning.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Master {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;
    private String country;
    private Integer age = 0;
    private BigDecimal cash = BigDecimal.valueOf(0);
    private Integer slavesCount = 0;

    @OneToMany
    private List<Slave> mySlaves = new ArrayList<>();

    public Master() {
    }

    public Master(String name, String country, Integer age) {
        this.name = name;
        this.country = country;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getCash() {
        return cash;
    }

    public void setCash(BigDecimal cash) {
        this.cash = cash;
    }

    public Integer getSlavesCount() {
        return slavesCount;
    }

    public void setSlavesCount(Integer slavesCount) {
        this.slavesCount = slavesCount;
    }

    public Integer getId() {
        return id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
