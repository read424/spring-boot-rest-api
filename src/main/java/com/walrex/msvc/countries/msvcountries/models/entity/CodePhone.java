package com.walrex.msvc.countries.msvcountries.models.entity;

import java.time.LocalDateTime;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.hibernate.annotations.UpdateTimestamp;

//@EqualsAndHashCode(of = "id")
@Data
@NoArgsConstructor
@Entity
@Table(name = "tb_code_phone_countries", schema = "public",
    uniqueConstraints = {
        @UniqueConstraint(columnNames = {"country_id", "code_phone"}),
        @UniqueConstraint(columnNames = "code_phone")
    }
)
public class CodePhone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="code_phone", length = 3, nullable = false)
    private String code_phone;

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

    @JsonBackReference
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "country_id")
    private Country country;
}
