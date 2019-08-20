package me.sememorg.new_beginning.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Slave {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;
    private String gender;
    private BigDecimal cost;

    @ManyToOne
    private Master master;

    public Slave() {
    }

    public Slave(String name, String gender, BigDecimal cost) {
        this.name = name;
        this.gender = gender;
        this.cost = cost;
    }

    public Slave(Integer id, String name, String gender, BigDecimal cost) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public Master getMaster() {
        return master;
    }

    public void setMaster(Master master) {
        this.master = master;
    }

    public Integer getId() {
        return id;
    }
}
