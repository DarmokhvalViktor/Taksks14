package org.darmokhval.tasks14;

public class Supplier {
    private int customerID;
    private int dateOfBirth;
    private String streetOfResidence;

    public int getCustomerID() {
        return customerID;
    }
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }
    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public void setStreetOfResidence(String streetOfResidence) {
        this.streetOfResidence = streetOfResidence;
    }
    public int getDateOfBirth() {
        return dateOfBirth;
    }
    public String getStreetOfResidence() {
        return streetOfResidence;
    }

    public Supplier(int customerID, int dateOfBirth, String streetOfResidence) {
        this.customerID = customerID;
        this.dateOfBirth = dateOfBirth;
        this.streetOfResidence = streetOfResidence;
    }

}
