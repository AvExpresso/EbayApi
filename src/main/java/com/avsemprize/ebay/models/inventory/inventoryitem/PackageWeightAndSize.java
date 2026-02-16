package com.avsemprize.ebay.models.inventory.inventoryitem;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PackageWeightAndSize {
    private Dimensions dimensions;
    private String packageType;
    private String shippingIrregular;
    private Weight weight;
}
