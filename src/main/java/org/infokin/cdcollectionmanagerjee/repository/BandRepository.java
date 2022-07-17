package org.infokin.cdcollectionmanagerjee.repository;

import org.infokin.cdcollectionmanagerjee.model.Band;
import org.infokin.cdcollectionmanagerjee.repository.core.AbstractBaseRepository;

import javax.ejb.Stateless;
import javax.persistence.TypedQuery;
import java.util.List;

@Stateless
public class BandRepository extends AbstractBaseRepository<Band> {

    /*---------
    | Methods |
    ---------*/

    @Override
    public List<Band> getAll() {
        TypedQuery<Band> query = entityManager.createQuery("SELECT bands FROM Band bands", Band.class);
        return query.getResultList();
    }

    @Override
    public Band get(Long id) {
        TypedQuery<Band> query = entityManager.createQuery("SELECT band FROM Band band WHERE band.id = :id", Band.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }
}
