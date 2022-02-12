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
class Sample1{
    public void method(){
        System.out.println("method with no parameter called");
    }
    public void method(int n){
        System.out.println("method with 1 parameter called");
    }
    public void method(int n,double k){
        System.out.println("method with int and double parameter called");
    }
}
public class Overloading {
    public static void main(String arg[]){
    Sample1 s=new Sample1();
    s.method(1);
    s.method();
    s.method(1,3.3);
    }
}
