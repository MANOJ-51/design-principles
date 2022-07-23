package com.bridgelabz.chain;

public class MultiplyNumbers implements IChain {
    private IChain nextInIChain;

    @Override
    public void setNextChain(IChain nextIChain) {
        this.nextInIChain = nextIChain;
    }

    @Override
    public void calculate(Numbers request) {
        if (request.getCalculationWanted() == "multiply") {
            System.out.println(request.getNumber1() + " * " + request.getNumber2() + " = " +
                    (request.getNumber1() * request.getNumber2()));
        } else {
            nextInIChain.calculate(request);
        }
    }
}
