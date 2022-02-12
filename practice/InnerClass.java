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
class Outer{
    public void show(){
        System.out.println("In outer chass");
    }
    class Inner{
        public void show(){
            System.out.println("In inner class");
        }
    }
    static class StaticInner{
        public void show(){
            System.out.println("In StaticInner class");
        }
    }
}
public class InnerClass {
    public static void main(String arg[]){
        Outer obj=new Outer();
        obj.show();
        Outer.Inner obj1=obj.new Inner();
        obj1.show();
        Outer.StaticInner obj2=new Outer.StaticInner();
        obj2.show();
        
    }
}
