import java.util.Arrays;

class product implements Comparable<product> {
    private double price;

    public product(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int compareTo(product otherProduct) {
        return Double.compare(this.price, otherProduct.getPrice());
    }

    public static void main(String[] args) {
        product[] products = {
                new product(30.0),
                new product(25.0),
                new product(35.0)
        };

        Arrays.sort(products);

        for (product product : products) {
            System.out.println("Product Price: " + product.getPrice());
        }
    }
}


