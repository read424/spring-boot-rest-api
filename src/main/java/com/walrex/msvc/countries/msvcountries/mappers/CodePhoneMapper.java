package com.walrex.msvc.countries.msvcountries.mappers;

import com.walrex.msvc.countries.msvcountries.models.dto.CodePhoneDTO;
import com.walrex.msvc.countries.msvcountries.models.entity.CodePhone;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface CodePhoneMapper {

    CodePhoneDTO codePhoneToCodePhoneDto(CodePhone codePhone);

}
