/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class BrowseNode 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4989043315739281531L;
    private String browseNodeId;
    private String name;
    private Boolean isCategoryRoot;
    private Properties properties;
    private Children children;
    private Ancestors ancestors;
    private TopSellers topSellers;
    private NewReleases newReleases;
    private List<TopItemSet> topItemSet;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("BrowseNodeId")
    public String getBrowseNodeId ( ) { 
        return this.browseNodeId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("BrowseNodeId")
    public void setBrowseNodeId (String value) { 
        this.browseNodeId = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Name")
    public void setName (String value) { 
        this.name = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("IsCategoryRoot")
    public Boolean getIsCategoryRoot ( ) { 
        return this.isCategoryRoot;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("IsCategoryRoot")
    public void setIsCategoryRoot (Boolean value) { 
        this.isCategoryRoot = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Properties")
    public Properties getProperties ( ) { 
        return this.properties;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Properties")
    public void setProperties (Properties value) { 
        this.properties = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Children")
    public Children getChildren ( ) { 
        return this.children;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Children")
    public void setChildren (Children value) { 
        this.children = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Ancestors")
    public Ancestors getAncestors ( ) { 
        return this.ancestors;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Ancestors")
    public void setAncestors (Ancestors value) { 
        this.ancestors = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("TopSellers")
    public TopSellers getTopSellers ( ) { 
        return this.topSellers;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("TopSellers")
    public void setTopSellers (TopSellers value) { 
        this.topSellers = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("NewReleases")
    public NewReleases getNewReleases ( ) { 
        return this.newReleases;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("NewReleases")
    public void setNewReleases (NewReleases value) { 
        this.newReleases = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("TopItemSet")
    public List<TopItemSet> getTopItemSet ( ) { 
        return this.topItemSet;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("TopItemSet")
    public void setTopItemSet (List<TopItemSet> value) { 
        this.topItemSet = value;
    }
 
}
 