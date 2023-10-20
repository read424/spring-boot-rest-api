package com.walrex.msvc.countries.msvcountries.models.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class CodePhoneCountryDTO {

    @NotNull
    @NotEmpty
    @NotBlank
    @JsonProperty("code")
    private String code_phone;

    @NotNull
    private CountryDTO country;
}
