package org.darmokhval.tasks14;

import java.util.ArrayList;
import java.util.List;


public class Task14 {

    public static List<shopWithMaxDiscountOwner> maxDiscountOwner(List<Supplier> supplierList, List<SupplierDiscount> supplierDiscountList) {
        int maxPercentage = supplierDiscountList.stream()
                .map(SupplierDiscount::getDiscountPercentage)
                .max()


    }

    public static void main(String[] args) {
        List<Supplier> supplierList = new ArrayList<>();
        List<SupplierDiscount> supplierDiscountList = new ArrayList<>();


    }
}
