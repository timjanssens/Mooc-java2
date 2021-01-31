
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
public class IOU {

    private HashMap<String, Double> overview;

    public IOU() {
        this.overview = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {

        this.overview.put(toWhom, amount);
        
    }

    public double howMuchDoIOweTo(String toWhom) {

//        for(String name : this.overview.keySet()){
//            
//        }
        
        return this.overview.getOrDefault(toWhom, 0.0);
        
    }

}
