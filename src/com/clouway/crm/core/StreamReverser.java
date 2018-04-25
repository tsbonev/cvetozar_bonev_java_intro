package com.clouway.crm.core;

import sun.dc.path.PathException;

import java.io.*;
import java.io.FileWriter;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class StreamReverser {

    private BufferedReader reader;
    private String pathname;

    /**
     * Constructs a StreamReverser class with a given path
     *
     * @param pathname the path to point to
     */
    public StreamReverser(String pathname) {

        try {
            this.pathname = pathname;
            this.reader = new BufferedReader(new FileReader(pathname));
        } catch (FileNotFoundException e) {
            System.out.println("No such file!");
        }

    }

    /**
     * Reverses the lines of a given file and writes them to a
     */
    public void reverse() {

        try(FileWriter writer = new FileWriter(pathname + "rev")){

            StringBuffer buffer = new StringBuffer(reader.readLine());

            while(buffer != null){
                buffer.reverse();
                writer.write(buffer.toString());
                buffer = new StringBuffer(reader.readLine());
                writer.write("\n");
            }

        }
        catch (NullPointerException e){
            //catch when file is empty and end
        }
        catch (FileNotFoundException e){
            System.err.println("No such file!");
        }
        catch (IOException e){
            System.err.println(e.getMessage());
        }

    }

}
