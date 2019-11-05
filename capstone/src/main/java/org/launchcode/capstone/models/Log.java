package org.launchcode.capstone.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Log {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    private String church;

    public Log() { }

    public Log(String name, String church) {
        this.name = name;
        this.church = church;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChurch() {
        return church;
    }

    public void setChurch(String church) {
        this.church = church;
    }
}
