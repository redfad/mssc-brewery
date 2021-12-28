package guru.springframework.msscbrewery.web.repository;

import guru.springframework.msscbrewery.web.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
