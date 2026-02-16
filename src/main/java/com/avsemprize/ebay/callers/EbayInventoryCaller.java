package com.avsemprize.ebay.callers;

import com.avsemprize.ebay.interceptor.EbayInterceptor;
import com.avsemprize.ebay.models.inventory.inventoryitem.InventoryItem;
import com.avsemprize.ebay.models.inventory.inventoryitem.InventoryResponse;
import com.avsemprize.ebay.models.inventory.offer.EbayOffer;
import com.avsemprize.ebay.models.token.EbayToken;
import com.avsemprize.ebay.services.EbayInventoryAPI;
import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class EbayInventoryCaller {
    public static final String VIEW_PUBLIC_DATA_SCOPE = "https://api.ebay.com/oauth/api_scope";
    public static final String BASE_URL = "https://api.ebay.com/";
    public static final String BASE_SANDBOX_URL = "https://api.sandbox.ebay.com/";
    private EbayInventoryAPI inventoryAPI;
    public EbayInventoryCaller(EbayToken token, String baseUrl){
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(new EbayInterceptor(token.getAccess_token()))
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();
        inventoryAPI = retrofit.create(EbayInventoryAPI.class);
    }
    public Call<InventoryResponse> insertInventoryItem(String sku, InventoryItem item){
        return inventoryAPI.insertInventoryItem(sku, item);
    }
    public Call<InventoryResponse> createOffer(EbayOffer offer){
        return inventoryAPI.createOffer(offer);
    }

}
