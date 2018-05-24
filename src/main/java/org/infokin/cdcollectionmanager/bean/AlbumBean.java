package org.infokin.cdcollectionmanager.bean;

import org.infokin.cdcollectionmanager.model.Album;
import org.infokin.cdcollectionmanager.model.Band;
import org.infokin.cdcollectionmanager.service.AlbumService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
@RequestScoped
public class AlbumBean {

    @Inject
    private AlbumService albumService;

    private String newAlbumName;
    private Band newBand;

    public List<Album> getAllAlbums() {
        return albumService.getAllAlbums();
    }

    public String createAlbum() {
        Album album = new Album(newAlbumName, newBand);
        albumService.createAlbum(album);

        return "albums?faces-redirect=true";
    }

    public String getNewAlbumName() {
        return newAlbumName;
    }

    public void setNewAlbumName(String newAlbumName) {
        this.newAlbumName = newAlbumName;
    }

    public Band getNewBand() {
        return newBand;
    }

    public void setNewBand(Band newBand) {
        this.newBand = newBand;
    }
}
