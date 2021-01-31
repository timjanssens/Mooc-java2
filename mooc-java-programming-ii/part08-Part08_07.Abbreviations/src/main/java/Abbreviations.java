
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author timja
 */
public class Abbreviations {
    
    private HashMap<String, String> dictionary;

    public Abbreviations() {
        this.dictionary = new HashMap<>();
    }
    
    public void addAbbreviation(String abreviation, String explanation){
        if(hasAbbreviation(abreviation)){
            System.out.println("Abbreviation is allready in the list");
        } else{
            this.dictionary.put(abreviation, explanation);
        }
    }
    
    public boolean hasAbbreviation(String abbreviation){
        return this.dictionary.containsKey(abbreviation);
    }
    
    public String findExplanationFor(String abbreviation){
        if (hasAbbreviation(abbreviation)) {
            return this.dictionary.get(abbreviation);
        } 
        return null;
    }
    
    
}
