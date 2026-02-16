package com.avsemprize.ebay.models.inventory.inventoryitem;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConditionDescriptor {
    private String additionalInfo;
    private String name;
    private List<String> values;
}
