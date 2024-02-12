package models;

public abstract class Product {
    private String name;
    private Double price;
    private String reference;

    public Product(String name, Double price, String reference) {
        this.name = name;
        this.price = price;
        this.reference = reference;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }
    public abstract String getDescription() ;
}