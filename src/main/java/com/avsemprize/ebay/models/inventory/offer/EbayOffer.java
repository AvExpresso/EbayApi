package com.avsemprize.ebay.models.inventory.offer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EbayOffer {
    private String availableQuantity;
    private String categoryId;
    private Charity charity;
    private String format;
    private String hideBuyerDetails;
    private String includeCatalogProductDetails;
    private String listingDescription;
    private String listingDuration;
    private ListingPolicies listingPolicies;
    private String listingStartDate;
    private String lotSize;
    private String marketplaceId;
    private String merchantLocationKey;
    private PricingSummary pricingSummary;
    private String quantityLimitPerBuyer;
    private String secondaryCategoryId;
    private String sku;
    private List<String> storeCategoryNames;
    private Tax tax;
}
