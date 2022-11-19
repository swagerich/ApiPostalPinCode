package com.api.rest.Service.Impl;

import com.api.rest.Models.PostOfficeResponse;

public interface PostOfficeService {
    PostOfficeResponse findByName(String city);
}
