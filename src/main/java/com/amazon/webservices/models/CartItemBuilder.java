/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;

public class CartItemBuilder {
    //the instance to build
    private CartItem cartItem;

    /**
     * Default constructor to initialize the instance
     */
    public CartItemBuilder() {
        cartItem = new CartItem();
    }

    public CartItemBuilder cartItemId(String cartItemId) {
        cartItem.setCartItemId(cartItemId);
        return this;
    }

    public CartItemBuilder quantity(String quantity) {
        cartItem.setQuantity(quantity);
        return this;
    }

    public CartItemBuilder aSIN(String aSIN) {
        cartItem.setASIN(aSIN);
        return this;
    }

    public CartItemBuilder sellerNickname(String sellerNickname) {
        cartItem.setSellerNickname(sellerNickname);
        return this;
    }

    public CartItemBuilder title(String title) {
        cartItem.setTitle(title);
        return this;
    }

    public CartItemBuilder productGroup(String productGroup) {
        cartItem.setProductGroup(productGroup);
        return this;
    }

    public CartItemBuilder metaData(MetaData164 metaData) {
        cartItem.setMetaData(metaData);
        return this;
    }

    public CartItemBuilder price(Price price) {
        cartItem.setPrice(price);
        return this;
    }

    public CartItemBuilder itemTotal(Price itemTotal) {
        cartItem.setItemTotal(itemTotal);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CartItem build() {
        return cartItem;
    }
}