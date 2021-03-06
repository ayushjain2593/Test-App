package com.sse.grocery.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sse.grocery.model.Content;
import com.sse.grocery.model.Offer;
import com.sse.grocery.repository.OfferRepository;
import com.sse.grocery.utility.ListUtils;

@Service
public class OfferServiceImpl implements OfferService {
	@Autowired
	private OfferRepository repo;

	@Override
	public List<Content> getActiveOffers(List<String> ids) {
		return repo.findOffersByIdsAndActive(ids, true);
	}
	/*
	 * @Override public List<Offer> getActiveOffers() { return
	 * repo.findOffersByActive(true); }
	 */

	/*
	 * @Override public Offer getActiveOffer(String id) { return
	 * offerRepo.findOne(id); }
	 */

	@Override
	public Offer saveOffer(Offer offer) {
		if(!ListUtils.hasElements(offer.getProductList()))
			offer.setProductList(new ArrayList<String>());
		return repo.save(offer);
	}

}
