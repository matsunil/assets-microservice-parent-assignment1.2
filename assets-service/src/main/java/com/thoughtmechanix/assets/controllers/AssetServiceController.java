package com.thoughtmechanix.assets.controllers;

import com.thoughtmechanix.assets.model.Asset;
import com.thoughtmechanix.assets.services.AssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;

@RestController
@RequestMapping(value="v1/organizations/{organizationId}/assets")
public class AssetServiceController {
    @Autowired
    private AssetService assetService;

	/**
	 * Get asset by asset id for organization by organization id
	 * Using @PathVariable organizationId
	 * Using @PathVariable assetId
	 */
    @RequestMapping(value="/{assetId}",method = RequestMethod.GET)
    public Asset getAssets( @PathVariable("organizationId") String organizationId,
                                @PathVariable("assetId") String assetId) {

        return assetService.getAsset(organizationId, assetId);
    }

    @RequestMapping(value="{assetId}",method = RequestMethod.PUT)
    public String updateAssets( @PathVariable("assetId") String assetId) {
        return String.format("This is the put");
    }

    @RequestMapping(value="{assetId}",method = RequestMethod.POST)
    public String saveAssets( @PathVariable("assetId") String assetId) {
        return String.format("This is the post");
    }

    @RequestMapping(value="{assetId}",method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String deleteAssets( @PathVariable("assetId") String assetId) {
        return String.format("This is the Delete");
    }
}
