package com.example.databasedesignwithjpa.service;

import com.example.databasedesignwithjpa.model.Country;
import com.example.databasedesignwithjpa.model.Merchant;
import com.example.databasedesignwithjpa.model.User;
import com.example.databasedesignwithjpa.repository.CountryRepository;
import com.example.databasedesignwithjpa.repository.MerchantsRepository;
import com.example.databasedesignwithjpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MerchantService {

    @Autowired
    MerchantsRepository merchantsRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    CountryRepository countryRepository;
    public Merchant saveMerchant(Merchant merchant,Long adminId,Long countryId) {
        User user =  userRepository.findById(adminId).get();
        Country country = countryRepository.findById(countryId).get();
        merchant.setAdmin(user);
        merchant.setCountry(country);
        return merchantsRepository.save(merchant);
    }
}
