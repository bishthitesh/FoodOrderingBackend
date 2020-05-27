package com.upgrad.FoodOrderingApp.service.entity;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "category")
public class CategoryEntity implements Serializable {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "UUID")
    @Size(max = 200)
    private String uuid;

    @OneToMany(mappedBy="category")
    private List<CategoryItemEntity> categoryItems;

    //bi-directional many-to-one association to RestaurantCategory
    @OneToMany(mappedBy="category")
    private List<RestaurantCategoryEntity> restaurantCategories;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public List<CategoryItemEntity> getCategoryItems() {
        return categoryItems;
    }

    public void setCategoryItems(List<CategoryItemEntity> categoryItems) {
        this.categoryItems = categoryItems;
    }

    public List<RestaurantCategoryEntity> getRestaurantCategories() {
        return restaurantCategories;
    }

    public void setRestaurantCategories(List<RestaurantCategoryEntity> restaurantCategories) {
        this.restaurantCategories = restaurantCategories;
    }
}