/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modifierPublic;

/**
 *
 * @author Night's Watch
 */
public class mobil{
    
    public String merek;
    public double speed;
   
    public void setMerek(String merek){
        this.merek = merek;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    
    public String getMerek(){
        return merek;
    }
    public double getSpeed(){
        return speed;
    }
}