package com.Entity;

import java.util.Date;

public class Country {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_country.id
     *
     * @mbg.generated Tue Apr 23 11:36:19 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_country.code
     *
     * @mbg.generated Tue Apr 23 11:36:19 CST 2019
     */
    private String code;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_country.name
     *
     * @mbg.generated Tue Apr 23 11:36:19 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_country.name_en
     *
     * @mbg.generated Tue Apr 23 11:36:19 CST 2019
     */
    private String nameEn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_country.local_currency_code
     *
     * @mbg.generated Tue Apr 23 11:36:19 CST 2019
     */
    private String localCurrencyCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_country.publish_currency_code
     *
     * @mbg.generated Tue Apr 23 11:36:19 CST 2019
     */
    private String publishCurrencyCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_country.continent
     *
     * @mbg.generated Tue Apr 23 11:36:19 CST 2019
     */
    private String continent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_country.continent_en
     *
     * @mbg.generated Tue Apr 23 11:36:19 CST 2019
     */
    private String continentEn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_country.created_date
     *
     * @mbg.generated Tue Apr 23 11:36:19 CST 2019
     */
    private Date createdDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_country.modified_date
     *
     * @mbg.generated Tue Apr 23 11:36:19 CST 2019
     */
    private Date modifiedDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_country.status
     *
     * @mbg.generated Tue Apr 23 11:36:19 CST 2019
     */
    private Byte status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_country.id
     *
     * @return the value of base_country.id
     *
     * @mbg.generated Tue Apr 23 11:36:19 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_country.id
     *
     * @param id the value for base_country.id
     *
     * @mbg.generated Tue Apr 23 11:36:19 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_country.code
     *
     * @return the value of base_country.code
     *
     * @mbg.generated Tue Apr 23 11:36:19 CST 2019
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_country.code
     *
     * @param code the value for base_country.code
     *
     * @mbg.generated Tue Apr 23 11:36:19 CST 2019
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_country.name
     *
     * @return the value of base_country.name
     *
     * @mbg.generated Tue Apr 23 11:36:19 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_country.name
     *
     * @param name the value for base_country.name
     *
     * @mbg.generated Tue Apr 23 11:36:19 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_country.name_en
     *
     * @return the value of base_country.name_en
     *
     * @mbg.generated Tue Apr 23 11:36:19 CST 2019
     */
    public String getNameEn() {
        return nameEn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_country.name_en
     *
     * @param nameEn the value for base_country.name_en
     *
     * @mbg.generated Tue Apr 23 11:36:19 CST 2019
     */
    public void setNameEn(String nameEn) {
        this.nameEn = nameEn == null ? null : nameEn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_country.local_currency_code
     *
     * @return the value of base_country.local_currency_code
     *
     * @mbg.generated Tue Apr 23 11:36:19 CST 2019
     */
    public String getLocalCurrencyCode() {
        return localCurrencyCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_country.local_currency_code
     *
     * @param localCurrencyCode the value for base_country.local_currency_code
     *
     * @mbg.generated Tue Apr 23 11:36:19 CST 2019
     */
    public void setLocalCurrencyCode(String localCurrencyCode) {
        this.localCurrencyCode = localCurrencyCode == null ? null : localCurrencyCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_country.publish_currency_code
     *
     * @return the value of base_country.publish_currency_code
     *
     * @mbg.generated Tue Apr 23 11:36:19 CST 2019
     */
    public String getPublishCurrencyCode() {
        return publishCurrencyCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_country.publish_currency_code
     *
     * @param publishCurrencyCode the value for base_country.publish_currency_code
     *
     * @mbg.generated Tue Apr 23 11:36:19 CST 2019
     */
    public void setPublishCurrencyCode(String publishCurrencyCode) {
        this.publishCurrencyCode = publishCurrencyCode == null ? null : publishCurrencyCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_country.continent
     *
     * @return the value of base_country.continent
     *
     * @mbg.generated Tue Apr 23 11:36:19 CST 2019
     */
    public String getContinent() {
        return continent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_country.continent
     *
     * @param continent the value for base_country.continent
     *
     * @mbg.generated Tue Apr 23 11:36:19 CST 2019
     */
    public void setContinent(String continent) {
        this.continent = continent == null ? null : continent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_country.continent_en
     *
     * @return the value of base_country.continent_en
     *
     * @mbg.generated Tue Apr 23 11:36:19 CST 2019
     */
    public String getContinentEn() {
        return continentEn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_country.continent_en
     *
     * @param continentEn the value for base_country.continent_en
     *
     * @mbg.generated Tue Apr 23 11:36:19 CST 2019
     */
    public void setContinentEn(String continentEn) {
        this.continentEn = continentEn == null ? null : continentEn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_country.created_date
     *
     * @return the value of base_country.created_date
     *
     * @mbg.generated Tue Apr 23 11:36:19 CST 2019
     */
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_country.created_date
     *
     * @param createdDate the value for base_country.created_date
     *
     * @mbg.generated Tue Apr 23 11:36:19 CST 2019
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_country.modified_date
     *
     * @return the value of base_country.modified_date
     *
     * @mbg.generated Tue Apr 23 11:36:19 CST 2019
     */
    public Date getModifiedDate() {
        return modifiedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_country.modified_date
     *
     * @param modifiedDate the value for base_country.modified_date
     *
     * @mbg.generated Tue Apr 23 11:36:19 CST 2019
     */
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_country.status
     *
     * @return the value of base_country.status
     *
     * @mbg.generated Tue Apr 23 11:36:19 CST 2019
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_country.status
     *
     * @param status the value for base_country.status
     *
     * @mbg.generated Tue Apr 23 11:36:19 CST 2019
     */
    public void setStatus(Byte status) {
        this.status = status;
    }
}