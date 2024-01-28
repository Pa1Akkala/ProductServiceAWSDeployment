package dev.pavan.productserviceawsdeployment.repositories;

import dev.pavan.productserviceawsdeployment.models.Category;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Lazy
public interface CategoryRepository
extends JpaRepository<Category, UUID> {


    @Override
    List<Category> findAll();

    Optional<Category> findById(UUID uuid);

    @Override
    List<Category> findAllById(Iterable<UUID> uuids);



//    Optional<Category> findById(UUID uuid);
//
//    @Override
//    List<Category> findAllById(Iterable<UUID> uuids);
}
