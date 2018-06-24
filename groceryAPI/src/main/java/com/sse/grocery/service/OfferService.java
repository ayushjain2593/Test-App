package com.sse.grocery.service;

import java.util.List;

import com.sse.grocery.model.Offer;

public interface OfferService 
{
	List<Offer> getActiveOffers();
	List<Offer> getActiveOffers(List<String> ids);
	Offer getOffer(String Id);
	Offer saveOffer(Offer offer);

}
