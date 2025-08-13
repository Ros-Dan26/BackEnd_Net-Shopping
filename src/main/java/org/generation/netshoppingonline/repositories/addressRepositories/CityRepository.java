package org.generation.netshoppingonline.repositories.addressRepositories;

import org.generation.netshoppingonline.models.address.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {}