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
import javax.ws.rs.PathParam;
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
    @GET
    @Path("EliminarMoto/id/{id}")
    @Produces({"applicaction/json"})
    
    public String EliminarMoto(@PathParam("id") String id){
      
        Concesionario Conce4 = new Concesionario();
        return Conce4.EliminarMoto(id);
       
    }     
    @GET
    @Path("ActualizarEmpleado/id/{id}/nombre/{nombre}/apellidos/{apellidos}/cedula/{cedula}")
    @Produces({"applicaction/json"})
    
    public String ActualizarEmpleado (@PathParam("id") String id, @PathParam("nombre") String nombre, @PathParam("apellidos") String apellidos, @PathParam("cedula") String cedula){
        
        Concesionario Conce5  = new Concesionario();
        return Conce5.ActualizarEmpleado(id,nombre,apellidos, cedula);
    }
    
    @GET
    @Path("MostrarColeccion")
    @Produces({"applicaction/json"})
    
    public String MostrarUltimoDocumento(){
        
        Concesionario Conce2 = new Concesionario();
        return Conce2.MostrarUltimoDocumento();
    }
    
    
      @GET
    @Path("MostrarColeccion")
    @Produces({"applicaction/json"})
    
    public String MostratUltimosCincoDocumnetos(){
        
        Concesionario Conce3 = new Concesionario();
        return Conce3.MostratUltimosCincoDocumnetos();
    }
}
