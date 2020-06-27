package com.kodilla.good.patterns.challenges.serwis_zamowien_produktow;

import java.time.LocalDateTime;

public interface  ProductOrderService {
    boolean rent(UserOrder userOrder, LocalDateTime from,  LocalDateTime to);
}