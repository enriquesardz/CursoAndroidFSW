/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentosjava;

import static com.sun.org.apache.xerces.internal.util.FeatureState.is;

/**
 *
 * @author rauli
 */
public class Person {
    String name;
    int age;
    char gender;
    Mascot mascot;

    Person(){
        this("Juan", 25, 'M');
    }
    
    Person(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    
    Person(int age, char gender, String name)
    {
        this.age = age;
        this.gender = gender;
        this.name = name;
    }
    public void buyMascot(Mascot mascot){
        this.mascot = mascot;
        System.out.println(this.name
                +" compraste una mascota llamada: "
                + mascot.name);
    }
    
    public void goParkWithMascot(){
        if ( mascot instanceof Mascot ) {
            if ( mascot instanceof Dog ){
                System.out.println(mascot.name 
                        + " esta feliz");
                mascot.makeSound();
            }else if (mascot instanceof Cat) {
                System.out.println(mascot.name 
                        + " esta enojado");
            }else{
                System.out.println(mascot.name 
                        + " no puede ir al parque");
            }
        } else {
            System.out.println("No tienes mascota");    
        }
    }
}
abstract class Mascot {
    String name;
    
    Mascot (String name){
        this.name = name;
    }
    
    public abstract void makeSound();
    
    
}

class Fish extends Mascot {

    public Fish(String name) {
        super(name);
    }
    
    public void swim(){
        System.out.println(this.name + " is swiming");
    }
    
    @Override
    public void makeSound(){
        System.out.println("Glu.... Glu!");
    }
    
}

class Dog extends Mascot {
    
    Dog(String name){
        super(name);
    }
    
    public void run(){
         System.out.println(name+" is Running");
    }
    
    public void makeSound(){
        System.out.println("Guf ... Guf");
    }
    
}

class Cat extends Mascot {
    
    Cat(String name){
        super(name);
    }
    
    public void eatLasagna(){
         System.out.println(name
                 +" is eating lasagna");
    }
    
    public void makeSound(){
        System.out.println("Meow ... Meow");
    }
    
}