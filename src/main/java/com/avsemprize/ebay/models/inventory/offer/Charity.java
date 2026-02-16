package com.avsemprize.ebay.models.inventory.offer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Charity {
    private String charityId;
    private String donationPercentage;
}
