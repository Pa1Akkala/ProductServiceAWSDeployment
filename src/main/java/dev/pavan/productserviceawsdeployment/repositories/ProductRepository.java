package dev.pavan.productserviceawsdeployment.repositories;

import dev.pavan.productserviceawsdeployment.models.Category;
import dev.pavan.productserviceawsdeployment.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface ProductRepository
extends JpaRepository<Product, UUID> {

    @Override
    Product save(Product product);

    Optional<Product> findByUuid(UUID uuid);

    @Override
    List<Product> findAll();

    List<Product> findAllByCategoryUuid(UUID uuid);

    List<Product> findAllByCategoryIn(List<Category> categories);





//    Product findByTitleEquals(String title);
//
//    Product findByTitleEqualsAndPrice_PriceOrderByPrice_price(String title, double price);
//
//    List<Product> findAllByPrice_Currency(String currency);
//
//    @Override
//    void delete(Product entity);
//
//    long countAllByPrice_Currency(String currency);
//
//
//    List<Product> findAllByTitleLike(String titleRegex);
//
//    List<Product> readAllByTitleLike(String titleRegex);
//
//
//   List<Product> findAllByCategoryIn(List<Category> categories);
//
//    //    @Query("select Product  from Product  where Product .category.uuid in :uuids")
////    List<Product> findAllByCategoryIn(List<UUID> uuids);
//
//
//    @Query(value = CustomQueries.FIND_ALL_BY_TITLE, nativeQuery = true)
//    List<Product> findAllByTitle(String naman);

//    @Query("select Product from Product where Product.price.currency = :currency and Product.title = :naman")
//    List<Product> doSomething(String naman, String currency);
}
