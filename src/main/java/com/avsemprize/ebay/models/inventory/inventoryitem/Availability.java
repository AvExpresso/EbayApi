package com.avsemprize.ebay.models.inventory.inventoryitem;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Availability {
    private ShipToLocationAvailability shipToLocationAvailability;
}
