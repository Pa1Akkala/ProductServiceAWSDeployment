package dev.pavan.productserviceawsdeployment.repositories;

import dev.pavan.productserviceawsdeployment.models.Price;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceRepository
extends JpaRepository<Price, Long> {
}
