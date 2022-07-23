package com.bridgelabzVisitor;

import java.text.DecimalFormat;

public class TaxVisitor implements IVisitor{

    DecimalFormat decimalFormat =new DecimalFormat("#.##");

    //default constructor
    public TaxVisitor() {
    }

    @Override
    public double visit(Liquor liquorItem) {
        System.out.println("Liquor item price with tax ");
        return Double.parseDouble(decimalFormat.format((liquorItem.getLiquorPrice()*.10+liquorItem.getLiquorPrice())));
    }

    @Override
    public double visit(Tobacco tobaccoItem) {
        System.out.println("Tobacco item price with tax ");
        return Double.parseDouble(decimalFormat.format((tobaccoItem.getTobaccoPrice()*.30+tobaccoItem.getTobaccoPrice())));
    }
}
