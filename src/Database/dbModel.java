
package Database;


public class dbModel {
    String product_id;
    String product_Name;
    String product_catory;
    String product_price;
    String product_quantity;

    public dbModel(String product_id, String product_Name, String product_catory, String product_price, String product_quantity) {
        this.product_id = product_id;
        this.product_Name = product_Name;
        this.product_catory = product_catory;
        this.product_price = product_price;
        this.product_quantity = product_quantity;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getProduct_Name() {
        return product_Name;
    }

    public void setProduct_Name(String product_Name) {
        this.product_Name = product_Name;
    }

    public String getProduct_catory() {
        return product_catory;
    }

    public void setProduct_catory(String product_catory) {
        this.product_catory = product_catory;
    }

    public String getProduct_price() {
        return product_price;
    }

    public void setProduct_price(String product_price) {
        this.product_price = product_price;
    }

    public String getProduct_quantity() {
        return product_quantity;
    }

    public void setProduct_quantity(String product_quantity) {
        this.product_quantity = product_quantity;
    }
   
    
}
