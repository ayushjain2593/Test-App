package com.sse.grocery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sse.grocery.model.Block;
import com.sse.grocery.model.Offer;
import com.sse.grocery.model.enums.Page;
import com.sse.grocery.service.BlockService;
import com.sse.grocery.service.OfferService;

@RestController
@RequestMapping("/offer")
public class OfferController 
{
	@Autowired
	private OfferService service;
	@Autowired
	private BlockService bService;
	
	@GetMapping
	public List<Block> getActiveOffersBlock()
	{
		return bService.getActiveBlockList(Page.OFFER);
	}
	
	@PostMapping
	public Offer saveOffer(@RequestBody Offer offer)
	{
		return service.saveOffer(offer);
	}
	
	/*@GetMapping
	public List<Offer> getActiveOffers()
	{
		return service.getActiveOffers();
	}*/
	
	/*@GetMapping(value= "/{offerId}")
	public Offer getOffer(@PathVariable("offerId") String offerId)
	{
		return offerService.getOffer(offerId);
	}*/
}
