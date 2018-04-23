package com.clouway.crm.core;

public class Main {

    public static void main(String[] args) {

        ConsoleReader reader = new ConsoleReader();

        int a = reader.readInt();
        String b = reader.readString();
        char c = reader.readChar();
        float d = reader.readFloat();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);


    }
}
