package com.bridgelabzVisitor;

public class VisitorClint {
    public static void main(String[] args) {
        System.out.println("welcome");
        //creating object of visitors
        TaxVisitor taxVisitor =new TaxVisitor();
        TaxGstVisitor taxGstVisitor = new TaxGstVisitor();

        //objects of visitable classes
        Liquor vodka = new Liquor(1000);
        Tobacco cigars = new Tobacco(200);

        System.out.println("Prices with tax");
        System.out.println(vodka.accept(taxVisitor));
        System.out.println(cigars.accept(taxVisitor));

        System.out.println("");
        System.out.println("prices in gst");
        System.out.println(vodka.accept(taxGstVisitor));
        System.out.println(cigars.accept(taxGstVisitor));
    }
}

/*
* visitor
* adds new behaviour without changing structure
* it consists of two parts
* visit and accept
* visitor is an interface to visit all operations for all types of visitable classes
* visitable declares the accept operation
* we will go for a single day trip in delhi
*   */