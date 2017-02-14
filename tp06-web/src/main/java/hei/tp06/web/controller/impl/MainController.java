package hei.tp06.web.controller.impl;

import hei.tp06.core.entity.Evenement;
import hei.tp06.core.service.EvenementService;
import hei.tp06.web.controller.RestController;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by Thomas on 14/02/2017.
 */

@Named
@Path("/evenements")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MainController implements RestController {

    private static final Logger logger = (Logger) LoggerFactory.getLogger(MainController.class);

    @Inject
    private EvenementService evenementService;

    @GET
    @Path("/")
    public List<Evenement> getAllEvenement() {
        logger.info("Demande des événements");
        return evenementService.findAll();
    }

    @GET
    @Path("/{idEvenement}")
    public Evenement getEvenementById(@PathParam("idEvenement") long id){
        logger.info("Demande de l'événement avec l'id : "+id);
        return evenementService.findById(id);
    }

    @POST
    @Path("/")
    public void addEvenement(Evenement evenement){
        evenementService.saveEvenement(evenement);
    }

}
