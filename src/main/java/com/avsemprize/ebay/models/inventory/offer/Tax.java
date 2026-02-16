package com.avsemprize.ebay.models.inventory.offer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tax {
    public String applyTax;
    public String thirdPartyTaxCategory;
    public String vatPercentage;
}
