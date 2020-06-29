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
            boolean isBuy = productOrderService.buy(productOrderRequest.getUserOrder());

            if(isBuy) {
                informationService.inform(productOrderRequest.getUserOrder());
                productOrderRepository.createProductOrder(productOrderRequest.getUserOrder());
                return new ProductOrderDto(productOrderRequest.getUserOrder(), true);
            } else {
                return new ProductOrderDto(productOrderRequest.getUserOrder(), false);
            }
        }
    }

