package com.example.databasedesignwithjpa.controller;

import com.example.databasedesignwithjpa.model.Merchant;
import com.example.databasedesignwithjpa.repository.MerchantsRepository;
import com.example.databasedesignwithjpa.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MerchantController {

    @Autowired
    MerchantService merchantService;

    @PostMapping("/merchant/{adminId}/{countryId}")
    public Merchant saveMerchant(@RequestBody Merchant merchant, @PathVariable("adminId") Long adminId,
                                 @PathVariable("countryId") Long countryId) {
        return merchantService.saveMerchant(merchant,adminId,countryId);

    }
}
