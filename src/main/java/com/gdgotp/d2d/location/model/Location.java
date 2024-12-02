package com.gdgotp.d2d.location.model;

import com.gdgotp.d2d.common.enums.LocationType;
import com.gdgotp.d2d.common.types.Routable;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@SuperBuilder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Location extends Routable {
    private String id;
    private String name;
    private List<String> tag;
    private LocationType type;
    private int level;
    private long nodeId;
}
