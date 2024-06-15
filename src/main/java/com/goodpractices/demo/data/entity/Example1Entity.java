package com.goodpractices.demo.data.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "first_example")
public final class Example1Entity {

    // <<-FIELDS->>
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(unique = true, nullable = false)
    private String name;

    @NotBlank
    @Column(nullable = false)
    private String secret;

    @JsonProperty("additionalInfo")
    @NotBlank
    @Column(nullable = false)
    private String moreInfo;

    @JsonProperty("number")
    @NotNull
    @Min(18)
    @Column(nullable = false)
    private Integer numberField;

    // <<-CONSTRUCTOR->>
    public Example1Entity(){
        super();
    }

    // <<-GETTERS & SETTERS->>
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getMoreInfo() {
        return moreInfo;
    }

    public void setMoreInfo(String moreInfo) {
        this.moreInfo = moreInfo;
    }

    public Integer getNumberField() {
        return numberField;
    }

    public void setNumberField(Integer numberField) {
        this.numberField = numberField;
    }

}
