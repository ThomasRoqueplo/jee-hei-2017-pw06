package hei.tp06.core.dao;

import hei.tp06.core.entity.Evenement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Thomas on 14/02/2017.
 */
public interface EvenementDAO extends JpaRepository<Evenement, Long> {

    List<Evenement> findAll();

    Evenement findById(long id);
}
