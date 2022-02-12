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
public class ArrayClass {
    public static void main(String arg[]){
        int arr[]={12,23,34,54};
        for(int x : arr){
            System.out.print(x+" ");
        }
        System.out.println();
        int arr2[][]={
            {1,2,3},{2,3,4},{5,6,4}              
        };
        for(int x[] : arr2){
            for(int a : x){
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }
}
