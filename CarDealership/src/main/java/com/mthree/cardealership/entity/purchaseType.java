/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mthree.cardealership.entity;

/**
 *
 * @author yond1
 */
public class purchaseType {
    /*
    create table purchaseType(
	purchaseTypeID int primary key,
    `type` varChar(15)
);
    */
    private int purchaseTypeId;
    private String type;

    public purchaseType() {
    }

    public purchaseType(int purchaseTypeId, String type) {
        this.purchaseTypeId = purchaseTypeId;
        this.type = type;
    }

    public int getPurchaseTypeId() {
        return purchaseTypeId;
    }

    public void setPurchaseTypeId(int purchaseTypeId) {
        this.purchaseTypeId = purchaseTypeId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
}
