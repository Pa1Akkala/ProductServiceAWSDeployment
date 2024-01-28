package dev.pavan.productserviceawsdeployment.controllers;

import dev.pavan.productserviceawsdeployment.dtos.GenericProductDto;
import dev.pavan.productserviceawsdeployment.exceptions.NotFoundException;
import dev.pavan.productserviceawsdeployment.security.TokenValidator;
import dev.pavan.productserviceawsdeployment.services.ProductService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
//    @Autowired
    // field injection
    private ProductService productService;
    private TokenValidator tokenValidator;
    public ProductController(@Qualifier("selfProductServiceImpl") ProductService productService,
                             TokenValidator tokenValidator)
    {
        this.productService = productService;
        this.tokenValidator = tokenValidator;
    }


    // GET /products {}
    @GetMapping
    public List<GenericProductDto> getAllProducts() {
        return productService.getAllProducts();
    }

    // localhost:8080/products/{id}
    // localhost:8080/products/123
    @GetMapping("{uuid}")
    public GenericProductDto getProductById(@PathVariable("uuid") String uuid) throws NotFoundException {
        return productService.getProductById(uuid);
    }

    @DeleteMapping("{uuid}")
    public GenericProductDto deleteProductById(@PathVariable("uuid") String uuid) throws NotFoundException {
        return productService.deleteProduct(uuid);
    }

    @PostMapping
    public GenericProductDto createProduct(@RequestBody GenericProductDto product) {
//        System.out.println(product.name);
        return productService.createProduct(product);
    }

    @PutMapping("{uuid}")
    public GenericProductDto updateProduct(@PathVariable("uuid") String uuid, @RequestBody GenericProductDto product) {
        return productService.updateProduct(uuid, product);
    }

    @GetMapping("/category/{uuid}")
    public List<GenericProductDto> getAllProductsByCategory(@PathVariable("uuid") String uuid) {
        return productService.getAllProductsByCategory(uuid);
    }




//    // GET /products {}
//    @GetMapping
//    public ResponseEntity<List<GenericProductDto>> getAllProducts() {
//        List<GenericProductDto> productDtos = productService.getAllProducts();
//        if (productDtos.isEmpty()) {
//            return new ResponseEntity<>(
//                    productDtos,
//                    HttpStatus.NOT_FOUND
//            );
//        }
//
//        List<GenericProductDto> genericProductDtos = new ArrayList<>();
//
//        for (GenericProductDto gpd: productDtos) {
//            genericProductDtos.add(gpd);
//        };
//
//
//        return new ResponseEntity<>(genericProductDtos, HttpStatus.OK);
//
////        productDtos.get(0).setId(1001L);
////
////        return new ResponseEntity<>(productDtos, HttpStatus.OK);
//    }
//
//    // localhost:8080/products/{id}
//    // localhost:8080/products/123
//    @GetMapping("{id}")
//    public GenericProductDto getProductById(@PathVariable("id") Long id
//    , HttpServletRequest request) throws NotFoundException {
//
////        request.getRemoteAddr()
//
////        request.ge
////        System.out.println(authToken);
////        Optional<JwtObject> authTokenObjOptional;
////        JwtObject authTokenObj = null;
////
////        if (authToken != null) {
////            authTokenObjOptional = tokenValidator.validateToken(authToken);
////            if (authTokenObjOptional.isEmpty()) {
////                // ignore
////            }
////
////            authTokenObj = authTokenObjOptional.get();
////        }
//
//        GenericProductDto productDto = productService.getProductById(id);
//        if (productDto == null) {
//            throw new NotFoundException("Product Doesn't Exist");
//        }
//
////        GenericProductDto genericProductDto = new GenericProductDto();
////        genericProductDto.setTitle(productDto.getTitle());
//        return productDto;
//
////        Comparator
//    }
//
//    @DeleteMapping("{id}")
//    public ResponseEntity<GenericProductDto> deleteProductById(@PathVariable("id") Long id) {
//        return new ResponseEntity<>(
//                productService.deleteProduct(id),
//                HttpStatus.OK
//        );
//    }
//
//    @PostMapping
//    public GenericProductDto createProduct(@RequestBody GenericProductDto product) {
////        System.out.println(product.name);
//        return productService.createProduct(product);
//    }
//
//    @PutMapping("{id}")
//    public void updateProductById() {
//
//    }
}
