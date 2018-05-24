package org.infokin.cdcollectionmanager.model;

import org.infokin.cdcollectionmanager.model.core.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Albums")
public class Album extends BaseEntity {

    /*--------
    | Fields |
    --------*/

    private String name;

    @ManyToOne
    private Band band;

    /*--------------
    | Constructors |
    --------------*/

    public Album() {
    }

    public Album(String name, Band band) {
        this.name = name;
        this.band = band;
    }

    /*---------------------
    | Getters and Setters |
    ---------------------*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Band getBand() {
        return band;
    }

    public void setBand(Band band) {
        this.band = band;
    }
}