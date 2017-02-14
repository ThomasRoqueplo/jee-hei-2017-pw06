package hei.tp06.core.service.impl;

import hei.tp06.core.dao.EvenementDAO;
import hei.tp06.core.entity.Evenement;
import hei.tp06.core.service.EvenementService;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by Thomas on 14/02/2017.
 */
public class EvenementServiceImpl implements EvenementService{

    @Inject
    private EvenementDAO evenementDAO;

    public List<Evenement> findAll() {
        return evenementDAO.findAll();
    }

    public Evenement findById(long id) {
        return evenementDAO.findById(id);
    }

    public void saveEvenement(Evenement evenement) {
        evenementDAO.save(evenement);
    }
}
