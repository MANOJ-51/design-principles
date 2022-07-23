package com.bridgelabzVisitor;

public class Liquor implements IVisitable{

    private double liquorPrice;

    public Liquor(double liquorPrice) {

        this.liquorPrice = liquorPrice;
    }

    public double getLiquorPrice() {

        return liquorPrice;
    }

    @Override
    public double accept(IVisitor iVisitor) {
        return iVisitor.visit(this);
    }
}


//india gate class implements visitable
//india gate is a memorial place
//that means any person can come and visit the place
