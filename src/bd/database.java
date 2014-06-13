/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bd;

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Resource;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import jena.Resources;
import jena.AvesVocabulario;
/**
 *
 * @author roddycorrea
 */
public class database {
    Connection con;
    String server = "jdbc:mysql://localhost:3306/avesdb";
    String user = "root";
    String pass = "qwerty";
    Resources recurso = new Resources();

    public void conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(server, user, pass);
        } catch (Exception e) {
            System.out.println("Se produjo un error en la conexión: " + e.getMessage());
        }
    }

    public void consulta() {
        conexion();
        try {
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM aves");
            Model model = ModelFactory.createDefaultModel();
            int num = 1;
            while (rs.next()) {
                
                /*recurso.getRecurso(rs.getString("speciesName"), rs.getString("phylumName"), rs.getString("ordenName"), rs.getString("familyName"), rs.getString("kingdomName"),  rs.getString("genusName"), rs.getInt("poseeRiquezaAves"), 
                        rs.getString("poseeDatosInsectos"), rs.getFloat("poseeDatosFrutos"),rs.getFloat("poseeDatosFlores"), rs.getString("numMuestra"),rs.getInt("numParcela"), rs.getFloat("hasTempAbove"), rs.getFloat("hasTempMedium"), 
                        rs.getFloat("hasTempCold"),  rs.getFloat("hasHeavyValue"), rs.getFloat("hasMediumValue"), rs.getFloat("hasLightValue"));
            */
            
        try {
            
            Resource resources_pob
                    = model.createResource(AvesVocabulario.getURI().concat("aves_"+num))
                    .addProperty(AvesVocabulario.speciesName, model.createResource(AvesVocabulario.getURI().concat((rs.getString("speciesName")))))
                    .addProperty(AvesVocabulario.phylumName, model.createResource(AvesVocabulario.getURI().concat(rs.getString("phylumName"))))
                    .addProperty(AvesVocabulario.orderName, model.createResource(AvesVocabulario.getURI().concat(rs.getString("ordenName"))))
                    .addProperty(AvesVocabulario.familyName, model.createResource(AvesVocabulario.getURI().concat(rs.getString("familyName"))))
                    .addProperty(AvesVocabulario.kingdomName, model.createResource(AvesVocabulario.getURI().concat(rs.getString("kingdomName"))))
                    .addProperty(AvesVocabulario.genusName, model.createResource(AvesVocabulario.getURI().concat(rs.getString("genusName"))))
                    .addProperty(AvesVocabulario.poseeRiquezaAves, model.createResource(AvesVocabulario.getURI().concat(Integer.toString(rs.getInt("poseeRiquezaAves")))))
                    .addProperty(AvesVocabulario.poseeDatosInsectos, model.createResource(AvesVocabulario.getURI().concat(rs.getString("poseeDatosInsectos"))))
                    .addProperty(AvesVocabulario.poseeDatosFrutos, model.createResource(AvesVocabulario.getURI().concat(Float.toString(rs.getFloat("poseeDatosFrutos")))))
                    .addProperty(AvesVocabulario.poseeDatosFlores, model.createResource(AvesVocabulario.getURI().concat(Float.toString(rs.getFloat("poseeDatosFlores")))))
                    .addProperty(AvesVocabulario.numMuestra, model.createResource(AvesVocabulario.getURI().concat(rs.getString("numMuestra"))))
                    .addProperty(AvesVocabulario.numParcela, model.createResource(AvesVocabulario.getURI().concat(Integer.toString(rs.getInt("numParcela"))))) 
                    .addProperty(AvesVocabulario.hasTemAbove, model.createResource(AvesVocabulario.getURI().concat(Float.toString(rs.getFloat("hasTempAbove")))))
                    .addProperty(AvesVocabulario.hasTemMedium, model.createResource(AvesVocabulario.getURI().concat(Float.toString(rs.getFloat("hasTempMedium")))))
                    .addProperty(AvesVocabulario.hasTemCold, model.createResource(AvesVocabulario.getURI().concat(Float.toString(rs.getFloat("hasTempCold")))))
                    .addProperty(AvesVocabulario.hasHeavyValue, model.createResource(AvesVocabulario.getURI().concat(Float.toString(rs.getFloat("hasHeavyValue")))))
                    .addProperty(AvesVocabulario.hasMediumValue, model.createResource(AvesVocabulario.getURI().concat(Float.toString(rs.getFloat("hasMediumValue")))))
                    .addProperty(AvesVocabulario.hasLightValue, model.createResource(AvesVocabulario.getURI().concat(Float.toString(rs.getFloat("hasLightValue")))));
            
        } catch (Exception e) {
            System.out.println("Error en datos:" + e);
        }
            num++;
            }
            model.write(new PrintWriter(System.out));
            rs.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);

        }
    }
}
