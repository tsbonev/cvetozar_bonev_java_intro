package com.clouway.crm.core;

import java.io.Serializable;

public class RandomSerializable implements Serializable {

    public int index;
    public String name;

    /**
     * Constructs a RandomSerialzable object
     *
     * @param index for the object
     * @param name for the object
     */
    public RandomSerializable(int index, String name){
        this.index = index;
        this.name = name;
    }

}
