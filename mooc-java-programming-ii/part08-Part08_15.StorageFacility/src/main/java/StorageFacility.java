
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import static java.util.Spliterators.iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author timja
 */
public class StorageFacility {

    private HashMap<String, ArrayList<String>> unit;

    public StorageFacility() {
        this.unit = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.unit.putIfAbsent(unit, new ArrayList<>());
        this.unit.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        return this.unit.getOrDefault(storageUnit, new ArrayList<>());
    }

    public void remove(String storageUnit, String item) {
        for (ArrayList<String> itemList : this.unit.values()) {
            itemList.remove(item);
        }
        
        //method to remove line in hashmap when it has no value
        Iterator<String> iterator = unit.keySet().iterator();
        while (iterator.hasNext()) {
            if (unit.get(iterator.next()).size() < 1) {
                iterator.remove();
            }
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> units = new ArrayList<>();
        units.addAll(this.unit.keySet());
        return units;

    }

}
