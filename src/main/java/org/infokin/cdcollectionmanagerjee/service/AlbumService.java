package org.infokin.cdcollectionmanagerjee.service;

import org.infokin.cdcollectionmanagerjee.model.Album;
import org.infokin.cdcollectionmanagerjee.repository.AlbumRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class AlbumService {

    /*--------------
    | Repositories |
    --------------*/

    @Inject
    private AlbumRepository albumRepository;

    /*---------
    | Methods |
    ---------*/

    public void createAlbum(Album album) {
        albumRepository.save(album);
    }

    public List<Album> getAllAlbums() {
        return albumRepository.getAll();
    }

    public void updateAlbum(Album album) {
        albumRepository.update(album);
    }

    public void deleteAlbum(Album album) {
        albumRepository.delete(album);
    }
}
