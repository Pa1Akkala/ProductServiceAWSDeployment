package dev.pavan.productserviceawsdeployment.services;

import dev.pavan.productserviceawsdeployment.models.Category;

import java.util.List;

public interface CategoryService {
    Category getCategory(String uuid);
    List<String> getProductTitles(List<String> categoryUUIDs);
}
