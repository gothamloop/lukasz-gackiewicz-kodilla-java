package com.kodilla.good.patterns.challenges.Food2Door;

public class MainService {

        public static void main(String[] args) {
            OrderRequestRetriver orderRequestRetriver = new OrderRequestRetriver();
            OrderRequest orderRequest = orderRequestRetriver.retrive();
        }
    }