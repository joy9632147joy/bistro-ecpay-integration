package com.joy.holin.dto;

import lombok.Data;

@Data
public class ProductDto {
    private Long id;
    private Long categoryId;
    private String categoryName;
    private String categoryType;
    private String name;
    private Integer price;
    private String abv;
    private String description;
    private String imageUrl;
    private Integer stock;
}
