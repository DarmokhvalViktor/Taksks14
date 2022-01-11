package org.darmokhval.tasks14;

public class SupplierDiscount {
    private int customerID;
    private String storeName;
    private int discountPercentage;

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }
    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }
    public void setDiscountPercentage(int discountPercentage) {
        this.discountPercentage = discountPercentage;
    }
    public int getCustomerID() {
        return customerID;
    }
    public String getStoreName() {
        return storeName;
    }
    public int getDiscountPercentage() {
        return discountPercentage;
    }

    public SupplierDiscount(int customerID, int discountPercentage, String storeName){
        this.customerID = customerID;
        this.discountPercentage = discountPercentage;
        this.storeName = storeName;
    }

}
