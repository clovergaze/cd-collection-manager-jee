package org.infokin.cdcollectionmanager.bean;

import org.infokin.cdcollectionmanager.model.Album;
import org.infokin.cdcollectionmanager.model.Band;
import org.infokin.cdcollectionmanager.service.AlbumService;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class AlbumBean implements Serializable {

    /*----------
    | Services |
    ----------*/

    @Inject
    private AlbumService albumService;

    /*------------------
    | Member variables |
    ------------------*/

    private String newAlbumName;
    private Band newBand;

    private boolean editable;
    private Album selectedAlbum;

    /*---------
    | Methods |
    ---------*/

    public void createAlbum() {
        Album album = new Album(newAlbumName, newBand);
        albumService.createAlbum(album);
        newAlbumName = "";
        newBand = null;
    }

    public List<Album> getAllAlbums() {
        return albumService.getAllAlbums();
    }

    public void editAlbum(Album album) {
        selectedAlbum = album;
        editable = true;
    }

    public void cancelEditAlbum() {
        selectedAlbum = null;
        editable = false;
    }

    public void saveAlbum() {
        albumService.updateAlbum(selectedAlbum);
        editable = false;
    }

    public void deleteAlbum(Album album) {
        albumService.deleteAlbum(album);
    }

    /*---------------------
    | Getters and Setters |
    ---------------------*/

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

    public Album getSelectedAlbum() {
        return selectedAlbum;
    }

    public boolean isEditable() {
        return editable;
    }
}
