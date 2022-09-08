package com.epamjavaweb.task10class.task1008;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DataCustomer implements Serializable {
    List<Customer> customers;

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public DataCustomer selectRangeNumCard(DataCustomer rangeCustomer, int range1, int range2) {
        if (range1 < range2) {
            List<Customer> sampleCustomer = new ArrayList<>();
            for (int i = 0; i < rangeCustomer.getCustomers().size(); i++) {
                if (rangeCustomer.getCustomers().get(i).getNumCard() >= range1 &
                        rangeCustomer.getCustomers().get(i).getNumCard() <= range2) {
                    sampleCustomer.add(rangeCustomer.getCustomers().get(i));
                }
            }
            rangeCustomer.setCustomers(sampleCustomer);
            return rangeCustomer;
        } else {
            throw new RuntimeException("Incorrect data!");
        }
    }

    public DataCustomer allSortingCustomer(DataCustomer dataCustomer) {
        Collections.sort(dataCustomer.getCustomers());
        return dataCustomer;
    }

}
