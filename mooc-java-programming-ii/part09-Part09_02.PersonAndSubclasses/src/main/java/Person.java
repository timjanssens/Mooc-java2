/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author timja
 */
public class Person {
    
    private String name;
    private String addres;

    public Person(String name, String addres) {
        this.name = name;
        this.addres = addres;
    }

    @Override
    public String toString() {
        return this.name + "\n  " +  this.addres;
    }
    
    
    
    
}
