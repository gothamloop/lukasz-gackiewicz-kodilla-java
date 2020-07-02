package com.kodilla.good.patterns.challenges.Food2Door;

public class ProductOrderRequest {


    public class OrderRequest {
        private UserOrder userOrder;
        private ShopInterf shopInterf;
        private ProductOrderRequest productOrderRequest;


        public OrderRequest(UserOrder userOrder, ShopInterf shopInterf, ProductOrderRequest productOrderRequest) {
            this.userOrder = userOrder;
            this.shopInterf = shopInterf;
            this.productOrderRequest = productOrderRequest;
        }

        public UserOrder getUserOrder() {
            return userOrder;
        }

        public ShopInterf getShopInterf() {
            return shopInterf;
        }

        public ProductOrderRequest getProductOrderRequest() {
            return productOrderRequest;
        }
    }












}
