package org.generation.netshoppingonline.repositories.addressRepositories;

import org.generation.netshoppingonline.models.address.AddressType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressTypeRepository extends JpaRepository<AddressType, Integer> {}