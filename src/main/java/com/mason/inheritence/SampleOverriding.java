package com.mason.inheritence;

import java.io.IOException;

/**
 *  In inheritance, when a super class method is implemented in sub class as well,
 *  it is known as overriding. Overriding is one of the key features of OOP.
 *
 *  Following are the rules to implement overriding in Java:
 *
 *  1. Name of an overridden method and its paramter types should exactly same.
 *  2. Number and types of parameters does not change in overridden method.
 *  3. Return type of overridden method cannot change except for co-variant return.
 *  4. Access modifier of overridden method cannot be more restrictive.
 *  5. Checked exceptions for overridden method cannot be broader(i.e. Exception upward in hierarchy)
 *  6. Overridden method can throw any unchecked exception.
 *
 * Created by monilshah on 12/12/16.
 */
public class SampleOverriding {

    public static void main(String[] args) {

        // sub class object to super class reference
        SuperClass supSub = new SubClass();

        // super class object to super class reference
        SuperClass supSup = new SuperClass();

        // sub class object to sub class reference
        SubClass subSub = new SubClass();

        // Subclass reference cannot hold super class object
        //SubClass subClass = new SuperClass();

        // Prints : In Super class
        supSub.printMessage("Hello");
        // Prints : In Super class
        supSup.printMessage("Hello");
        // Prints : In Sub class
        supSub.printMessage("Hello");


    }

}


class SuperClass{

    public void printMessage(String name){
        System.out.println("In Super class");
    }

    public void throwException() throws Exception{
        System.out.println("I can throw exception in super class");
    }

    protected void changeAccessModifier(String name, int rollNo) {
        System.out.println("I am protected");
    }

}

class SubClass extends SuperClass{

    // method name and parameters (Rule 1 & 2)
    @Override
    public void printMessage(String name){
        System.out.println("In Sub class ");
    }

    // Exception rules example in overriding (Rule 5 & 6)
    @Override
    public void throwException() throws StackOverflowError, IOException{
        System.out.println("I");
    }

    public void printSubClass() {
        System.out.println("Printed in sub class");
    }

    // Access modifier rule verification (Rule 4)
    @Override
    public void changeAccessModifier(String name, int rollNo) {
        System.out.println("I am public");
    }
}