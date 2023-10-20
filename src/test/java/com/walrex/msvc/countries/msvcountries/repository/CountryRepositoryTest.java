package com.walrex.msvc.countries.msvcountries.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.walrex.msvc.countries.msvcountries.models.entity.Country;

@DataJpaTest
//@Rollback(value = true)
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class CountryRepositoryTest {
    
    @Autowired
    private CountryRepository countryRepository;

    @Test
    void testSaveMethod() throws InterruptedException {
        Country country = getCountry1();
        countryRepository.save(country);
    }

    protected Country getCountry1(){
        Country country = new Country();
        country.setCode2("PE");
        country.setCode3("PER");
        country.setName_country("PERÚ");
        country.setTimezone("America/Lima");
        country.setGmt("UTC-5");
        country.setId_user(1);
        return country;
    }
}
