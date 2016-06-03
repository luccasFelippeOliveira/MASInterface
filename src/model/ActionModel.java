/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 * Represents a action.
 * @author lfo
 */
public class ActionModel {
    private String actionName;

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        /*TODO: Add input verification*/
        this.actionName = actionName;
    }
    
}
