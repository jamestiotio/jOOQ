/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.testcontainers.db.tables.records;


import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.example.testcontainers.db.tables.Country;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CountryRecord extends UpdatableRecordImpl<CountryRecord> implements Record3<Long, String, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.country.country_id</code>.
     */
    public void setCountryId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.country.country_id</code>.
     */
    public Long getCountryId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.country.country</code>.
     */
    public void setCountry(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.country.country</code>.
     */
    public String getCountry() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.country.last_update</code>.
     */
    public void setLastUpdate(LocalDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.country.last_update</code>.
     */
    public LocalDateTime getLastUpdate() {
        return (LocalDateTime) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Long, String, LocalDateTime> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Long, String, LocalDateTime> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Country.COUNTRY.COUNTRY_ID;
    }

    @Override
    public Field<String> field2() {
        return Country.COUNTRY.COUNTRY_;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return Country.COUNTRY.LAST_UPDATE;
    }

    @Override
    public Long component1() {
        return getCountryId();
    }

    @Override
    public String component2() {
        return getCountry();
    }

    @Override
    public LocalDateTime component3() {
        return getLastUpdate();
    }

    @Override
    public Long value1() {
        return getCountryId();
    }

    @Override
    public String value2() {
        return getCountry();
    }

    @Override
    public LocalDateTime value3() {
        return getLastUpdate();
    }

    @Override
    public CountryRecord value1(Long value) {
        setCountryId(value);
        return this;
    }

    @Override
    public CountryRecord value2(String value) {
        setCountry(value);
        return this;
    }

    @Override
    public CountryRecord value3(LocalDateTime value) {
        setLastUpdate(value);
        return this;
    }

    @Override
    public CountryRecord values(Long value1, String value2, LocalDateTime value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CountryRecord
     */
    public CountryRecord() {
        super(Country.COUNTRY);
    }

    /**
     * Create a detached, initialised CountryRecord
     */
    public CountryRecord(Long countryId, String country, LocalDateTime lastUpdate) {
        super(Country.COUNTRY);

        setCountryId(countryId);
        setCountry(country);
        setLastUpdate(lastUpdate);
        resetChangedOnNotNull();
    }
}
