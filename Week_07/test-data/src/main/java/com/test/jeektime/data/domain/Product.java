package com.test.jeektime.data.domain;

import lombok.Data;

import java.math.BigInteger;

@Data
public class Product {
    private BigInteger product_id;

    private String product_name;

    private BigInteger price;

    private float weight;
}