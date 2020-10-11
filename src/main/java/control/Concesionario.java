/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package control;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Updates.combine;
import static com.mongodb.client.model.Updates.set;
import javax.swing.text.Document;
import org.bson.types.ObjectId;


public class Concesionario {
    
    public String ConsultarPrimerAuto(){
    
            MongoClient Cliente;
            MongoClientURI uri = new MongoClientURI("mongodb://userLab7:passworduserLab7@93.188.167.110:27017/?authSource=lab7");
            Cliente = new MongoClient(uri);
            MongoDatabase db;
            db = Cliente.getDatabase("lab7");
            MongoCollection<org.bson.Document> Vehiculo = db.getCollection("Carros");
            return Vehiculo.find().first().toJson();
          
      }
public String EliminarMoto(String id){
    
            MongoClient Cliente;
            MongoClientURI uri = new MongoClientURI("mongodb://userLab7:passworduserLab7@93.188.167.110:27017/?authSource=lab7");
            Cliente = new MongoClient(uri);
            MongoDatabase db;
            db = Cliente.getDatabase("lab7");
            MongoCollection<org.bson.Document> Vehiculo = db.getCollection("Motos");
            Vehiculo.deleteOne(eq("_id", new ObjectId(id)));
            return "";
          
      }

 public String ActualizarEmpleado(String id, String nombre) {
 
     MongoClient Cliente;
            MongoClientURI uri = new MongoClientURI("mongodb://userLab7:passworduserLab7@93.188.167.110:27017/?authSource=lab7");
            Cliente = new MongoClient(uri);
            MongoDatabase db;
            db = Cliente.getDatabase("lab7");
            MongoCollection<org.bson.Document> Vehiculo = db.getCollection("Empleados");
            Vehiculo.updateOne(eq("_id", new ObjectId(id)), combine(set("nombre", nombre)));
            return "";
}
}
