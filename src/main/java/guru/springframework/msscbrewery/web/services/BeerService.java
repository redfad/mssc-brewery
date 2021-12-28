package guru.springframework.msscbrewery.web.services;

import guru.springframework.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);

    BeerDto saveBeer(BeerDto beerDto);

    void deleteBeer(UUID beerId);

    void updateBeer(UUID beerId, BeerDto beerDto);
}
