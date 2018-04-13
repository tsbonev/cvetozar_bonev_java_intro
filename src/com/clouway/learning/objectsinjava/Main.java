package com.clouway.learning.objectsinjava;

import com.clouway.crm.core.Sumator;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {

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

    }
}
