package com.gdgotp.d2d.location.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.util.List;
import java.util.UUID;

@Entity(name = "alias")
@Getter
@Setter
public class AliasEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotEmpty
    @Column
    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    private LocationEntity location;
}