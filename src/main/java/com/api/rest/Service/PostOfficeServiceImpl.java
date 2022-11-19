package com.api.rest.Service;

import com.api.rest.Models.PostOffice;
import com.api.rest.Models.PostOfficeResponse;
import com.api.rest.Service.Impl.PostOfficeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service @RequiredArgsConstructor
public class PostOfficeServiceImpl implements PostOfficeService {

    private static String url = "https://api.postalpincode.in/postoffice/{city}";

    private final RestTemplate restTemplate;

    @Override
    public PostOfficeResponse findByName(String cityValue) {
        url = url.replace("{city}", cityValue);
        ResponseEntity<PostOfficeResponse[]> responseOffice = restTemplate.getForEntity(url, PostOfficeResponse[].class);
        PostOfficeResponse[] bodyArray = responseOffice.getBody();
            if(bodyArray != null){
                for (PostOfficeResponse postOfficeResponse : bodyArray) {
                    List<PostOffice> postOfficeList = postOfficeResponse.getPostOffice();
                    for (PostOffice office : postOfficeList) {
                        String s = office.getName() + office.getCountry() + office.getCountry();
                        System.out.println(s);
                    }
                }
                return bodyArray[0];
            }

          return null;
    }
}
