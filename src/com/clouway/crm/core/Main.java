package com.clouway.crm.core;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        /*
        ConsoleReader reader = new ConsoleReader();

        int a = reader.readInt();
        String b = reader.readString();
        char c = reader.readChar();
        float d = reader.readFloat();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        */

        /*
        FileWriter writer = new FileWriter("test1");
        writer.writeToFile();
        */

        /*
        StreamReverser reverser = new StreamReverser("test");
        reverser.reverse();

        StreamReverser reverser1 = new StreamReverser("test1");
        reverser1.reverse();
        */

        /*
        TransferObject transferer = new TransferObject();

        try (InputStream in = new FileInputStream("input");
             OutputStream out = new FileOutputStream("output")){

            transferer.transfer(in, out, 2, 4);

        }
        catch (FileNotFoundException e){
            System.out.println("No such file!");
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        */


        /*
        DataClass dataClass = new DataClass();

        try{
            RandomSerializable obj = new RandomSerializable(123, "Obj");
            InputStream in = new FileInputStream("serialize");
            OutputStream out = new FileOutputStream("serialize");
            dataClass.saveObject(out, obj);

            RandomSerializable getObject = (RandomSerializable) dataClass.getObject(in);

            System.out.println(getObject.name);
            System.out.println(getObject.index);

        }
        catch (FileNotFoundException e){
            System.err.println(e.getMessage());
        }
        catch (IOException e){
            System.err.println(e.getMessage());
        }
        */

        DirectoryBrowser browser = new DirectoryBrowser();

        browser.listContent("input");
        System.out.println();
        browser.listContent("/home/clouway/workspaces/idea/input-and-output");
        System.out.println();
        browser.listContent("home/fakedir");



    }
}
