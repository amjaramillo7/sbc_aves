/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jena;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.rdf.model.impl.PropertyImpl;
import com.hp.hpl.jena.rdf.model.impl.ResourceImpl;

/**
 *
 * @author amjaramillo7
 */
public class AvesVocabulario extends Object {
    protected static final String aves = "http://reservaecologicaarenillas/aves/";
 
// Return URI for vocabulary elements
    public static String getURI() {
        return aves;

    }
    //Se definen las Clases
    public static Resource Aves = null;
    static final String nAves = "Aves";

    public static Resource ZooTaxonomy = null;
    static final String nZooTaxonomy = "ZooTaxonomy";

    public static Resource Kingdom = null;
    static final String nKingdom = "Kingdom";

    public static Resource Phylum = null;
    static final String nPhylum = "Phylum";

    public static Resource Genus = null;
    static final String nGenus = "Genus";

    public static Resource Family = null;
    static final String nFamily = "Family";
    
    public static Resource Order = null;
    static final String nOrder = "Order";
    
    public static Resource Species = null;
    static final String nSpecies = "Species";

    public static Resource TaxonName = null;
    static final String nTaxonName = "TaxonName";

    public static Resource Parcelas = null;
    static final String nParcelas = "Parcelas";

    public static Resource Muestra = null;
    static final String nMuestra = "Muestra";

    public static Resource Habitat = null;
    static final String nHabitat = "Habitat";

    public static Resource WeatherState = null;
    static final String nWeatherState = "WeatherState";
    
    public static Resource Temperature = null;
    static final String nTemperature = "Temperature";
    
    public static Resource Precipitation = null;
    static final String nPrecipitation = "Precipitation";
   


  
//Se definen las Propiedades
 
static final String nhasTaxonomy = "hasTaxonomy";
    public static Property hasTaxonomy = null;
    static final String nname = "name";
    public static Property name = null;
    static final String ncommonName = "commonName";
    public static Resource commonName = null;
    static final String nkingdom = "Kingdom";
    public static Property kingdom = null;
    static final String nkingdomName = "kingdomName";
    public static Property kingdomName = null;
    static final String nphylum = "Phylum";
    public static Property phylum = null;
    static final String nphylumName = "PhylumName";
    public static Property phylumName = null;
    static final String ngenus = "Genus";
    public static Property genus = null;
    static final String ngenusName = "GenusName";
    public static Property genusName = null;
    static final String nfamily = "Family";
    public static Property family = null;
    static final String nfamilyName = "FamilyName";
    public static Property familyName = null;
    static final String norder = "Order";
    public static Property order = null;
    static final String norderName = "OrderName";
    public static Property orderName = null;    
    static final String nspecies = "Species";
    public static Property species = null;
     static final String nspeciesName = "SpeciesName";
    public static Property speciesName = null;
    static final String nlocate = "Locate";
    public static Property locate = null;
    static final String nnumParcela = "numParcela";
    public static Property numParcela = null;
    static final String nnumMuestra = "numMuestra";
    public static Property numMuestra = null;
    static final String nposeeDatosFrutos = "poseeDatosFrutos";
    public static Property poseeDatosFrutos = null;
    static final String nposeeDatosFlores = "poseeDatosFlores";
    public static Property poseeDatosFlores = null;
    static final String nposeeDatosInsectos = "poseeDatosInsectos";
    public static Property poseeDatosInsectos = null;
    static final String nposeeRiquezaAves = "poseeRiquezaAves";
    public static Property poseeRiquezaAves = null;
    static final String nnumMes = "numMes";
    public static Property numMes = null;
    static final String nhabitat = "habitat";
    public static Property habitat = null;
    static final String nhasWeatherState = "hasWeatherState";
    public static Property hasWeatherState = null;
    static final String nhasWeatherPhenomenon = "hasWeatherPhenomenon";
    public static Property hasWeatherPhenomenon = null;
    static final String nhasPrecipitation = "hasPrecipitation";
    public static Property hasPrecipitation = null;
    static final String nhasLightValue = "hasLightValue";
    public static Property hasLightValue = null;
    static final String nhasMediumValue = "hasMediumValue";
    public static Property hasMediumValue = null;
    static final String nhasHeavyValue = "hasHeavyValue";
    public static Property hasHeavyValue = null;
    static final String nhasTemperature = "hasTemperature";
    public static Property hasTemperature = null;
    static final String nhasTemCold = "hasTemCold";
    public static Property hasTemCold = null;
    static final String nhasTemMedium = "hasTemMedium";
    public static Property hasTemMedium = null;
    static final String nhasTemAbove = "hasTemAbove";
    public static Property hasTemAbove = null;
    
