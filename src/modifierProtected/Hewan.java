/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modifierProtected;

/**
 *
 * @author Night's Watch
 */
public class Hewan {
    
    protected String makanan = "Daging dan Ikan";
    protected boolean hidup;
    
    protected void setHidup(boolean hidup){
        this.hidup = hidup;
    }
    protected boolean getHidup(){
        return hidup;
    }
}