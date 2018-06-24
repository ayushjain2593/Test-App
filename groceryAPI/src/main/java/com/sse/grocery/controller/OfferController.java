package com.sse.grocery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sse.grocery.model.Offer;
import com.sse.grocery.service.OfferService;

@RestController
@RequestMapping("/offer")
public class OfferController 
{
	@Autowired
	private OfferService offerService;
	
	@GetMapping
	public List<Offer> getOffers()
	{
		return offerService.getActiveOffers();
	}
	
	@GetMapping(value= "/{offerId}")
	public Offer getOffer(@PathVariable("offerId") String offerId)
	{
		return offerService.getOffer(offerId);
	}
	
	@PostMapping
	public Offer saveOffer(@RequestBody Offer offer)
	{
		return offerService.saveOffer(offer);
	}

}
