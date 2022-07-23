package com.bridgelabzVisitor;

public class Tobacco implements IVisitable{
    private double tobaccoPrice;

    public Tobacco(double tobaccoPrice) {
        this.tobaccoPrice = tobaccoPrice;
    }

    public double getTobaccoPrice() {
        return tobaccoPrice;
    }

    @Override
    public double accept(IVisitor iVisitor) {
        return iVisitor.visit(this);
    }
}

//redFort class implements visitable that means any person can come and visit
//redFort is a historical fort
//any person can visit redFort
