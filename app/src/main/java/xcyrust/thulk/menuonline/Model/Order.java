package xcyrust.thulk.menuonline.Model;

/**
 * Created by lkthu on 04-Jan-18.
 */

public class Order {
    private String ProductID;
    private String ProductName;
    private String Quantity;
    private String Price;
    private String Discount;

    public Order(String productID, String productName, String quantity, String price, String discount) {
        ProductID = productID;
        ProductName = productName;
        Quantity = quantity;
        Price = price;
        Discount = discount;
    }

    public Order() {
    }

    public String getProductID() {
        return ProductID;
    }

    public void setProductID(String productID) {
        ProductID = productID;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String quantity) {
        Quantity = quantity;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getDiscount() {
        return Discount;
    }

    public void setDiscount(String discount) {
        Discount = discount;
    }
}
