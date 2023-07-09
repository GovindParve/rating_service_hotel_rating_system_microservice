package com.in.rating.services;

import com.in.rating.entities.Rating;

import java.util.List;

public interface RatingService {

    //create
    public Rating createRating(Rating rating);

    //get all ratings
    public List<Rating> getRatings();

    //get all by userId
    public List<Rating> getRatingsByUserId(String userId);

    //get all by hotelId
    public List<Rating> getRatingsByHotelId(String hotelId);

}
