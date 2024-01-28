package dev.pavan.productserviceawsdeployment.services;

import dev.pavan.productserviceawsdeployment.dtos.GenericCategoryDto;
import dev.pavan.productserviceawsdeployment.models.Category;

import java.util.List;

public interface CategoryService {


    public List<GenericCategoryDto> getAllCategories();

    Category getCategory(String uuid);
    List<String> getProductTitles(List<String> categoryUUIDs);


//    Category getCategory(String uuid);
//    List<String> getProductTitles(List<String> categoryUUIDs);
}
