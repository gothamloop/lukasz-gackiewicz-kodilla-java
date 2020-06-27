package com.kodilla.good.patterns.challenges.serwis_zamowien_produktow;

import java.time.LocalDateTime;

public interface ProductOrderRepository {
    boolean createProductOrder(UserOrder userOrder, LocalDateTime from, LocalDateTime to );

}
