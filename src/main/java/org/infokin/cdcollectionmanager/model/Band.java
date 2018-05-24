package org.infokin.cdcollectionmanager.model;

import org.infokin.cdcollectionmanager.model.core.BaseEntity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Collection;

@Entity
@Table(name = "Bands")
public class Band extends BaseEntity {

    /*--------
    | Fields |
    --------*/

    private String name;

    @OneToMany(mappedBy = "band", cascade = CascadeType.REMOVE)
    private Collection<Album> albums;

    /*--------------
    | Constructors |
    --------------*/

    public Band() {
    }

    public Band(String name) {
        this.name = name;
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

    public Collection<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(Collection<Album> albums) {
        this.albums = albums;
    }
}