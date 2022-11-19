package com.api.rest.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class PostOffice {

    @JsonProperty(value = "Name")
    private String name;

    @JsonProperty(value = "Description")
    private String description;

    @JsonProperty(value = "PINcode")
    private String pincode;

    @JsonProperty(value = "BranchType")
    private String branchType;

    @JsonProperty(value = "DeliveryStatus")
    private String deliveryStatus;

    @JsonProperty(value = "Circle")
    private String circle;

    @JsonProperty(value = "District")
    private String district;

    @JsonProperty(value = "Division")
    private String division;

    @JsonProperty(value = "Region")
    private String region;

    @JsonProperty(value = "State")
    private String state;

    @JsonProperty(value = "Country")
    private String country;
}
