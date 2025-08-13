package org.generation.netshoppingonline.repositories.addressRepositories;

import org.generation.netshoppingonline.models.address.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {}