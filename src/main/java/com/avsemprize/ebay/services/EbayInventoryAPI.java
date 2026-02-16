package com.avsemprize.ebay.services;

import com.avsemprize.ebay.models.inventory.inventoryitem.InventoryItem;
import com.avsemprize.ebay.models.inventory.inventoryitem.InventoryResponse;
import com.avsemprize.ebay.models.inventory.offer.EbayOffer;
import retrofit2.Call;
import retrofit2.http.*;

public interface EbayInventoryAPI {
    /**
     * Create or replace an inventory item.
     *
     * @param sku   Your internal SKU (path param)
     * @param item  Body containing product, availability, images, etc.
     * @return      Raw response (you can map to a POJO if you need the response body)
     */
    @Headers("Content-Type: application/json")
    @PUT("sell/inventory/v1/inventory_item/{sku}")
    Call<InventoryResponse> insertInventoryItem(
            @Path("sku") String sku,
            @Body InventoryItem item);

    /**
     * Create an offer (publishes the listing).
     *
     * @param offer  Body describing price, quantity, marketplace, policies…
     * @return       Raw response (normally 201 Created with an offerId in the Location header)
     */
    @Headers("Content-Type: application/json")
    @POST("sell/inventory/v1/offer")
    Call<InventoryResponse> createOffer(@Body EbayOffer offer);

}
