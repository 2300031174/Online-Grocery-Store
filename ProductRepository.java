package org.softuni.onlinegrocery.repository;

import java.util.Optional;

import org.softuni.onlinegrocery.domain.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {

    Optional<Product> findByName(String name);
}
