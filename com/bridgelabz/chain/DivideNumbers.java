package com.bridgelabz.chain;

public class DivideNumbers implements IChain {
    private IChain nextInIChain;

    @Override
    public void setNextChain(IChain nextIChain) {
        this.nextInIChain = nextIChain;
    }

    @Override
    public void calculate(Numbers request) {
        if (request.getCalculationWanted() == "division") {
            System.out.println(request.getNumber1() + " / " + request.getNumber2() + " = " +
                    (request.getNumber1() / request.getNumber2()));
        } else {
            System.out.println("Only works for addition,Subtraction,Multiplication and Division");
        }
    }
}
