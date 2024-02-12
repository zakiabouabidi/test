package models;

public class ClothingProduct  extends Product {
    
    String size;

    public ClothingProduct(String name, Double price, String reference, String size) {
        super(name, price, reference);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }


    @Override
    public String getDescription() {
return "Clothing Product =  Name : " + getName() + " Price  : " + getPrice()+"  Reference  : " + getReference()+" Size : " + getSize()+"" ;
}

    
}