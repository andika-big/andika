/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlayerBig;

/**
 *
 * @author User
 */
public class Game {
    public static void main(String [] argh){
        Player petani = new Player();
        
        petani.name="Petani kode";
        petani.speed=80;
        petani.healthPoin=100
                petani.run();
                if(petani.isDead()){
                    System.out.println("Game Over");
                }
    }
}
