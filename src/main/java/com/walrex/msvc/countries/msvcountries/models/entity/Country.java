package com.walrex.msvc.countries.msvcountries.models.entity;

import java.util.List;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.walrex.msvc.countries.msvcountries.models.enumerate.StatusType;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Data
@Entity
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
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="alpha_code_2", nullable = false, length = 2)
    private String code2;

    @Column(name="alpha_code_3", nullable = false, length = 3)
    private String code3;

    @Column(name="name_detail", nullable = false, length = 50)
    private String name_country;

    @Column(name="url_flag", nullable = true)
    private String path_flag;

    @Column(name= "status", nullable = false)
    @Enumerated(EnumType.STRING)
    private StatusType condition = StatusType.ENABLED;

    @Column(nullable = true)
    private String timezone;

    @Column(name="gmt_offset", nullable = true)
    private String gmt;

    @Column(nullable = false, columnDefinition = "INT DEFAULT 1")
    private Integer id_user=1;

    @CreationTimestamp
    @Column(nullable = false)
    private LocalDateTime create_at;

    @UpdateTimestamp
    @Column(nullable = false)
    private LocalDateTime update_at;

    @Column(nullable = true, columnDefinition = "timestamp default null")
    private LocalDateTime delete_at;

    @JsonManagedReference
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "country", cascade = CascadeType.ALL)
    private List<CodePhone> phonecodes;

}
