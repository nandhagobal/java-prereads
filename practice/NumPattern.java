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
public class NumPattern {
    public static void main(String arg[]){
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }
}
