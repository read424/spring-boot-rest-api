package com.walrex.msvc.countries.msvcountries.service;

import java.util.List;
import java.util.Optional;

import com.walrex.msvc.countries.msvcountries.models.entity.Country;

public interface CountryService {
    Country saveOneCountry(Country country);
    List<Country> list();
    Optional<Country> getById(Long id);
    void deleteById(Long id);
}
