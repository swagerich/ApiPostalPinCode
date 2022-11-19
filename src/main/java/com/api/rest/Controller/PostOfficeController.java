package com.api.rest.Controller;

import com.api.rest.Models.PostOfficeResponse;
import com.api.rest.Service.PostOfficeServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;

import org.springframework.web.bind.annotation.*;

@RestController @RequiredArgsConstructor @RequestMapping("/postal")
public class PostOfficeController {
    private final PostOfficeServiceImpl postOfficeService;

    @GetMapping(value = "/byCity",consumes = MediaType.ALL_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public PostOfficeResponse listar(@RequestParam String city){
       return postOfficeService.findByName(city);

    }
}
