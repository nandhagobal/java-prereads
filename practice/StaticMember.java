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
class Student{
    static String school;
    String name;
    int age;
    static {
        school="ABC school";
    }
    public void show(){
        System.out.println(name +" " + age +" "+ school);
    }
}
public class StaticMember {
    public static void main(String arg[]){
        Student s=new Student ();
        Student s1=new Student ();
        s.name="nandha";
        s.age=20;
        s1.name = "gobal";
        s1.age=21;
        s.show();
        s1.show();
    }
}
