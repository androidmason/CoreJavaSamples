package com.mason.classes;

/**
 * Class is a core of Java language. Following are conventions to be followed while writing a class in java.
 *
 * 1. Class name must be a noun.
 * 2. Member variables must always be private (<b>Encapsulation<b/>)
 * 3. Member variables should always be accessed outside the class via getters and setters (which are public)
 * 4. Constants within a class should be in all caps.
 * 5. Class members must follow camel case convention for naming.
 * 6. Constructors of a class should always be public.
 * 7. Finalize method should have clean up code (if any) before object goes for garbage collection.
 *
 * @author monilshah
 * @created 12/12/16
 * @version 1.0
 */
public class SampleClass {

    // instance/member variable
    private String memberVariable;

    // constant in  class
    private double PI = 22/7;

    // constructor
    public SampleClass(){

    }

    // parameterized constructor
    public SampleClass(String memberVariable)
    {
        this.memberVariable = memberVariable;
    }

    // getter
    public String getMemberVariable() {
        return memberVariable;
    }

    // setter
    public void setMemberVariable(String memberVariable) {
        this.memberVariable = memberVariable;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
