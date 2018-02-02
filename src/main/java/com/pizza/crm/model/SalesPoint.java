package com.pizza.crm.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Entity
public class SalesPoint {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private byte shoppingHall;

    private byte delivery;

    @OneToMany(mappedBy = "salesPoint", cascade = CascadeType.ALL, orphanRemoval = true)
    private Collection<Order> orders = new ArrayList<>();

    @OneToMany(mappedBy = "salesPoint", cascade = CascadeType.ALL, orphanRemoval = true)
    private Collection<DeliveryOrder> deliveryOrders = new ArrayList<>();

    @OneToMany(mappedBy = "salesPoint", cascade = CascadeType.ALL, orphanRemoval = true)
    private Collection<Cooking> cookings = new ArrayList<>();

    @OneToMany(mappedBy = "salesPoint", cascade = CascadeType.ALL, orphanRemoval = true)
    private Collection<Invoice> invoices = new ArrayList<>();

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "salesPoint_stock",
            joinColumns = @JoinColumn(name = "salesPoint_id"),
            inverseJoinColumns = @JoinColumn(name = "stock_id"))
    private Set<Stock> stock = new HashSet<>();

    public SalesPoint() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getShoppingHall() {
        return shoppingHall;
    }

    public void setShoppingHall(byte shoppingHall) {
        this.shoppingHall = shoppingHall;
    }

    public byte getDelivery() {
        return delivery;
    }

    public void setDelivery(byte delivery) {
        this.delivery = delivery;
    }

    public Collection<Order> getOrders() {
        return orders;
    }

    public void setOrders(Collection<Order> orders) {
        this.orders = orders;
    }

    public Collection<DeliveryOrder> getDeliveryOrders() {
        return deliveryOrders;
    }

    public void setDeliveryOrders(Collection<DeliveryOrder> deliveryOrders) {
        this.deliveryOrders = deliveryOrders;
    }

    public Collection<Cooking> getCookings() {
        return cookings;
    }

    public void setCookings(Collection<Cooking> cookings) {
        this.cookings = cookings;
    }

    public Collection<Invoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(Collection<Invoice> invoices) {
        this.invoices = invoices;
    }

    public Set<Stock> getStock() {
        return stock;
    }

    public void setStock(Set<Stock> stock) {
        this.stock = stock;
    }
}
