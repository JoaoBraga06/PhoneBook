/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author joaop
 */
public class CountryInvalid extends Exception {

    /**
     * Creates a new instance of <code>CountryInvalid</code> without detail
     * message.
     */
    public CountryInvalid() {
        System.out.println("Invalid Country."+'\n');
    }
}
