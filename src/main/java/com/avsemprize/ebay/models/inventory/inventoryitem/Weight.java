package com.avsemprize.ebay.models.inventory.inventoryitem;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Weight {
    private String unit;
    private String value;
}
