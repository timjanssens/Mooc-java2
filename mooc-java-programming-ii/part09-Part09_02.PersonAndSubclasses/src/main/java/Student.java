/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author timja
 */
public class Student extends Person{

    private int credits;
    
    public Student(String name, String addres) {
        super(name, addres);
        this.credits = 0;
    }
    
    public int credits(){
        return this.credits;
    }
    
    public void study(){
        this.credits++;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  Study credits " + this.credits;
    }
    
    
    
}
