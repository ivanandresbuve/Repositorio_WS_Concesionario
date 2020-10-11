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
    @Path("EliminarMoto/id/{id}/nombre/{nombre}/apellidos/{apellidos}/cedula/{cedula}/direccion/descripcion/{descripcion}/barrio/{barrio}/puesto/{puesto}/Contrato/{contrato}/sueldo/{sueldo}")
    @Produces({"applicaction/json"})
    
    public String ActualizarEmpleado (@PathParam("id") String id, @PathParam("nombre") String nombre, @PathParam("pellidos") String apellidos, @PathParam("cedula") String cedula,
            @PathParam("descripcion") String descripcion, @PathParam("barrio") String barrio, @PathParam("puesto") String puesto,
            @PathParam("Contrato") String Contrato, @PathParam("Sueldo") String Sueldo){
        
        Concesionario Conce5  = new Concesionario();
        return Conce5.ActualizarEmpleado(id,nombre,apellidos, cedula,descripcion, barrio, puesto, Contrato, Sueldo);
    }
    
}
