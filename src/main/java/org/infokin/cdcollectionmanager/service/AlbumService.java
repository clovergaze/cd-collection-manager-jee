package org.infokin.cdcollectionmanager.service;

import org.infokin.cdcollectionmanager.model.Album;
import org.infokin.cdcollectionmanager.repository.AlbumRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class AlbumService {

    @Inject
    private AlbumRepository albumRepository;

    public List<Album> getAllAlbums() {
        return albumRepository.getAll();
    }

    public void createAlbum(Album album) {
        albumRepository.save(album);
    }
}
