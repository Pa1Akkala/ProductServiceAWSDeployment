package dev.pavan.productserviceawsdeployment.services;

import dev.pavan.productserviceawsdeployment.dtos.GenericProductDto;
import dev.pavan.productserviceawsdeployment.exceptions.NotFoundException;

import java.util.List;

public interface ProductService {


    GenericProductDto getProductById(String uuid) throws NotFoundException;

    GenericProductDto createProduct(GenericProductDto product);

    List<GenericProductDto> getAllProducts();

    GenericProductDto deleteProduct(String uuid) throws NotFoundException;

    GenericProductDto updateProduct(String uuid,GenericProductDto product);

    List<GenericProductDto> getAllProductsByCategory(String uuid);



//    GenericProductDto createProduct(GenericProductDto product);
//
//    GenericProductDto getProductById(Long id) throws NotFoundException;
//
//    List<GenericProductDto> getAllProducts();
//
//   GenericProductDto deleteProduct(Long id);
}
