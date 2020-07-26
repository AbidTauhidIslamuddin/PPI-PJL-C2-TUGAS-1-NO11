/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noAccessModifier;

/**
 *
 * @author Night's Watch
 */
public class mobil{
    public static void main(String[] args){
        mesin data = new mesin();
        data.setKecepatan(360.0);
        System.out.println("Kecepatan Mobil: "+data.getKecepatan()+" Km/Jam");
    }
}
