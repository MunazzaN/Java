public class Quantity {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Product product = new Product();

        System.out.println("Price for single quantity "+ product.getprice());

        //passing quantity as argument
        System.out.println("Total Price for given quantity is "+ product.getprice(10));
    }
}
