package com.avsemprize.ebay.models.inventory.inventoryitem;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private String aspects;
    private String brand;
    private String description;
    private List<String> ean;
    private String epid;
    private List<String> imageUrls;
    private List<String> isbn;
    private String mpn;
    private String subtitle;
    private String title;
    private List<String> upc;
    private List<String> videoIds;
}
