package hei.tp06.core.service.impl;

import hei.tp06.core.dao.EvenementDAO;
import hei.tp06.core.entity.Evenement;
import hei.tp06.core.service.EvenementService;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

/**
 * Created by Thomas on 14/02/2017.
 */
@Named
@Transactional
public class EvenementServiceImpl implements EvenementService{

    @Inject
    private EvenementDAO evenementDAO;

    @Override
    public List<Evenement> findAll() {
        return evenementDAO.findAll();
    }

    @Override
    public Evenement findById(long id) {
        return evenementDAO.findById(id);
    }

    @Override
    public void saveEvenement(Evenement evenement) {
        evenementDAO.save(evenement);
    }
}
