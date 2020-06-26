package com.kodilla.good.patterns.challenges.serwis_zamowien_produktow;

public class ProductOrderProcessor {

        private InformationService informationService;
        private RentalService rentalService;
        private RentalRepository rentalRepository;

        public ProductOrderProcessor(final InformationService informationService,
                                     final RentalService rentalService,
                                     final RentalRepository rentalRepository) {
            this.informationService = informationService;
            this.rentalService = rentalService;
            this.rentalRepository = rentalRepository;
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
