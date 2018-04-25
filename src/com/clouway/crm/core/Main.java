package com.clouway.crm.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        //region PageBean
        /*
        ArrayList<Integer> list = new ArrayList<>();


        IntStream.range(0, 11).boxed().forEach(c -> list.add(c));

        PageBean<Integer> pageBean = new PageBean<>(list, 3);

        pageBean.firstPage().forEach(c -> System.out.print(c + " "));
        System.out.println();

        Scanner in = new Scanner (System.in);
        while(true){
            String command = in.nextLine();

            switch(command){

                case "next":
                    pageBean.next().stream().forEach(c -> System.out.print(c + " "));
                    System.out.println();
                    break;
                case "previous":
                    try{
                        pageBean.previous().stream().forEach(c -> System.out.print(c + " "));
                    }catch (ArrayIndexOutOfBoundsException e){
                        System.err.print(e.getMessage());
                    }
                    System.out.println();
                    break;
                case "has next":
                    System.out.println("There is a next page: " + pageBean.hasNext());
                    break;
                case "has previous":
                    System.out.println("There is a previous page: " + pageBean.hasPrevious());
                    break;
                case "current page":
                    System.out.println("Current page is: " + pageBean.getCurrentPage());
                    break;
                case "first page":
                    pageBean.firstPage().stream().forEach(c -> System.out.print(c + " "));
                    System.out.println();
                    break;
                case "last page":
                    pageBean.lastPage().stream().forEach(c -> System.out.print(c + " ")); //First
                    System.out.println();
                    break;
                default:
                    break;
            }

        }
        */
        //endregion

        //region MostCommon

        MostCommon mostCommon = new MostCommon();

        String words1 = "aa cc aa ff gg hh ff";
        String words2 = "Ники Илиев Вълчев Вевов";

        System.out.println(mostCommon.wordCount(words1));

        System.out.println(mostCommon.letterCount(words2));

        //endregion

    }
}
