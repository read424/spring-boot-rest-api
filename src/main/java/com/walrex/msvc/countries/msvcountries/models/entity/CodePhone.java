package com.walrex.msvc.countries.msvcountries.models.entity;

import java.time.LocalDateTime;

//import java.io.Serializable;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Getter
@Setter
/*
@ToString
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "tb_code_phone_countries", schema = "public",
    uniqueConstraints = {
        @UniqueConstraint(name="country_code_phone_uk", columnNames = {"id_country", "code_phone"}),
        @UniqueConstraint(name="code_phone_uk", columnNames = "code_phone")
    }
)
@Access(AccessType.FIELD)
 */
@Entity
@Table(name = "tb_item")
public class CodePhone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code_phone;
    /*
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="code_phone", length = 3, nullable = false, unique = true)
    private String code_phone;

    @Column(nullable = false)
    private Integer id_user;

    @CreationTimestamp
    @Column(nullable = false)
    private LocalDateTime create_at;

    @UpdateTimestamp
    @Column(nullable = false)
    private LocalDateTime update_at;

    @Column(nullable = true, columnDefinition = "timestamp default null")
    private LocalDateTime delete_at;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "country_id", nullable = false)//name_column relation country
    @OnDelete(action = OnDeleteAction.CASCADE)
    @ToString.Exclude
    private Country country;
     */
}
