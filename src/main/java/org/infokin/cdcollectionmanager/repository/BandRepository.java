package org.infokin.cdcollectionmanager.repository;

import org.infokin.cdcollectionmanager.model.Band;
import org.infokin.cdcollectionmanager.repository.core.AbstractBaseRepository;

import javax.ejb.Stateless;
import javax.persistence.TypedQuery;
import java.util.List;

@Stateless
public class BandRepository extends AbstractBaseRepository<Band> {

    @Override
    public Band get(Long id) {
        TypedQuery<Band> query = entityManager.createQuery("SELECT band FROM Band band WHERE band.id = :id", Band.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }

    @Override
    public List<Band> getAll() {
        TypedQuery<Band> query = entityManager.createQuery("SELECT bands FROM Band bands", Band.class);
        return query.getResultList();
    }

    @Override
    public void update(Band entity) {
        entityManager.merge(entity);
    }
}
