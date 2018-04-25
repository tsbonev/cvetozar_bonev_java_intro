package com.clouway.crm.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        //region PageBean
        ArrayList<Integer> list = new ArrayList<>();


        IntStream.range(0, 11).boxed().forEach(c -> list.add(c));

        PageBean<Integer> pageBean = new PageBean<>(list, 3);

        pageBean.next().stream().forEach(c -> System.out.print(c + " ")); //First
        System.out.println("Current page is: " + pageBean.getCurrentPage());

        pageBean.next().stream().forEach(c -> System.out.print(c + " ")); //Second
        System.out.println("Current page is: " + pageBean.getCurrentPage());

        pageBean.next().stream().forEach(c -> System.out.print(c + " ")); //Third
        System.out.println("Current page is: " + pageBean.getCurrentPage());

        pageBean.next().stream().forEach(c -> System.out.print(c + " ")); // Fourth
        System.out.println("Current page is: " + pageBean.getCurrentPage());

        System.out.println("Has next page: " + pageBean.hasNext()); //Doesn't have a next

        pageBean.next().stream().forEach(c -> System.out.print(c + " ")); // Try to go to fifth
        System.out.println("Current page is: " + pageBean.getCurrentPage());



        pageBean.previous().stream().forEach(c -> System.out.print(c + " ")); //Go back to third
        System.out.println("Current page is: " + pageBean.getCurrentPage());

        pageBean.previous().stream().forEach(c -> System.out.print(c + " ")); //Go back to second
        System.out.println("Current page is: " + pageBean.getCurrentPage());

        pageBean.previous().stream().forEach(c -> System.out.print(c + " ")); //Go back to first
        System.out.println("Current page is: " + pageBean.getCurrentPage());

        System.out.println("Has previous page: " + pageBean.hasPrevious()); //Doesn't have a previous

        pageBean.previous().stream().forEach(c -> System.out.print(c + " ")); //Try to go back from first
        System.out.println("Current page is: " + pageBean.getCurrentPage());

        pageBean.lastPage().stream().forEach(c -> System.out.print(c + " ")); //Go to last
        System.out.println("Current page is: " + pageBean.getCurrentPage());

        pageBean.firstPage().stream().forEach(c -> System.out.print(c + " ")); //Go to first
        System.out.println("Current page is: " + pageBean.getCurrentPage());


        //endregion

    }
}
