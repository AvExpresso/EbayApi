package com.avsemprize.ebay.models.inventory.inventoryitem;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Warning {
    private String category;
    private String domain;
    private String errorId;
    private List<String> inputRefIds;
    private String longMessage;
    private String message;
    private List<String> outputRefIds;
    private List<Parameter> parameters;
    private String subdomain;
}
