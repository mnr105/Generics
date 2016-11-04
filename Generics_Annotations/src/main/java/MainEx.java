import Ex1.Alg;
import Ex1.Test;
import Ex10.Circle;
import Ex10.Node;
import Ex10.Shape;
import Ex12.Ex12;
import Ex12.RelativelyPrimePredicate;
import Ex12.UnaryPredicate;
import Ex2.Algorithm;
import Ex3.SwitchElem;
import Ex4.Question;
import Ex5.Answear;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static Ex1.Alg.test;

/**
 * Created by lluca on 02-Nov-16.
 */

public class MainEx {

    public static void main(String[] args) {
        List x = new ArrayList();
        x.add("ionnoi");
        x.add("qoanoi");
        x.add("abi");
        x.add("capac");
        //System.out.println(x);

        System.out.println("////////////////////1///////////////");
        Test test = new Test();
        System.out.println(test.VerificaPalindrom(12621));

        Alg Rez = new Alg();
        System.out.println(Rez.count(x));

        System.out.println("////////////////////2///////////////");
        Algorithm alg = new Algorithm();
        alg.max(3, 5);

        System.out.println("////////////////////3.0///////////////");
        SwitchElem swe = new SwitchElem();
        swe.schimbaVar1(x);
        System.out.println(x);

        System.out.println("////////////////////3.1///////////////");
        Integer[] ceva = {1, 2, 3, 4, 65, 67};
        for (Integer i : ceva) {
            System.out.print(i.toString() + ",");
        }
        swe.schimbaVar2(ceva, 2, 4);
        System.out.println();
        for (Integer i : ceva) {
            System.out.print(i.toString() + ",");
        }

      /*  String[] ceva2 = {"ion", "capcac", "kdmalskd", "dsa", "aaassssaaa"};
        for (String i : ceva2) {
            System.out.print(i.toString() + ",");
        }
        swe.schimbaVar2(ceva2, 2, 4);
        System.out.println();
        for (String i : ceva2) {
            System.out.print(i.toString() + ",");
        }*/

        System.out.println("");
        System.out.println("////////////////////4///////////////");
        Question qus = new Question();
        System.out.println("Raspuns:");
        qus.answear();

        System.out.println("////////////////////5///////////////");
        Answear rasp = new Answear();
        rasp.AnsShow();

        System.out.println("////////////////////6///////////////");
        System.out.println("Din up-cast-ul parametrului generic al metodei se urca la Bounded-ul lui astfel ajungandu-se la Comparable (sa se scuze exprimarea :) ");
        System.out.println("public static int findFirstGreaterThan(Comparable[] at, Comparable elem) ");

        System.out.println("////////////////////7///////////////");
        Ex7 ex = new Ex7();
        List<Integer> cece = new ArrayList<Integer>();
        cece.add(2);
        cece.add(7);
        cece.add(7);
        cece.add(8);
        cece.add(2);
        cece.add(2);
        ex.print(cece);

        System.out.println("////////////////////8///////////////");
        Ex8 ex1 = new Ex8();
        List<Integer> cece1 = new ArrayList<Integer>();
        cece1.add(2);
        cece1.add(7);
        cece1.add(7);
        cece1.add(8);
        cece1.add(2);
        cece1.add(2);
        System.out.println("Elementul maxim este: " + ex1.max(cece1, 2, 5));

        System.out.println("/////////////////////9/////////////////");
        Singleton sing = new Singleton();
       // System.out.println("!!!!!!!!!!!!");
        sing.answear();

        /////////////////////10/////////////////
      /*  Node<Circle> nc = new Node<>();
        Node<Shape> ns = nc;
        // Eroare, node<circle>nu este clasa copil a clasei node<shape>


        /////////////////////11/////////////////
        Node<String> node = new Node<>();
        Comparable<String> comp = node;
        // Eroare: nu se poate folosi conceptul Diamond la nivelul acesta.*/


        System.out.println("////////////////////12///////////////");
        List<Integer> li = Arrays.asList(3, 4, 6, 8, 11, 15, 28, 32);
        Collection<Integer> c = Arrays.asList(7, 18, 19, 25);
        UnaryPredicate<Integer> p = new RelativelyPrimePredicate(c);

        int i = Ex12.findFirst(li, 0, li.size(), p);

        if (i != -1) {
            System.out.print(li.get(i) + " is relatively prime to ");
            for (Integer k : c)
                System.out.print(k + " ");
            System.out.println();
        }
    }

}



