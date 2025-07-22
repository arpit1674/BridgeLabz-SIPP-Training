package week04_day1_SubmissionOfJavaGenerics;

interface Category {}
class BookCategory implements Category {}
class ClothingCategory implements Category {}
class GadgetCategory implements Category {}

class Product<T extends Category> {
    String name;
    double price;
    T category;

    Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getInfo() {
        return name + " - $" + price;
    }
}

public class DynamicMarketplace {
    public static <T extends Category> void applyDiscount(Product<T> product, double percentage) {
        double discounted = product.price - (product.price * percentage / 100);
        product.setPrice(discounted);
    }

    public static void main(String[] args) {
        Product<BookCategory> book = new Product<>("Java Book", 500, new BookCategory());
        applyDiscount(book, 10);
        System.out.println(book.getInfo());
    }
}
