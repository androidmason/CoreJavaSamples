package com.mason.interfaces;

/**
 * Interface is used to provide total abstarction to a class form implemenation.
 *
 * <p> Intefaces in java can have method declaration and never method implementation.
 * Interfaces can also have static final constants
 *
 * @author monilshah
 * @created 12/12/16
 * @version 1.0
 */
public interface SampleInterface{

    // method declaration
    void doImplementation();

    //interface constant
    String constantInInterface = "I am constant";
}
