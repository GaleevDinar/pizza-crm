package com.pizza.crm.model;

import javax.persistence.*;
import javax.persistence.criteria.Order;
import java.util.Date;

@Entity(name="DeliveryOrderTab")
@Table(name = "DeliveryOrderTab")
public class DeliveryOrderTab {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

//    @ManyToOne
//    private DeliveryOrder deliveryOrder;

    private Date checkOutTime;

    private int deliveryTime;

//    private Order order;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

//    public DeliveryOrder getDeliveryOrder() {
//        return deliveryOrder;
//    }
//
//    public void setDeliveryOrder(DeliveryOrder deliveryOrder) {
//        this.deliveryOrder = deliveryOrder;
//    }

    public Date getCheckOutTime() {
        return checkOutTime;
    }

    public void setCheckOutTime(Date checkOutTime) {
        this.checkOutTime = checkOutTime;
    }

    public int getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(int deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

//    public Order getOrder() {
//        return order;
//    }
//
//    public void setOrder(Order order) {
//        this.order = order;
//    }
}
