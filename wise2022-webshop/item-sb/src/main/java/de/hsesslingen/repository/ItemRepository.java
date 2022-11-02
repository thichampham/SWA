package de.hsesslingen.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import de.hsesslingen.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {
  
  List<Item> findByTitleContaining(String title); //test
  
}
