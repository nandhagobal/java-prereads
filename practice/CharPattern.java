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
public class CharPattern {
    public static void main(String arg[]){
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=65;j<i+66;j++){
                char a=(char)j;
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }
}
