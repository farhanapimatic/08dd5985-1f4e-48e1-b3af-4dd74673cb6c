/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class VariationAttributes 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5036096229246900962L;
    private List<VariationAttribute> variationAttribute;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("VariationAttribute")
    public List<VariationAttribute> getVariationAttribute ( ) { 
        return this.variationAttribute;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("VariationAttribute")
    public void setVariationAttribute (List<VariationAttribute> value) { 
        this.variationAttribute = value;
    }
 
}
 