    static {
        try {
            //Se instancian las clases 
            Aves = new ResourceImpl(aves, nAves);
            ZooTaxonomy = new ResourceImpl(aves, nZooTaxonomy);
            Kingdom = new ResourceImpl(aves, nKingdom);
            Phylum = new ResourceImpl(aves, nPhylum);
            Genus = new ResourceImpl(aves, nGenus);
            Family = new ResourceImpl(aves, nFamily);
            Order = new ResourceImpl(aves, nOrder);
            Species = new ResourceImpl(aves, nSpecies);
            TaxonName = new ResourceImpl(aves, nTaxonName);
            Parcelas = new ResourceImpl(aves, nParcelas);
            Muestra = new ResourceImpl(aves, nMuestra);
            WeatherState = new ResourceImpl(aves, nWeatherState);
            Temperature = new ResourceImpl(aves, nTemperature);
            Precipitation = new ResourceImpl(aves, nPrecipitation);
                       
            // Se instancian las propiedades
             hasTaxonomy = new PropertyImpl(aves, nhasTaxonomy);
            name = new PropertyImpl(aves, nname);
            familyName = new PropertyImpl(aves, nfamilyName);
            poseeRiquezaAves = new PropertyImpl(aves, nposeeRiquezaAves);
            commonName = new PropertyImpl(aves, ncommonName);
            Kingdom = new PropertyImpl(aves, nKingdom);
            kingdomName = new PropertyImpl(aves, nkingdomName);
            Phylum = new PropertyImpl(aves, nPhylum);
            phylumName = new PropertyImpl(aves, nphylumName);
            genus = new PropertyImpl(aves, ngenus);
            genusName = new PropertyImpl(aves, ngenusName);
            order = new PropertyImpl(aves, norder);
            orderName = new PropertyImpl(aves, norderName);
            species = new PropertyImpl(aves, nspecies);
            speciesName = new PropertyImpl(aves, nspeciesName);
            locate = new PropertyImpl(aves, nlocate);
            numParcela = new PropertyImpl(aves, nnumParcela);
            numMuestra = new PropertyImpl(aves, nnumMuestra);
            poseeDatosFrutos = new PropertyImpl(aves, nposeeDatosFrutos);
            poseeDatosFlores = new PropertyImpl(aves, nposeeDatosFlores);
            poseeDatosInsectos = new PropertyImpl(aves, nposeeDatosInsectos);
            numMes = new PropertyImpl(aves, nnumMes);
            habitat = new PropertyImpl(aves, nhabitat);
            hasWeatherState = new PropertyImpl(aves, nhasWeatherState);
            hasWeatherPhenomenon = new PropertyImpl(aves, nhasWeatherPhenomenon);
            hasPrecipitation = new PropertyImpl(aves, nhasPrecipitation);
            hasMediumValue = new PropertyImpl(aves, nhasMediumValue);
            hasHeavyValue = new PropertyImpl(aves, nhasHeavyValue);
            hasLightValue = new PropertyImpl(aves, nhasLightValue);
            hasTemperature = new PropertyImpl(aves, nhasTemperature);
            hasTemCold = new PropertyImpl(aves, nhasTemCold);
            hasTemMedium = new PropertyImpl(aves, nhasTemMedium);
            hasTemAbove = new PropertyImpl(aves, nhasTemAbove);
            
           
        } catch (Exception e) {
            System.out.println("Companie" + e);
        }

    }
}
