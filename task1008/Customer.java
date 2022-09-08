package com.epamjavaweb.task10class.task1008;
/*
Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами.
Задать критерии выбора данных и вывести эти данные на консоль.
Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
Найти и вывести:
a) список покупателей в алфавитном порядке;
b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 */

import com.epamjavaweb.task10class.task1004.Train;

import java.io.Serializable;
import java.util.Objects;

public class Customer implements Comparable<Customer>, Serializable {
    private int id;
    private String secondName;
    private String name;
    private String address;
    private int numCard;
    private int numAccount;


    public Customer() {
        id = 1;
        secondName = "";
        name = "";
        address = "";
        numCard = 1;
        numAccount = 1;
    }
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setNumCard(int numCard) {
        this.numCard = numCard;
    }

    public int getNumCard() {
        return numCard;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Customer obj) {
        int res = this.secondName.compareTo(obj.secondName);
        return res;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id && numCard == customer.numCard && numAccount == customer.numAccount &&
                Objects.equals(secondName, customer.secondName) && Objects.equals(name, customer.name) &&
                Objects.equals(address, customer.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, secondName, name, address, numCard, numAccount);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", secondName='" + secondName + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", numCard='" + numCard + '\'' +
                ", numAccount='" + numAccount + '\'' +
                '}';
    }
}
