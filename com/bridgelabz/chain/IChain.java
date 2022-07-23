package com.bridgelabz.chain;

public interface IChain {
    //asking object to perform request
    public void calculate(Numbers request);
    //if not moving to next chain
    public void setNextChain (IChain nextIChain);
}
