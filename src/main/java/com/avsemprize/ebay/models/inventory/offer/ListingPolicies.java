package com.avsemprize.ebay.models.inventory.offer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListingPolicies {
    private String paymentPolicyId;
    private String returnPolicyId;
    private String shippingPolicyId;
}
