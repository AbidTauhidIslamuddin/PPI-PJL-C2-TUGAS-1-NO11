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
public class Manusia extends Hewan{
    public static void main(String[] args){
        Manusia data = new Manusia();
        data.setHidup(true);
        System.out.println("Makanan Saya: "+data.makanan);
        System.out.println("Saya Hidup: "+data.getHidup());
    }
}