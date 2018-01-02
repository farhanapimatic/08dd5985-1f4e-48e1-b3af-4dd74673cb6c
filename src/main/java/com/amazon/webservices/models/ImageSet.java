/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ImageSet 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5003265590155039151L;
    private String category;
    private Image swatchImage;
    private Image smallImage;
    private Image thumbnailImage;
    private Image tinyImage;
    private Image mediumImage;
    private Image largeImage;
    private Image hiResImage;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Category")
    public String getCategory ( ) { 
        return this.category;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Category")
    public void setCategory (String value) { 
        this.category = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("SwatchImage")
    public Image getSwatchImage ( ) { 
        return this.swatchImage;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("SwatchImage")
    public void setSwatchImage (Image value) { 
        this.swatchImage = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("SmallImage")
    public Image getSmallImage ( ) { 
        return this.smallImage;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("SmallImage")
    public void setSmallImage (Image value) { 
        this.smallImage = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("ThumbnailImage")
    public Image getThumbnailImage ( ) { 
        return this.thumbnailImage;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("ThumbnailImage")
    public void setThumbnailImage (Image value) { 
        this.thumbnailImage = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("TinyImage")
    public Image getTinyImage ( ) { 
        return this.tinyImage;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("TinyImage")
    public void setTinyImage (Image value) { 
        this.tinyImage = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("MediumImage")
    public Image getMediumImage ( ) { 
        return this.mediumImage;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("MediumImage")
    public void setMediumImage (Image value) { 
        this.mediumImage = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("LargeImage")
    public Image getLargeImage ( ) { 
        return this.largeImage;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("LargeImage")
    public void setLargeImage (Image value) { 
        this.largeImage = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("HiResImage")
    public Image getHiResImage ( ) { 
        return this.hiResImage;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("HiResImage")
    public void setHiResImage (Image value) { 
        this.hiResImage = value;
    }
 
}
 