
import java.util.ArrayList;
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
public class VehicleRegistry {

    private HashMap<LicensePlate, String> platesWithOwners;

    public VehicleRegistry() {
        this.platesWithOwners = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (!(platesWithOwners.containsKey(licensePlate))) {
            platesWithOwners.put(licensePlate, owner);
            return true;
        }
        return false;
    }

    public String get(LicensePlate licensePlate) {
        if (!(platesWithOwners.containsKey(licensePlate))) {
            return null;
        }
        return platesWithOwners.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (!(platesWithOwners.containsKey(licensePlate))) {
            return false;
        }

        platesWithOwners.remove(licensePlate);
        return true;
    }

    public void printLicensePlates() {

        for (LicensePlate plate : this.platesWithOwners.keySet()) {
            System.out.println(plate);
        }

    }

    public void printOwners() {

        ArrayList<String> owners = new ArrayList<>();

        for (String owner : this.platesWithOwners.values()) {
            if (owners.isEmpty()) {
                owners.add(owner);
                System.out.println(owner);
            } else {
                for (int i = 0; i < owners.size(); i++) {
                    if (!(owner.equals(owners.get(i)))) {
                        owners.add(owner);
                        System.out.println(owner);
                    }
                }
            }

        }
    }

}
