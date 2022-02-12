/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;

/**
 *
 * @author HP
 */
class Sample2{
    public void method(){
        System.out.println("Printing from sample2.method()");
    }
}
public class Overriding extends Sample2{
    public void method(){
        //super.method();
        System.out.println("Printing from Overriding.method()");
    }
    public static void main(String arg[]){
        Overriding obj=new Overriding();
        obj.method();
    }
}
