package com.clouway.crm.core;

import java.util.Scanner;

public class ConsoleReader {


    private Scanner in;

    /**
     * Initializes the scanner in the class
     */
    public ConsoleReader(){
        this.in = new Scanner(System.in);
    }

    /**
     * Reads a line and parses it into a string, then returns it
     * @return integer to return
     */
    public int readInt(){
        int res = 0;
        try{
            return Integer.parseInt(in.nextLine());
        }
        catch (NumberFormatException e){
            System.out.println("Not a correct integer!");
        }
        finally {
            return res;
        }

    }

    /**
     * Reads a line and returns it
     * @return string to be returned
     */
    public String readString(){
        return in.nextLine();
    }

    /**
     * Reads a line and takes out the firts char, then returns it
     * @return char to be returned
     */
    public char readChar(){
        return in.nextLine().charAt(0);
    }

    /**
     * Reads a line and parses it to a float, then returns it
     * @return float to be returned
     */
    public float readFloat(){
        float res = 0;
        try{
            res = Float.parseFloat(in.nextLine());
        }
        catch (NumberFormatException e){
            System.out.println("Not a correct float!");
        }
        finally{
            return res;
        }
    }

}
