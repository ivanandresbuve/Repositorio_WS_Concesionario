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
import javax.swing.text.Document;


public class Concesionario {
    
    public String ConsultarPrimerAuto(){
    
            MongoClient Cliente;
            MongoClientURI uri = new MongoClientURI("mongodb://userLab7:passworduserLab7@93.188.167.110:27017/?authSource=lab7");
            Cliente = new MongoClient(uri);
            MongoDatabase db;
            db = Cliente.getDatabase("Lab7");
            MongoCollection<org.bson.Document> Vehiculo = db.getCollection("Carros");
            return Vehiculo.find().first().toJson();
          
      }

}
