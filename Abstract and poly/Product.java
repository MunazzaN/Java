public class Product {
    private double price = 1.50;
    public double getprice() {
        return price;
    }
    public void setprice(double price) {
        this.price= price ;
    }

    //writing overloading get price method with passing quantity as argument
    public double getprice(int quantity ) {


        return price*quantity;
    }


}
