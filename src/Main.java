public class Main {
    public static void main(String[] args) {

    Product product1 = new Product();
    product1.setProductName("Xiaomi Telefon");
    product1.setProductId(1);
    product1.setImageUrl("xiaomi.jpg");

    Product product2 = new Product();
    product1.setProductName("Huawei Telefon");
    product1.setProductId(2);
    product1.setImageUrl("Huawei.jpg");

    Product product3 = new Product();
    product1.setProductName("Samsung Telefon");
    product1.setProductId(3);
    product1.setImageUrl("Samsung.jpg");

    Product[] products = {product1,product2,product3};

        System.out.println("<ul>");
        for (Product product:products) {
            System.out.println("<li>" + product.getProductName() + "</li>");
        }
        System.out.println("</ul>");


    }
}