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
public class vehicleType {
     /*create table vehicleType(
	vehicleTypeID int primary key,
    `type` varChar(15)
    );
    */
    private int vehicleTypeId;
    private String type;

    public vehicleType() {
    }

    public vehicleType(int vehicleTypeId, String type) {
        this.vehicleTypeId = vehicleTypeId;
        this.type = type;
    }

    public int getVehicleTypeId() {
        return vehicleTypeId;
    }

    public void setVehicleTypeId(int vehicleTypeId) {
        this.vehicleTypeId = vehicleTypeId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
}
