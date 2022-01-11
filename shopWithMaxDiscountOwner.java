package org.darmokhval.tasks14;

public class shopWithMaxDiscountOwner {

    private Supplier supplier;
    private String storeName;

    public Supplier getSupplier() {
        return supplier;
    }
    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
    public String getStoreName() {
        return storeName;
    }
    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public shopWithMaxDiscountOwner(Supplier supplier, String storeName) {
        this.supplier = supplier;
        this.storeName = storeName;
    }

}
