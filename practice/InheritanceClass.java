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
class Parent{
    public void show(){
        System.out.println("show method");
    }
}
public class InheritanceClass extends Parent {
    public void display(){
        System.out.println("display method");
    }
    public static void main(String arg[]){
        InheritanceClass obj=new InheritanceClass();
        obj.show();
        obj.display();
    }
}
