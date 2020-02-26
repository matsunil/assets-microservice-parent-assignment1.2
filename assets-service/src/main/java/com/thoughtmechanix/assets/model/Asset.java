package com.thoughtmechanix.assets.model;


public class Asset{
  private String id;
  private String organizationId;
  private String assetName;
  private String assetType;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  public String getAssetName() {
    return assetName;
  }

  public void setAssetName(String assetName) {
    this.assetName = assetName;
  }

  public String getAssetType() {
    return assetType;
  }

  public void setAssetType(String assetType) {
    this.assetType = assetType;
  }

  public Asset withId(String id){
    this.setId( id );
    return this;
  }

  public Asset withOrganizationId(String organizationId){
    this.setOrganizationId(organizationId);
    return this;
  }

  public Asset withAssetName(String assetName){
    this.setAssetName(assetName);
    return this;
  }

  public Asset withAssetType(String assetType){
    this.setAssetType(assetType);
    return this;
  }



}
