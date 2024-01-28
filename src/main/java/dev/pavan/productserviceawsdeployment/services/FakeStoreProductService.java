package dev.pavan.productserviceawsdeployment.services;

import dev.pavan.productserviceawsdeployment.dtos.GenericProductDto;
import dev.pavan.productserviceawsdeployment.exceptions.NotFoundException;
import dev.pavan.productserviceawsdeployment.thirdpartyclients.productservice.fakestore.FakeStoreProductDto;
import dev.pavan.productserviceawsdeployment.thirdpartyclients.productservice.fakestore.FakeStoreProductServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Primary
@Service("fakeStoreProductService")
public class FakeStoreProductService implements ProductService {

    private FakeStoreProductServiceClient fakeStoreProductServiceClient;

    private GenericProductDto convertFakeStoreProductIntoGenericProduct(FakeStoreProductDto fakeStoreProductDto) {

        GenericProductDto product = new GenericProductDto();
        product.setUuid(fakeStoreProductDto.getUuid().toString());
        product.setImage(fakeStoreProductDto.getImage());
        product.setDescription(fakeStoreProductDto.getDescription());
        product.setTitle(fakeStoreProductDto.getTitle());
        product.setPrice(fakeStoreProductDto.getPrice());
        product.setCategory(fakeStoreProductDto.getCategory());

        return product;
    }

    @Autowired
    public FakeStoreProductService(FakeStoreProductServiceClient fakeStoreProductServiceClient) {
        this.fakeStoreProductServiceClient = fakeStoreProductServiceClient;
    }


    @Override
    public GenericProductDto createProduct(GenericProductDto product) {
        return convertFakeStoreProductIntoGenericProduct(fakeStoreProductServiceClient.createProduct(product));
    }

    @Override
    public GenericProductDto getProductById(String uuid) throws NotFoundException {
        return convertFakeStoreProductIntoGenericProduct(fakeStoreProductServiceClient.getProductById(uuid));
    }

    @Override
    public List<GenericProductDto> getAllProducts() {
        List<GenericProductDto> genericProductDtos = new ArrayList<>();

        for (FakeStoreProductDto fakeStoreProductDto: fakeStoreProductServiceClient.getAllProducts()) {
            genericProductDtos.add(convertFakeStoreProductIntoGenericProduct(fakeStoreProductDto));
        }
        return genericProductDtos;
    }

    @Override
    public GenericProductDto deleteProduct(String uuid) {
        return convertFakeStoreProductIntoGenericProduct(fakeStoreProductServiceClient.deleteProduct(uuid));
    }

    @Override
    public GenericProductDto updateProduct(String uuid, GenericProductDto product) {
        return null;
    }

    @Override
    public List<GenericProductDto> getAllProductsByCategory(String uuid) {
        return null;
    }






//    private FakeStoreProductServiceClient fakeStoreProductServiceClient;
//
//    @Autowired
//    public FakeStoreProductService(FakeStoreProductServiceClient fakeStoryProductServiceClient) {
//        this.fakeStoreProductServiceClient = fakeStoryProductServiceClient;
//    }
//
//    private GenericProductDto convertFakeStoreProductIntoGenericProduct(FakeStoreProductDto fakeStoreProductDto) {
//
//        GenericProductDto product = new GenericProductDto();
//        product.setId(fakeStoreProductDto.getId());
//        product.setImage(fakeStoreProductDto.getImage());
//        product.setDescription(fakeStoreProductDto.getDescription());
//        product.setTitle(fakeStoreProductDto.getTitle());
//        product.setPrice(fakeStoreProductDto.getPrice());
//        product.setCategory(fakeStoreProductDto.getCategory());
//
//        return product;
//    }
//
////    public FakeStoreProductService(FakeStoryProductServiceClient fakeStoryProductServiceClient) {
////        this.fakeStoryProductServiceClient = fakeStoryProductServiceClient;
////    }
//
//
//    @Override
//    public GenericProductDto createProduct(GenericProductDto product) {
//        return convertFakeStoreProductIntoGenericProduct(fakeStoreProductServiceClient.createProduct(product));
//    }
//
//    @Override
//    public GenericProductDto getProductById(Long id) throws NotFoundException {
//        System.out.println("In product service");
//        return convertFakeStoreProductIntoGenericProduct(fakeStoreProductServiceClient.getProductById(id));
//    }
//
//    @Override
//    public List<GenericProductDto> getAllProducts() {
//        List<GenericProductDto> genericProductDtos = new ArrayList<>();
//
//        for (FakeStoreProductDto fakeStoreProductDto: fakeStoreProductServiceClient.getAllProducts()) {
//            genericProductDtos.add(convertFakeStoreProductIntoGenericProduct(fakeStoreProductDto));
//        }
//        return genericProductDtos;
//    }
//
//    @Override
//    public GenericProductDto deleteProduct(Long id) {
//        return convertFakeStoreProductIntoGenericProduct(fakeStoreProductServiceClient.deleteProduct(id));
//    }
}
