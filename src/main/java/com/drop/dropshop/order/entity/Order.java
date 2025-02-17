package com.drop.dropshop.order.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter
public class Order {
    @Id
    @GeneratedValue
    private Long id;

}
