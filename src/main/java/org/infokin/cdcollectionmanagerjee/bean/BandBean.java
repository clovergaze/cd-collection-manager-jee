package org.infokin.cdcollectionmanagerjee.bean;

import org.infokin.cdcollectionmanagerjee.model.Band;
import org.infokin.cdcollectionmanagerjee.service.BandService;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class BandBean implements Serializable {

    /*----------
    | Services |
    ----------*/

    @Inject
    private BandService bandService;

    /*------------------
    | Member variables |
    ------------------*/

    private String newBandName;

    private boolean editable;
    private Band selectedBand;

    /*---------
    | Methods |
    ---------*/

    public void createBand() {
        Band band = new Band(newBandName);
        bandService.createBand(band);
        newBandName = "";
    }

    public List<Band> getAllBands() {
        return bandService.getAllBands();
    }

    public void editBand(Band band) {
        selectedBand = band;
        editable = true;
    }

    public void cancelEditBand() {
        selectedBand = null;
        editable = false;
    }

    public void saveBand() {
        bandService.updateBand(selectedBand);
        editable = false;
    }

    public void deleteBand(Band band) {
        bandService.deleteBand(band);
    }

    /*---------------------
    | Getters and Setters |
    ---------------------*/

    public String getNewBandName() {
        return newBandName;
    }

    public void setNewBandName(String newBandName) {
        this.newBandName = newBandName;
    }

    public Band getSelectedBand() {
        return selectedBand;
    }

    public boolean isEditable() {
        return editable;
    }
}
