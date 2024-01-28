package dev.pavan.productserviceawsdeployment.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GenericProductDto {
    private String uuid;
    private String title;
    private String description;
    private String image;
    private String category;
    private double price;
}
