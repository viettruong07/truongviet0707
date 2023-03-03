package Demo;

public class Product {
    private int id;
    private String name;
    private float price;
    public Product(){
        System.out.println("Product is created");
    }
    public Product(int myid){
        id = myid;
    }
    public Product(int id, String name){
        this.id = id;
        this.name = name;
    }

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
