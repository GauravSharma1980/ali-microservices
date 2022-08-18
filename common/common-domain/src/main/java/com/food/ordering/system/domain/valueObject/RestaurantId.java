package com.food.ordering.system.domain.valueObject;

import java.util.UUID;

public class RestaurantId extends BaseId<UUID>{
    public RestaurantId(UUID uuid){
        super(uuid);
    }
}
