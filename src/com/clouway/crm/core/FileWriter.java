package com.clouway.crm.core;

import java.io.*;
import static java.nio.file.StandardOpenOption.*;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileWriter {

    private Scanner in;
    private Path path;

    /**
     * Constructs a FileWriter class with a path to a file
     * @param filename name of file to be created
     */
    public FileWriter(String filename){

        try {
            this.in = new Scanner(System.in);
            this.path = Paths.get(filename);
            Files.createFile(path);
        } catch (FileAlreadyExistsException e) {
            System.out.println("File already exist!");
        } catch (IOException e) {
            System.out.println("Insufficient permissions!");
        }
    }

    /**
     * Reads a line from the console
     * @return the string read from the console
     */
    private String readLine() {
        return in.nextLine();
    }

    /**
     * Writes a line to a file
     */
    public void writeToFile() {

        try(OutputStream out = new BufferedOutputStream(Files.newOutputStream(path, CREATE, APPEND))){

            byte[] line;

            do{

                line = readLine().getBytes();
                out.write(line);
                out.write("\n".getBytes());

            }while(line[line.length - 1] != '.');

        }catch(IOException e){
            System.out.println(e.getMessage());
        }

    }

}
