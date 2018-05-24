package org.infokin.cdcollectionmanager.model.core;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * Base class that provides a primary key for every derived entity.
 */
@MappedSuperclass
public abstract class BaseEntity implements Serializable {

    /*--------
    | Fields |
    --------*/

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /*------------------
    | Override methods |
    ------------------*/

    @Override
    public boolean equals(Object other) {
        return (other != null && getClass() == other.getClass() && id != null) ? id.equals(((BaseEntity) other).id) : (other == this);
    }

    @Override
    public int hashCode() {
        return (id != null) ? (getClass().hashCode() + id.hashCode()) : super.hashCode();
    }

    @Override
    public String toString() {
        return String.format("%s[id=%d]", getClass().getSimpleName(), getId());
    }

    /*---------------------
    | Getters and Setters |
    ---------------------*/

    public Long getId() {
        return id;
    }
}
