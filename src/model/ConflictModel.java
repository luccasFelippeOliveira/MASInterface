/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 * Represents a conflict between norms
 * @author lfo
 */
public class ConflictModel {
    private String conflictedNorms;
    
    public ConflictModel(long[] conflicts) {
        conflictedNorms = "( ";
        for(long l : conflicts){
            conflictedNorms += Long.toString(l) + " ";
        }
        conflictedNorms += ")";
    }
    
    public String getConflictedNorms() {
        return conflictedNorms;
    }
    
    public void setConflictedNorms(long[] conflictedNorms) {
        this.conflictedNorms = "( ";
        for(long l : conflictedNorms){
            this.conflictedNorms += Long.toString(l) + " ";
        }
        this.conflictedNorms += ")";
    }
    
}
