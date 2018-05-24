package org.infokin.cdcollectionmanager.service;

import org.infokin.cdcollectionmanager.model.Band;
import org.infokin.cdcollectionmanager.repository.BandRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class BandService {

    @Inject
    private BandRepository bandRepository;

    public void createBand(Band band) {
        bandRepository.save(band);
    }

    public List<Band> getAllBands() {
        return bandRepository.getAll();
    }

    public void updateBand(Band band) {
        bandRepository.update(band);
    }

    public void deleteBand(Band band) {
        bandRepository.delete(band);
    }
}
