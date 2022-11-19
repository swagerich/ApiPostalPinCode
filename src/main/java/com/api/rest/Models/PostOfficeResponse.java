package com.api.rest.Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import java.util.List;

@Data
public class PostOfficeResponse {
    @JsonProperty(value = "Message")
    private String message;

    @JsonProperty(value = "Status")
    private String status;

    @JsonProperty(value = "PostOffice")
    private List<PostOffice> postOffice;
}
