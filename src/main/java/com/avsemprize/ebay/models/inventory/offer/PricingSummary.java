package com.avsemprize.ebay.models.inventory.offer;

import com.avsemprize.ebay.models.inventory.offer.Amount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PricingSummary {
    private Amount price;

}
