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
public class Player {
  String name;
int speed;
int healthpoin;
    int healthPoin;

void run(){
    System.out.println(name + "is running");
    System.out.println("Speed:" + speed);
}

boolean isDead(){
      int healthPoin = 0;
    if(healthPoin<=0)return true;
    return false ;
}
}
