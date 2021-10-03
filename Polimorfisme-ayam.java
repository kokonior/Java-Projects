/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfisme;

/**
 *
 * @author ScupidC0des
 */
public class ayam extends hewan{
    @Override
    void suara ()
    {
        System.out.println("Kok Kok");
    }
    @Override
    void makan ()
    {
        System.out.println("Jagung");
    }
}
