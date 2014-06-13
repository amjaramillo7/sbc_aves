
package jena;

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Resource;
import java.io.PrintWriter;
import bd.database;

/**
 *
 * @author amjaramillo7
 */
public class Resources {
 
    public static void main(String[] args) {
        database resultado = new database();
        resultado.consulta();
    }

    /*public void getRecurso(String speciesName, String phylumName, String ordenName, String familyName, String kingdomName, String genusName, int poseeRiquezaAves, 
            String poseeDatosInsectos, float poseeDatosFrutos, float poseeDatosFlores, String numMuestra, int numParcela, float hasTempAbove,float hasTempMedium, float hasTempCold,float hasHeavyValue,
            float hasMediumValue,float hasLightValue) {
        String Resource = "aves";
        String resource_speciesName = speciesName;
        String resource_phylumName = phylumName;
        String resource_ordenName = ordenName;
        String resource_familyName = familyName;
        String resource_kingdomName = kingdomName;
        String resource_genusName = genusName;
        int resource_poseeRiquezaAves = poseeRiquezaAves;
        String resource_poseeDatosInsectos= poseeDatosInsectos;
        float resource_poseeDatosFrutos= poseeDatosFrutos;
        float resource_poseeDatosFlores = poseeDatosFlores;
        String resource_numMuestra = numMuestra;
        int resource_numParcela = numParcela;
        float resource_hasTempAbove = hasTempAbove;
        float resource_hasTempMedium = hasTempMedium;
        float resource_hasTempCold = hasTempCold;
        float resource_hasHeavyValue = hasHeavyValue;
        float resource_hasMediumValue = hasMediumValue;
        float resource_hasLightValue = hasLightValue;
        System.out.println(""+familyName);
      //  System.out.println(""+hasLightValue);
        
    }*/
}
