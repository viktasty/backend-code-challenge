package com.maziyar.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.maziyar.services.packing.Product;

@Repository
public interface CommodityRepository extends JpaRepository<Product, Integer> {

        @Query("SELECT AVG(p.price) FROM Product p WHERE p.weight > :minWeight AND p.weight < :maxWeight")
    Double findAveragePriceForWeightLessThan(@Param("minWeight") double minWeight, @Param("maxWeight") double maxWeight);
    
}
