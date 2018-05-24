package org.infokin.cdcollectionmanager.repository.core;

import org.infokin.cdcollectionmanager.model.core.BaseEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Generic implementation of basic repository operations.
 */
public abstract class AbstractBaseRepository<T extends BaseEntity> implements BaseRepository<T> {

    @PersistenceContext
    protected EntityManager entityManager;

    /**
     * {@inheritDoc}
     */
    @Override
    public void save(T entity) {
        entityManager.persist(entity);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void update(T entity) {
        entityManager.merge(entity);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void delete(T entity) {
        entityManager.remove(entityManager.contains(entity) ? entity : entityManager.merge(entity));
    }
}
