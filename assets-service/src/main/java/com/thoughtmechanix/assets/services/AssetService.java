package com.thoughtmechanix.assets.services;

import com.thoughtmechanix.assets.model.Asset;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class AssetService {

    public Asset getAsset(String assetId){
        return new Asset()
                .withId(assetId)
                .withOrganizationId( UUID.randomUUID().toString() )
                .withProductName("Test Product Name")
                .withAssetType("PerSeat");
    }

    public void saveAsset(Asset asset){

    }

    public void updateAsset(Asset asset){

    }

    public void deleteAsset(Asset asset){

    }

}
