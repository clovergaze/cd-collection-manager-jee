package org.infokin.cdcollectionmanagerjee.service;

import org.infokin.cdcollectionmanagerjee.model.Band;
import org.infokin.cdcollectionmanagerjee.repository.BandRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class BandService {

    /*--------------
    | Repositories |
    --------------*/

    @Inject
    private BandRepository bandRepository;

    /*---------
    | Methods |
    ---------*/

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
