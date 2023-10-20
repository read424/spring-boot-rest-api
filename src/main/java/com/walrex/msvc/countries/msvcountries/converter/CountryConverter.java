package com.walrex.msvc.countries.msvcountries.converter;

import com.walrex.msvc.countries.msvcountries.models.dto.CountryDTO;
import com.walrex.msvc.countries.msvcountries.models.entity.Country;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.modelmapper.ModelMapper;
import org.modelmapper.config.Configuration;
import org.springframework.stereotype.Component;

@Component
public class CountryConverter extends AbstractConverter<Country, CountryDTO>{
    private final Logger LOGGER = LoggerFactory.getLogger(getClass());
    private final ModelMapper modelMapper;

    public CountryConverter(ModelMapper modelMapper){
        modelMapper.getConfiguration()
                .setFieldMatchingEnabled(true)
                .setFieldAccessLevel(Configuration.AccessLevel.PRIVATE);
        this.modelMapper=modelMapper;
    }

    @Override
    public Country convertToDM(CountryDTO countryDTO){
        LOGGER.info("converToDM: {}", countryDTO.toString());
        return modelMapper.map(countryDTO, Country.class);

    }

    @Override
    public CountryDTO convertToDTO(Country country){
        return modelMapper.map(country, CountryDTO.class);
    }
}
