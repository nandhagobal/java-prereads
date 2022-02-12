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
class Sample4{
    public void method(){
        System.out.println("Printing from sample2.method()");
    }
}
public class DynamicDispatch extends Sample4{
    public void method(){
        //super.method();
        System.out.println("Printing from DynamicDispatch.method()");
    }
    public static void main(String arg[]){
        Sample4 obj=new DynamicDispatch();
        obj.method();
    }
}

