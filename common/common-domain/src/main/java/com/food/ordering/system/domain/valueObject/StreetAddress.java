package com.food.ordering.system.domain.valueObject;

import java.util.Objects;
import java.util.UUID;

public class StreetAddress {
    private final UUID uuid;
    private final String street;
    private final String postalCode;
    private final String city;

    public StreetAddress(UUID uuid, String street, String postalCode, String city) {
        this.uuid = uuid;
        this.street = street;
        this.postalCode = postalCode;
        this.city = city;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getStreet() {
        return street;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StreetAddress that = (StreetAddress) o;
        return street.equals(that.street) && postalCode.equals(that.postalCode) && city.equals(that.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, postalCode, city);
    }
}

