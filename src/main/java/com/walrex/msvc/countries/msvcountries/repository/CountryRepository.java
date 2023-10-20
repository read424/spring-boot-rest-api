package com.walrex.msvc.countries.msvcountries.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.walrex.msvc.countries.msvcountries.models.entity.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
