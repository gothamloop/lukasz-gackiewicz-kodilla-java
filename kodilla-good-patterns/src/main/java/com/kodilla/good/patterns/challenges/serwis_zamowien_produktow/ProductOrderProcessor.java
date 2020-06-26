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

        public RentalDto process(final RentRequest rentRequest) {
            boolean isRented = rentalService.rent(rentRequest.getUser(), rentRequest.getFrom(),
                    rentRequest.getTo());

            if(isRented) {
                informationService.inform(rentRequest.getUser());
                rentalRepository.createRental(rentRequest.getUser(), rentRequest.getFrom(), rentRequest.getTo());
                return new RentalDto(rentRequest.getUser(), true);
            } else {
                return new RentalDto(rentRequest.getUser(), false);
            }
        }
    }



}
