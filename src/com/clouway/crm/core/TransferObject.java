package com.clouway.crm.core;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import sun.nio.ch.IOUtil;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.stream.Stream;

public class TransferObject {


    /**
     * Transfers the bytes from an input stream to an output stream
     *
     * @param in input stream
     * @param out output stream
     * @param offset offset to start on
     * @param size size to end with
     */
    public void transfer(InputStream in, OutputStream out, int offset, int size){

        try{
            byte[] buffer = new byte[1];
            int bytesRead;
            int count = 0;
            while ((bytesRead = in.read(buffer)) != -1)
            {
                if(count > offset - 1 && count < offset + size) out.write(buffer, 0, bytesRead);
                count++;
            }
        }
        catch (IOException e){
            System.err.println(e.getMessage());
        }

    }

}
