package com.example.databasedesignwithjpa.service;

import com.example.databasedesignwithjpa.model.Country;
import com.example.databasedesignwithjpa.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public Country saveCountry(Country country) {
        countryRepository.save(country);
        return country;
    }


}
