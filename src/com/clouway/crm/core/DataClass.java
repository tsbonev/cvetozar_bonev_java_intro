package com.clouway.crm.core;

import sun.misc.IOUtils;
import sun.nio.ch.IOUtil;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.io.*;

public class DataClass {

    /**
     * Saves the provided object "o" in the output stream.
     */
    public void saveObject(OutputStream out, Object o) throws IOException {

        byte[] stream = null;
        try(ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos)){
            oos.writeObject(o);
            stream = baos.toByteArray();
            out.write(stream);
        }
        catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    /**
     * Reads an object from the provided InputStreams and returns it as result.
     */
    public Object getObject(InputStream in) throws IOException {

        RandomSerializable obj = null;

        //Get the information from in and convert it to a byte[]
        byte[] data = new byte[1024];
        int bytesRead;
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        while ((bytesRead = in.read(data)) != -1)
        {
            output.write(data, 0, bytesRead);
        }
        data = output.toByteArray();

        //convert a byte[] to an object
        try (ByteArrayInputStream bais = new ByteArrayInputStream(data);
             ObjectInputStream ois = new ObjectInputStream(bais)) {

            obj = (RandomSerializable) ois.readObject();

        } catch (IOException e) {
            System.err.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println(e.getMessage());
        }
        finally {
            return obj;
        }

    }

}
