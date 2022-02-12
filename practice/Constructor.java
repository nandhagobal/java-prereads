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
class Sample{
    int num1;
    int num2;
    Sample(){
        num1=0;
        num2=0;
    }
    Sample(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
    }
    Sample(int num1){
        this.num1=num1;
        num2=0;
    }
}
public class Constructor {
    public static void main(String arg[]){
        Sample s=new Sample();
        System.out.println(s.num1+ " " + s.num2);
        Sample s1=new Sample(3,4);
        System.out.println(s1.num1+ " " + s1.num2);
        Sample s2=new Sample(4);
        System.out.println(s2.num1+ " " + s2.num2);
    }
}
