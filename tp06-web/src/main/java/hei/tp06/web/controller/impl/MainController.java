package hei.tp06.web.controller.impl;

import hei.tp06.core.entity.Evenement;
import hei.tp06.core.service.EvenementService;
import hei.tp06.web.controller.RestController;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by Thomas on 14/02/2017.
 */

@Named
@Path("/evenements")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MainController implements RestController {

    //private static final Logger logger = LoggerFactory.getLogger(MainController.class);

    @Inject
    private EvenementService evenementService;

    @GET
    @Path("")
    public List<Evenement> getEvenements()
    {
        return evenementService.findAll();
    }

    @GET
    @Path("/{id}")
    public Evenement getEvenement(@PathParam("id") Long id) {
        return evenementService.findById(id);
    }

    @POST
    @Path("")
    public void postEvenements(Evenement evenement) {
        evenementService.saveEvenement(evenement);
    }

}
