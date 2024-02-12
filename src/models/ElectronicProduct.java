package models;

public class ElectronicProduct extends Product {

    Double power;

    // Constructeur
    public ElectronicProduct(String name, Double price, String reference, Double power) {
        super(name, price, reference);
        this.power = power;

    }

    public Double getPower() {
        return power;
    }

    public void setPower(Double power) {
        this.power = power;
    }

    @Override
    public String getDescription() {
return "Electronic Product =  Name : " + getName() + " Price  : " + getPrice()+"  Reference  : " + getReference()+" Power : " + getPower()+"" ;
}}
