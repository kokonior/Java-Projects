/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfisme;

/**
 *
 * @author ScupidC0des
 */
public class main {
    public static void main (String [] args)
    {
        hewan oop;
        kucing k = new kucing ();
        oop = k;
        oop.suara();
        oop.makan();
        
        ayam a = new ayam ();
        oop = a;
        oop.suara();
        oop.makan();
    }
}
