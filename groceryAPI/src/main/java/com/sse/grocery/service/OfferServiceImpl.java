package com.sse.grocery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sse.grocery.model.Offer;
import com.sse.grocery.repository.OfferRepository;

@Service
public class OfferServiceImpl implements OfferService 
{
	@Autowired
	private OfferRepository offerRepo;
	
	@Override
	public List<Offer> getActiveOffers()
	{
		return offerRepo.findOffersByActive(true);
	}
	
	@Override
	public List<Offer> getActiveOffers(List<String> ids)
	{
		System.out.println(ids);
		System.out.println(offerRepo);
		List<Offer> offerList = offerRepo.findOffersByIdsAndActive(ids, true); 
		return offerList;
	}
	
	@Override
	public Offer getOffer(String id)
	{
		return offerRepo.findOne(id);
	}
	
	@Override
	public Offer saveOffer(Offer offer)
	{
		/*switch (offer.getOfferType()) 
		{
		case 1:
			offer.setCategoryList(new ArrayList<>());
			break;
		case 2:
			offer.setBrandList(new ArrayList<>());
			break;
		case 3:
			offer.setProductList(new ArrayList<>());
			break;
		}*/
		return offerRepo.save(offer);
	}

}
