package com.kodilla.good.patterns.challenges.Food2Door;

public class MainService {

        public static void main(String[] args) {
            ProductOrderService productOrderService = new ProductOrderService();
            productOrderService.processOrders(new ProductOrderRequestRetriever().retrieve());
        }
    }