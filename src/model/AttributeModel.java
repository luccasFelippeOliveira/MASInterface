/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Attribute Model.
 * @author lfo
 */
public class AttributeModel {
    private String attributeName;
    private List<ValueModel> values = null;
    
    public String getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    public void addValue(ValueModel val) {
        if(values == null) {
            /*Create List only when needed*/
            values = new ArrayList();
        }
        val.setOwner(this);
        values.add(val);
    }
    
    public List<ValueModel> getValues() {
        return this.values;
    }
    
    @Override
    public String toString() {
        return this.attributeName;
    }
}
