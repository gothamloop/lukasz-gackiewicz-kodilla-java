package com.kodilla.good.patterns.challenges.serwis_zamowien_produktow;

import java.time.LocalDateTime;

public class ProductOrderRequest {

    private User user;
    private LocalDateTime from;
    private LocalDateTime to;

    public ProductOrderRequest(final User user, final LocalDateTime from, final LocalDateTime to) {
        this.user = user;
        this.from = from;
        this.to = to;
    }

public User getUser() {return user; }

    public LocalDateTime getFrom() {
        return from;
    }

    public LocalDateTime getTo() {
        return to;
    }
}
