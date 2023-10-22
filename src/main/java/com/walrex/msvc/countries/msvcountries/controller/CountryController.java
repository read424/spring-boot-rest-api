package com.walrex.msvc.countries.msvcountries.controller;

import com.walrex.msvc.countries.msvcountries.models.entity.Country;
import com.walrex.msvc.countries.msvcountries.service.CountryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;


import com.walrex.msvc.countries.msvcountries.models.dto.CountryDTO;

@RestController
@RequestMapping("api/country")
public class CountryController {
    private final Logger LOG = LoggerFactory.getLogger(CountryController.class);
    @Autowired
    private CountryService service;

    @PostMapping("/create")
    public ResponseEntity<?> agregarCountry(@RequestBody Country country) throws Exception{
        if(country==null)
            return ResponseEntity.badRequest().body("Los datos del pais suministrado no es valido");
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(service.saveOneCountry(country));
    }

    //@PutMapping("/{id}")
    //public ResponseEntity<?> updateCountry(@PathVariable("id") Long countryId, @Valid @RequestBody RegisterCountryDTO countryDTO) throws Exception {
    //}

}
