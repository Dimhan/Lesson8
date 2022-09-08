package com.epamjavaweb.task10class.task1008;

import java.util.*;

public class MainCustomer {
    public static final int RANGE_MIN = 700_000_000;

    public static void main(String[] args) {
        List<Customer> customerList = new ArrayList<>();
        String[] nameCus = {"Петров", "Сидоров", "Иванов", "Первый", "Второй"};
        Random r = new Random();
        int cardNumber;

        for (int i = 0; i < nameCus.length; i++) {
            customerList.add(new Customer());
            customerList.get(i).setSecondName(nameCus[i]);
            customerList.get(i).setId(i + 1);
            cardNumber = r.nextInt(RANGE_MIN, Integer.MAX_VALUE);
            customerList.get(i).setNumCard(cardNumber);
        }

        DataCustomer dataCustomer1 = new DataCustomer();
        dataCustomer1.setCustomers(customerList);
        for (Customer cAllCustomer : dataCustomer1.getCustomers()) {
            System.out.println(cAllCustomer);
        }

        dataCustomer1.allSortingCustomer(dataCustomer1);
        System.out.println("List of customers in alphabetical order");

        for (Customer customerSorting : dataCustomer1.getCustomers()) {
            System.out.println(customerSorting.getSecondName());
        }

        DataCustomer dataCustomer2 = new DataCustomer();
        dataCustomer2.setCustomers(customerList);
        System.out.println("List of customers with a determined credit card number");

        dataCustomer2.selectRangeNumCard(dataCustomer2, 600_000_000, 1_300_000_000);
        for (Customer selectRange : dataCustomer2.getCustomers()) {
            System.out.println(selectRange);
        }
    }
}
