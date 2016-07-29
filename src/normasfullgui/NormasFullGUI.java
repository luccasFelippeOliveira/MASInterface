/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package normasfullgui;

import gui.MainEx;
import initialization.Init;



/**
 * NormasFullGUI is a gui interface for norms.
 * @author luccas
 */
public class NormasFullGUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new MainEx().setVisible(true);
            }
        });
    }
    
}
