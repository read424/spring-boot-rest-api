package com.walrex.msvc.countries.msvcountries.models.enumerate;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum StatusType {
    ENABLED(1), DISABLED(0), DELETE(-1);

    private final int value;
}
