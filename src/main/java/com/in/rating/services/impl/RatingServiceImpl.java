package com.in.rating.services.impl;

import com.in.rating.entities.Rating;
import com.in.rating.repositories.RatingRepository;
import com.in.rating.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    private RatingRepository ratingRepository;

    @Override
    public Rating createRating(Rating rating) {
        System.out.println("In controller createRating() Method 1");
        String ratingId = UUID.randomUUID().toString();
        rating.setRatingId(ratingId);
        System.out.println("In controller createRating() Method 2 ratingId :- "+ratingId);
        return ratingRepository.save(rating);
    }

    @Override
    public List<Rating> getRatings() {
        return ratingRepository.findAll();
    }

    @Override
    public List<Rating> getRatingsByUserId(String userId) {
        return ratingRepository.findByUserId(userId);
    }

    @Override
    public List<Rating> getRatingsByHotelId(String hotelId) {
        return ratingRepository.findByHotelId(hotelId);
    }
}
