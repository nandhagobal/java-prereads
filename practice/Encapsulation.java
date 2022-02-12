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
class Sample5{
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
}
public class Encapsulation {
    public static void main(String arg[]){
        Sample5 s=new Sample5();
        s.setNum(5);
        int k=s.getNum();
        System.out.println(k);
    }
}
