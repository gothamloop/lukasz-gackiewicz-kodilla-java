package com.kodilla.good.patterns.challenges.serwis_zamowien_produktow;

public class ProductOrderProcessor {

        private InformationService informationService;
        private ProductOrderService productOrderService;
        private ProductOrderRepository productOrderRepository;

        public ProductOrderProcessor(final InformationService informationService,
                                     final ProductOrderService productOrderService,
                                     final ProductOrderRepository productOrderRepository) {
            this.informationService = informationService;
            this.productOrderService = productOrderService;
            this.productOrderRepository = productOrderRepository;
        }

        public ProductOrderDto process(final ProductOrderRequest productOrderRequest) {
            boolean isRented = productOrderService.rent(productOrderRequest.getUserOrder(), productOrderRequest.getFrom(),
                    productOrderRequest.getTo());

            if(isRented) {
                informationService.inform(productOrderRequest.getUserOrder());
                productOrderRepository.createProductOrder(ProductOrderRequest.getUserOrder(), ProductOrderRequest.getFrom(), ProductOrderRequest.getTo());
                return new ProductOrderDto(ProductOrderRequest.getUserOrder(), true);
            } else {
                return new ProductOrderDto(ProductOrderRequest.getUserOrder(), false);
            }
        }
    }

