/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentosjava;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author rauli
 */
public class FundamentosJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer x = 5;
        Integer y = 10;
        Integer z =5;
        Short a = 5;
        Integer newA = new Integer(5);
        /** Integer Examples **/
        System.out.println("-- Ejemplo equals --");
        System.out.println(x.equals(y));  
        System.out.println(x.equals(z)); 
        System.out.println(x.equals(a));
        System.out.println(newA.equals(a));
        System.out.println(newA.equals(y));
        System.out.println("-- Ejemplo compareTo --");
        System.out.println(x.compareTo(y));
        System.out.println(x.compareTo(z));
        System.out.println(x.compareTo(newA));
        System.out.println(x.compareTo(5));
        /** String Examples **/
        System.out.println("-- Ejemplo Split--");
        String someStr = "Es un string no un array";
        String[] strArray = someStr.split("");
        String arrayStr = "";
        System.out.println(Arrays.toString(strArray));
        System.out.println("-- Ejemplo revert --");
        List strArrayList = Arrays.asList(strArray);
        Collections.reverse(strArrayList);
        System.out.println(Arrays.toString(strArrayList.toArray()));
        System.out.println("-- Ejemplo replace --");
        System.out.println("Remplazar la eee".replace("eee", "palabra"));
        /** Array Examples **/
        System.out.println("-- Ejemplo Array Primitivo --");
        int[] intPrimeArray = {1,3,5,6,8,9,4,4,2,5,21,3,45,76,9};
        Arrays.sort(intPrimeArray);
        List intPrimeArrayList = Arrays.asList(intPrimeArray);
        System.out.println(Arrays.toString(intPrimeArrayList.toArray()));
        System.out.println("-- Ejemplo array ordenado --");
        Integer[] intArray = {1,3,5,6,8,9,4,4,2,5,21,3,45,76,9};
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));
        List intArrayList = Arrays.asList(intArray);
        Collections.reverse(intArrayList);
        System.out.println("-- Ejemplo array ordenado de mayor a menor--");
        System.out.println(Arrays.toString(intArrayList.toArray()));
        System.out.println("-- Ejemplo array lleno de 10 --");
        int[] emptyArray = new int[50];
        Arrays.fill(emptyArray, 1);
        System.out.println(Arrays.toString(emptyArray));
        System.out.println("-- Ejemplo array primeros y ultimos 10 de 10 y de 11 a 39 20 --");
        Arrays.fill(emptyArray, 10, 39, 2);
        System.out.println(Arrays.toString(emptyArray));
        System.out.println("-- Ejemplo array primeros y ultimos 10 de 10, de 11 a 20 y de 31 a 40, 20 y de 20 a 30, 30 --");
        Arrays.fill(emptyArray, 20, 29, 3);
        System.out.println(Arrays.toString(emptyArray));
        
        /** Example Objects **/
        Person harry = new Person("Harry", 23, 'M');
        harry.buyMascot(new Dog("Fido"));
        Mascot unknow = new Dog("name");
        //((Fish)unknow).swim();
        harry.goParkWithMascot();
        Person amanda = new Person("Amanda", 29, 'F');
        amanda.buyMascot(new Cat("Grumpy"));
        amanda.goParkWithMascot();
        Person juan = new Person();
        juan.goParkWithMascot();
        juan.buyMascot(new Fish("Bubbles"));
        juan.goParkWithMascot();
    }
    
}
