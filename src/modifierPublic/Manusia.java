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
public class Manusia extends modifierPublic.mobil{
    public static void main(String[] args){
        Manusia data = new Manusia();
        data.setMerek("SUZUKI");
        data.setSpeed((int) 280.0);
        System.out.println("Saya Mempunyai Mobil "+data.getMerek());
        System.out.println("Dengan Kecepatan "+data.getSpeed()+" Km/jam");
    }
}