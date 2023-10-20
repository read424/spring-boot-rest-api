package com.walrex.msvc.countries.msvcountries.mappers;

import com.walrex.msvc.countries.msvcountries.models.dto.CodePhoneCountryDTO;
import com.walrex.msvc.countries.msvcountries.models.dto.CodePhoneDTO;
import com.walrex.msvc.countries.msvcountries.models.dto.CountryDTO;
import com.walrex.msvc.countries.msvcountries.models.entity.CodePhone;
import com.walrex.msvc.countries.msvcountries.models.entity.Country;

import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import java.util.Optional;
import java.util.Set;
import java.util.UUID;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.ERROR, imports = UUID.class, uses = {CodePhoneMapper.class})
public interface CountryMapper {

    CountryMapper INSTANCE = Mappers.getMapper(CountryMapper.class);

    @Mapping(source = "country.desc", target = "description", defaultValue = "description")
    @Mapping(target = "itemid", expression = "java(UUID.randomUUID().toString())")
    @Mapping(source = "country.codesphone", target = "codephoneList")
    CountryDTO countryToCountryDto(Country country);

    @InheritInverseConfiguration
    Country countryDtoToCountry(CountryDTO countryDTO);

    //@Mapping(target = "phonecodes", qualifiedByName = "codePhoneSetDtoToCodePhoneSet")
    //Country countryDtoToCountry(CountryDTO countryDTO);
    //@IterableMapping(qualifiedByName = "codePhoneDtoToCodePhone")
    //@Named("codePhoneSetDtoToCodePhoneSet")
    //Set<CodePhone> codePhoneSetDtoToCodePhoneSet(Set<CodePhoneDTO> list);
    //@Named("codePhoneDtoToCodePhone")
    //CodePhone codePhoneDtoToCodePhone(CodePhoneDTO item);
    //@AfterMapping
    //default void setCodePhone(@MappingTarget Country country){
    //    Optional.ofNullable(country.getPhonecodes())
    //            .ifPresent(it -> it.forEach(item -> item.setCountry(country)));
    //}
    //CountryDTO countryToCountryDTO(Country country);
}
