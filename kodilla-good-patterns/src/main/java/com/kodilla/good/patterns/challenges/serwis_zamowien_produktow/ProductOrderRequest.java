package com.kodilla.good.patterns.challenges.serwis_zamowien_produktow;

import java.time.LocalDateTime;

public class ProductOrderRequest {

    private UserOrder userOrder;
    private LocalDateTime from;
    private LocalDateTime to;

    public ProductOrderRequest(final UserOrder userOrder, final LocalDateTime from, final LocalDateTime to) {
        this.userOrder = userOrder;
        this.from = from;
        this.to = to;
    }

public UserOrder getUserOrder() {return userOrder; }

    public LocalDateTime getFrom() {
        return from;
    }

    public LocalDateTime getTo() {
        return to;
    }
}
