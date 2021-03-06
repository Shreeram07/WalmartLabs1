package com.example.ram.thebigbox.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/*
 * Created by SaiShreeRam on 07/02/2018.
 */

public class Product implements Serializable{

@SerializedName("productId")
@Expose
private String productId;
@SerializedName("productName")
@Expose
private String productName;
@SerializedName("shortDescription")
@Expose
private String shortDescription;
@SerializedName("longDescription")
@Expose
private String longDescription;
@SerializedName("price")
@Expose
private String price;
@SerializedName("productImage")
@Expose
private String productImage;
@SerializedName("reviewRating")
@Expose
private Float reviewRating;
@SerializedName("reviewCount")
@Expose
private Integer reviewCount;
@SerializedName("inStock")
@Expose
private Boolean inStock;

public String getProductId() {
return productId;
}

public void setProductId(String productId) {
this.productId = productId;
}

public String getProductName() {
return productName;
}

public void setProductName(String productName) {
this.productName = productName;
}

public String getShortDescription() {
return shortDescription;
}

public void setShortDescription(String shortDescription) {
this.shortDescription = shortDescription;
}

public String getLongDescription() {
return longDescription;
}

public void setLongDescription(String longDescription) {
this.longDescription = longDescription;
}

public String getPrice() {
return price;
}

public void setPrice(String price) {
this.price = price;
}

public String getProductImage() {
return productImage;
}

public void setProductImage(String productImage) {
this.productImage = productImage;
}

public Float getReviewRating() {
return reviewRating;
}

public void setReviewRating(Float reviewRating) {
this.reviewRating = reviewRating;
}

public Integer getReviewCount() {
return reviewCount;
}

public void setReviewCount(Integer reviewCount) {
this.reviewCount = reviewCount;
}

public Boolean getInStock() {
return inStock;
}

public void setInStock(Boolean inStock) {
this.inStock = inStock;
}

}