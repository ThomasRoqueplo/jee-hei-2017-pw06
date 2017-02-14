package hei.tp06.core.service;

import hei.tp06.core.entity.Evenement;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Named;
import java.util.List;

/**
 * Created by Thomas on 14/02/2017.
 */
@Named
@Transactional
public interface EvenementService {

    List<Evenement> findAll();

    Evenement findById(long id);

    void saveEvenement(Evenement evenement);
}
