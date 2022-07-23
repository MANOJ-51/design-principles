package com.bridgelabz.chain;

public class ChainOfResponsibility {
    public static void main(String[] args) {

        //creating object of interface and calling methods
        IChain addNumbers = new AddNumbers();
        IChain subtractNumbers = new SubtractNumbers();
        IChain multiplyNumbers = new MultiplyNumbers();
        IChain divideNumbers = new DivideNumbers();

        //connecting objects though chain of responsibilities
        addNumbers.setNextChain(subtractNumbers);
        subtractNumbers.setNextChain(multiplyNumbers);
        multiplyNumbers.setNextChain(divideNumbers);

        //passing numbers request
        Numbers request =new Numbers(4,5,"multiply");

        //implementing chain of responsibility
        addNumbers.calculate(request);
    }

}
 /*
 * chain of responsibility arranges communication between objects
 * such as connection
 * here we have 4 objects performing 4 different operations
 * so when we pass an operation
 * it asks  1st object if it cannot perform the operation it asks 2nd one  */