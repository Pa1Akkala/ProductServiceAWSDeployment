package dev.pavan.productserviceawsdeployment.services;

import dev.pavan.productserviceawsdeployment.dtos.GenericProductDto;
import dev.pavan.productserviceawsdeployment.exceptions.NotFoundException;

import java.util.List;

public interface ProductService {

    GenericProductDto createProduct(GenericProductDto product);

    GenericProductDto getProductById(Long id) throws NotFoundException;

    List<GenericProductDto> getAllProducts();

   GenericProductDto deleteProduct(Long id);
}
