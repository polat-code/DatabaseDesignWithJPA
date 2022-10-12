package com.example.databasedesignwithjpa.controller;

import com.example.databasedesignwithjpa.model.Country;
import com.example.databasedesignwithjpa.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    @Autowired
    private CountryService countryService;

    @PostMapping("/country")
    public Country saveCountry(@RequestBody Country country) {
        return countryService.saveCountry(country);
    }

}
