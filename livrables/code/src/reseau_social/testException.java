/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reseau_social;

/**
 *
 * @author germain.vincent
 */
public class testException {
  
  int j = 20, i = 0;

  try {

    System.out.println(j/i);

  } catch (ArithmeticException e) {

    System.out.println("Division par zéro !");

  }

  System.out.println("coucou toi !");

}
    

