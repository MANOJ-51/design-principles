package com.bridgelabzVisitor;

import java.text.DecimalFormat;

public class TaxGstVisitor implements IVisitor{
    DecimalFormat decimalFormat =new DecimalFormat("#.##");

    //default constructor
    public TaxGstVisitor() {
    }

    @Override
    public double visit(Liquor liquorItem) {
        System.out.println("Liquor item price with tax in holidays ");
        return Double.parseDouble(decimalFormat.format((liquorItem.getLiquorPrice()*.18+liquorItem.getLiquorPrice())));
    }

    @Override
    public double visit(Tobacco tobaccoItem) {
        System.out.println("Tobacco item price with tax holidays ");
        return Double.parseDouble(decimalFormat.format((tobaccoItem.getTobaccoPrice()*.32+tobaccoItem.getTobaccoPrice())));
    }
}
