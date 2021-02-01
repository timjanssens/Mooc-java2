/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author timja
 */
public class LicensePlate {

    // these instance variables have been defined as final, meaning
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    @Override
    public boolean equals(Object object) {

        if (this == object) {
            return true;
        }

        if (!(object instanceof LicensePlate)) {
            return false;
        }

        LicensePlate plate = (LicensePlate) object;

        if (this.liNumber.equals(plate.liNumber)
                && this.country.equals(plate.country)) {
            return true;
        }

        return false;

    }

    
    public int hashCode() {
        if (this.liNumber == null) {
            return this.country.hashCode();
        }
        return this.country.hashCode() + this.liNumber.hashCode();
    }

}
