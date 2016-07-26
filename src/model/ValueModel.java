/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 * Value for attribute.
 * @author lfo
 */
public class ValueModel {
    private AttributeModel owner;
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
    public void setOwner(AttributeModel owner) {
        this.owner = owner;
    }
    @Override
    public String toString() {
        //return this.owner.getAttributeName() + "{ " + this.value + " }";
        return this.value;
    }
    
}
