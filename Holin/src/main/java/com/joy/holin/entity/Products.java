package com.joy.holin.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "products")
@Data
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Categories category;

    private String name;
    private Integer price;

    private String abv;
    private String description;

    @Column(name = "image_url")
    private String imageUrl;

    private Integer stock;

}
