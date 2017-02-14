package hei.tp06.core.dao;

import hei.tp06.core.entity.Evenement;

import java.util.List;

/**
 * Created by Thomas on 14/02/2017.
 */
public interface EvenementDAO {
    List<Evenement> findAll();

    Evenement findById(long id);

    void save(Evenement evenement);
}
