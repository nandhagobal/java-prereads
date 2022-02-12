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
abstract class Sample6{
    public abstract void show();
}
public class Abstract extends Sample6{
    @Override
    public void show() {
        System.out.println("show method");
    }
    public static void main(String arg[]){
        Abstract a=new Abstract();
        a.show();
    }
}
