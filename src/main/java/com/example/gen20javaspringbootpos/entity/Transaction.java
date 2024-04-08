package com.example.gen20javaspringbootpos.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

//@Entity(name="Transaction")
public class Transaction {
    @Id
    int invoice_id;
    int product_id;
    int quantity;
}
