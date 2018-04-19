package com.clouway.learning.objectsinjava;

import com.clouway.ExceptionList;
import com.clouway.crm.core.OutOfRangeException;
import com.clouway.crm.core.Store.Clerk;
import com.clouway.crm.core.Store.Worker;
import com.clouway.crm.core.Sumator;
import com.clouway.crm.core.SumatorExceptions;
import com.clouway.crm.core.Tree.HeterogeneousTree;
import com.clouway.crm.core.Tree.HomogeneousTree;

import java.math.BigDecimal;
import java.util.*;
import java.math.BigInteger;
import java.util.concurrent.ExecutionException;

public class Main {

    public static void main(String[] args) {

        /*
        Sumator sumator = new Sumator();

        System.out.println(sumator.sum(2, 2));
        System.out.println(sumator.sum((double)2.00, (double)2.34));
        System.out.println(sumator.sum("two", "three"));
        BigInteger bigIntA = new BigInteger("9911111111111");
        BigInteger bigIntB = new BigInteger("91155555555555");
        System.out.println(sumator.sum( bigIntA, bigIntB ));
        BigDecimal bigDecA = new BigDecimal("93.423421424636361241");
        BigDecimal bigDecB = new BigDecimal("1241.635537476475457");
        System.out.println(sumator.sum(bigDecA, bigDecB));
        */


        /*
        HomogenousTree tree = new HomogenousTree();
        tree.add(30);
        tree.add(45);
        tree.add(12);
        tree.add(67);
        tree.add(11);
        tree.add(8);
        System.out.println(tree.contains(12));
        System.out.println(tree.contains(5));

        tree.printElements("pre-order");
        System.out.println("---");
        tree.printElements("in-order");
        System.out.println("---");
        tree.printElements("post-order");
        */

        /*
        HeterogeneousTree tree = new HeterogeneousTree();
        tree.add(new Worker());
        tree.add(new Clerk());
        tree.add(2);
        tree.add("Check");
        tree.add('C');

        tree.printElements("pre-order");
        System.out.println("---");
        tree.printElements("in-order");
        System.out.println("---");
        tree.printElements("post-order");
        */


        SumatorExceptions sumator = new SumatorExceptions();

        System.out.println(sumator.sum("2131", "1341412"));
        System.out.println(sumator.sum("21gr2", "412g")); //NumberFormat
        System.out.println(sumator.sum("213176756435364737", "1341412125454634636774623")); //NumberFormat
        System.out.println(sumator.sum(null, null)); //NumberFormat
        System.out.println("-----------");

        /*
        Scanner sc = new Scanner(System.in);
        try{
            int a = Integer.parseInt(sc.next());
            if(a < 0 || a > 10){
                throw new OutOfRangeException("Number not in range");
            }

        }
        catch (NumberFormatException e){
            System.out.println("Caught exception: " + e);
        }
        catch (OutOfRangeException e){
            System.out.println("Caught exception: " + e);
        }
        */

        ExceptionList list = new ExceptionList();
        list.Add("1");
        list.Add("2");
        list.printAllElements();
        list.Remove();
        list.Remove();


    }
}
