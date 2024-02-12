package services;

import models.Product;

public class Order implements Cart {

    public Product[] products;
    private int size;

    // constructeur avec argument capacity utilisé pour creer un tableau vide en
    // memoire
    // avec la valeur de capacity comme taille

    public Order(int capacity, int size) {
        this.products = new Product[capacity];
        this.size = 0;
    }
    
   /* 
    public Order(Product[] products, int size) {
        this.products = products;
        this.size = size;
    }*/

    @Override
    public void addProduct(Product product) {
        // si le nombre des pdt courant est inferieur strict a la taille max de tab
        // products
        if (size < products.length) {
            if (findProduct(product) == -1) {
                int index = 0;
                while (index < products.length && products[index] != null) {
                    index++;
                }
                // ajouter le pdt
                products[index] = product;
                // augmenter nbr de pdts
                size++;
            } else {
                System.out.println("cannot add pdt with same reference");
            }
        } else {
            System.out.println("Order is full");
        }
    }

    // le pdt qu'on souhait le supprimer avec methode removeProduct
    @Override
    public boolean removeProduct(Product product) {
        int index = findProduct(product);
        if (index != -1) {
            // on va acceder a cet case on va placer null
            // decremonter
            size--;
            // nous avons bien supprimer le pdt avec la meme reference
            return true;
        }else{
            //si on na pas trouver le pdt ave la mm ref
            System.out.println("prduit non trouvé");
            return false;
        }
        // si on n'a pas trouver le pdt ronvoie -1
        // sinon elle ronvoie la position de le pdt avec la meme reference
    }

    @Override
    public void displayProducts() {
        // Si le nombre de produit = 0 alors afficher (No product)
        if (size == 0) {
            System.out.println("No product");
            // pour chaque produit Product product de la liste de produits products
        } else {
            for (Product product : products) {
                if (product != null)
                    System.out.println(product.getDescription());
            }
        }

    }

    @Override
    public double total() {
        // var aux sum initialisé a 0
        double sum = 0.0;
        for (Product product : products) {
            // si tableau est different de null
            if (product != null) {
                // sum = sum+product.getPrice();
                sum += product.getPrice();
            }
        }
        return sum;

    }

    /*
     * methode interne pour verifier Reference return le pdt avec la meme reference
     * sinon return -1
     */
    // product c le pdt qu'on va ajouter a notre liste
    private int findProduct(Product product) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && products[i].getReference().equals(product.getReference())) {
                return i;
            }
        }
        return -1;
    }
}