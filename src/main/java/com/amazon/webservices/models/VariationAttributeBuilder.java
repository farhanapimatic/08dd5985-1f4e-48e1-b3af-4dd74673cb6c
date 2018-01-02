/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;

public class VariationAttributeBuilder {
    //the instance to build
    private VariationAttribute variationAttribute;

    /**
     * Default constructor to initialize the instance
     */
    public VariationAttributeBuilder() {
        variationAttribute = new VariationAttribute();
    }

    public VariationAttributeBuilder name(String name) {
        variationAttribute.setName(name);
        return this;
    }

    public VariationAttributeBuilder value(List<String> value) {
        variationAttribute.setValue(value);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public VariationAttribute build() {
        return variationAttribute;
    }
}