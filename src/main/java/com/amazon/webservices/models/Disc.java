/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Disc 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5475415346521461514L;
    private int number;
    private List<Track> track;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Number")
    public int getNumber ( ) { 
        return this.number;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Number")
    public void setNumber (int value) { 
        this.number = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Track")
    public List<Track> getTrack ( ) { 
        return this.track;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Track")
    public void setTrack (List<Track> value) { 
        this.track = value;
    }
 
}
 