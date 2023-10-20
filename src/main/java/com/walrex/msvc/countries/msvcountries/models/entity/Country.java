package com.walrex.msvc.countries.msvcountries.models.entity;

import java.util.List;
import java.time.LocalDateTime;

//import java.io.Serializable;

import com.walrex.msvc.countries.msvcountries.models.enumerate.StatusType;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

/*
@Table(name="tb_countries", schema = "public",
    indexes = {
        @Index(name="idx_code2", columnList = "alpha_code_2", unique = true),
        @Index(name="idx_code3", columnList = "alpha_code_3", unique = true)
    },
    uniqueConstraints = {
        @UniqueConstraint(name="alpha_code_2_uk", columnNames = "alpha_code_2"),
        @UniqueConstraint(name="alpha_code_3_uk", columnNames = "alpha_code_3"),
        @UniqueConstraint(name="name_countri_uk", columnNames = "name_detail"),
    }
)
*/
@Getter
@Setter
@Entity
@Table(name = "tb_countries")
public class Country {
    @Id
    private Long id;
    private String name;
    private String desc;
    private int quantity;
    private long price;
    private String itemid;

    private List<CodePhone> codesphone;
    /*
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="alpha_code_2", unique = true, nullable = false, length = 2)
    private String code2;

    @Column(name="alpha_code_3", unique = true, nullable = false, length = 3)
    private String code3;

    @Column(name="name_detail", unique = true, nullable = false, length = 50)
    private String name_country;

    @Column(name="url_flag", nullable = true)
    private String path_flag;

    @Column(name= "status", nullable = false, columnDefinition = "SMALLINT DEFAULT 1")
    @Enumerated(EnumType.ORDINAL)
    private StatusType condition = StatusType.ENABLED;

    @Column(nullable = true)
    private String timezone;

    @Column(name="gmt_offset", nullable = true)
    private String gmt;

    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @ToString.Exclude
    private List<CodePhone> phonecodes;

    @Column(nullable = false, columnDefinition = "LONG DEFAULT 1")
    private Integer id_user;

    @CreationTimestamp
    @Column(nullable = false)
    private LocalDateTime create_at;

    @UpdateTimestamp
    @Column(nullable = false)
    private LocalDateTime update_at;

    @Column(nullable = true, columnDefinition = "timestamp default null")
    private LocalDateTime delete_at;
     */
}
