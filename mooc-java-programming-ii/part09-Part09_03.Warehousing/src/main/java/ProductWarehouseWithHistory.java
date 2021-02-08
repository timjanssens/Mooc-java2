
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author timja
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {
    
    private ChangeHistory changeHistory;
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName, capacity);
        this.changeHistory = new ChangeHistory();
        this.changeHistory.add(initialBalance);
        addToWarehouse(initialBalance);
    }
    
    public String history(){
        return changeHistory.toString();
    }

    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        
        this.changeHistory.add(this.getBalance());
    }
    
    
    @Override
    public String toString() {
        return history(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
