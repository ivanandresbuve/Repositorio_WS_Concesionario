/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import control.Concesionario;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 */
@Path("swr_concesionario")
public class Swr_concesionario {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of Swr_concesionario
     */
    public Swr_concesionario() {
        
    }
    
    @GET
    @Path("consultarVehiculo")
    @Produces({"applicaction/json"})
    
    public String consultarVehiculo(){
        
        Concesionario Conces = new Concesionario();
        
        return Conces.ConsultarPrimerAuto();
       
    }
}
