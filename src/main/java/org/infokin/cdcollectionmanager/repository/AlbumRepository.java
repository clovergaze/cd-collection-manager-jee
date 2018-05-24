package org.infokin.cdcollectionmanager.repository;

import org.infokin.cdcollectionmanager.model.Album;
import org.infokin.cdcollectionmanager.repository.core.AbstractBaseRepository;

import javax.ejb.Stateless;
import javax.persistence.TypedQuery;
import java.util.List;

@Stateless
public class AlbumRepository extends AbstractBaseRepository<Album> {

    @Override
    public void update(Album entity) {
    }

    @Override
    public Album get(Long id) {
        TypedQuery<Album> query = entityManager.createQuery("SELECT album FROM Album album WHERE album.id = :id", Album.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }

    @Override
    public List<Album> getAll() {
        TypedQuery<Album> query = entityManager.createQuery("SELECT albums FROM Album albums", Album.class);
        return query.getResultList();
    }
}
