package com.kodilla.patterns.strategy.social.share;

import com.kodilla.patterns.strategy.social.SocialPublisher;

public class TwitterPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "Twitter Publisher";
    }
}
