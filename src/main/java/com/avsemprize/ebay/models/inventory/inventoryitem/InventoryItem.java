package com.avsemprize.ebay.models.inventory.inventoryitem;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InventoryItem {
    private Availability availability;
    private String condition;
    private String conditionDescription;
    private List<ConditionDescriptor> conditionDescriptors;
    private PackageWeightAndSize packageWeightAndSize;
    private Product product;
}
