package org.infokin.cdcollectionmanagerjee.repository.core;

import org.infokin.cdcollectionmanagerjee.model.core.BaseEntity;

import java.util.List;

/**
 * Generic repository interface.
 */
public interface BaseRepository<T extends BaseEntity> {

    /**
     * Persist an entity.
     *
     * @param entity An instance of {@link BaseEntity}
     */
    void save(T entity);

    /**
     * Returns an entity by its identifier.
     *
     * @param id The entities identifier.
     * @return An instance of entity.
     */
    T get(Long id);

    /**
     * Returns all entities of given type.
     *
     * @return A list of entities.
     */
    List<T> getAll();

    /**
     * Update an existing entity.
     *
     * @param entity An instance of {@link BaseEntity}
     */
    void update(T entity);

    /**
     * Delete an entity.
     *
     * @param entity An instance of type {@link BaseEntity}
     */
    void delete(T entity);
}
