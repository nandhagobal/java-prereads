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
public class Exceptions {
    public static void main(String arg[]){
        int i=5,j=0;
        try{
            int k=i/j;
            System.out.println(k);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Program is executed successfully");
        }
    }
}
