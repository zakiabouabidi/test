package models;

public class BookProduct extends Product {
    
    String author;

    public BookProduct(String name, Double price, String reference, String author) {
        super(name, price, reference);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    @Override
    public String getDescription() {
return "Book Product =  Name : " + getName() + " Price  : " + getPrice()+"  Reference  : " + getReference()+" Size : " + getAuthor()+"" ;
}
}