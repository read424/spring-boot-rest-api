package com.walrex.msvc.countries.msvcountries.models.entity;

import java.time.LocalDateTime;
import java.util.Date;
import java.io.Serializable;

import com.walrex.msvc.countries.msvcountries.models.enumerate.StatusType;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_provinces", schema = "public",
    uniqueConstraints = @UniqueConstraint(name = "id_departament_name_uk", columnNames = {"id_departament", "name_detail"})
)
public class Province implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false)
    private Long id_departament;

    @Column(nullable = false, length = 50)
    private String name_detail;

    @Enumerated(EnumType.ORDINAL)
    @Column(name="status", nullable = false, columnDefinition = "SMALLINT DEFAULT 1")
    private StatusType condition= StatusType.valueOf("ENABLED");

    @Column(nullable = false)
    private Long id_user;

    @CreationTimestamp
    @Column(nullable = false)
    private LocalDateTime create_at;

    @UpdateTimestamp
    @Column(nullable = false)
    private LocalDateTime update_at;

    @Column(nullable = true, columnDefinition = "TIMESTAMP DEFAULT NULL", insertable = false, updatable = false)
    private Date delete_at;
    
}
