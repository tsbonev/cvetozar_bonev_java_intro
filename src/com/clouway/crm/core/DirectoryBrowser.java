package com.clouway.crm.core;

import java.io.*;

public class DirectoryBrowser {

    /**
     * Prints the files
     *
     * @param path the path whose files to print
     */
    public void listContent(String path) {

        File file = new File(path);

        if (file.isFile()) {
            System.out.println("Paths points to a file");
        } else if (file.isDirectory()) {

            File[] listOfFiles = file.listFiles();
            for (File subfile: listOfFiles
                 ) {
                System.out.println(subfile.getName());
            }

        } else {
            System.out.println("Path does not exist");
        }


    }
}
