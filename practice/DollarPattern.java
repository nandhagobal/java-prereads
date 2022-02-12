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
public class DollarPattern {
    public static void main(String arg[]){
        int n=6;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((i==0 || i==n-1)) System.out.print("$");
                else{
                    if(j==0 || j==n-1) System.out.print("$");
                    else System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
