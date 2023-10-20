package com.walrex.msvc.countries.msvcountries.models.dto;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "tb_product")
public class CountryDTO {
    private int id;
    private String name;
    private String description;
    private String quantity;
    private long price;
    private String itemid;

    private List<CodePhoneDTO> codephoneList;
    /*
    private String code2;
    private String code3;
    private String name_country;
    private String path_flag;
    private String timezone;
    private String gmt;
    private List<CodePhoneDTO> phonecodesList;
     */
}
