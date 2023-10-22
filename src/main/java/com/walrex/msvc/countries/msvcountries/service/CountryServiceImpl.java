package com.walrex.msvc.countries.msvcountries.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.walrex.msvc.countries.msvcountries.mappers.CountryMapper;
import com.walrex.msvc.countries.msvcountries.models.dto.CountryDTO;
import com.walrex.msvc.countries.msvcountries.models.entity.CodePhone;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.walrex.msvc.countries.msvcountries.models.entity.Country;
import com.walrex.msvc.countries.msvcountries.repository.CountryRepository;

@Service
public class CountryServiceImpl implements CountryService {
    private static Logger LOG = LoggerFactory.getLogger(CountryServiceImpl.class);
    @Autowired
    private CountryRepository countryRepository;
    @Autowired
    private CountryMapper countryMapper;

    @Override
    @Transactional
    public Country saveOneCountry(Country country){
        List<CodePhone> codephones = new ArrayList<>();
        for (CodePhone phoneItem : country.getPhonecodes()) {
            CodePhone phone = new CodePhone();
            phone.setCode_phone(phoneItem.getCode_phone());
            phone.setCountry(country);
            codephones.add(phone);
        }
        country.setPhonecodes(codephones);
        return countryRepository.save(country);
    }
    @Autowired
    private ModelMapper modelMapper;

    @Override
    @Transactional(readOnly = true)
    public List<Country> list() {
        return (List<Country>) countryRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Country> getById(Long id) {
        return countryRepository.findById(id);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        countryRepository.deleteById(id);
    }

}
