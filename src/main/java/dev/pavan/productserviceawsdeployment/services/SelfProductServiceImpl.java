package dev.pavan.productservice.services;

import dev.pavan.productservice.dtos.GenericProductDto;
import dev.pavan.productservice.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;


//@Primary
@Service("selfProductServiceImpl")
public class SelfProductServiceImpl implements ProductService {
    private ProductRepository productRepository;

    public SelfProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public GenericProductDto getProductById(Long id) {
        System.out.println("In product service");

        // Product product = ProductRepository.getProductByID(id);
        //  if (product.getStatus().equals(PRIVATE)) {
        //      if (userIdTryingToAccess.equals(product.getCreatorId())) {
        //        return product;
        //      }
        //       return null;
        //  }
        //
        // return product;

        return new GenericProductDto();
    }

    @Override
    public GenericProductDto createProduct(GenericProductDto product) {
        return null;
    }

    @Override
    public List<GenericProductDto> getAllProducts() {
        return null;
    }

    @Override
    public GenericProductDto deleteProduct(Long id) {
        return null;
    }
}
