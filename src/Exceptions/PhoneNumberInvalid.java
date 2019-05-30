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
public class PhoneNumberInvalid extends Exception {

    /**
     * Creates a new instance of <code>PhoneNumberInvalid</code> without detail
     * message.
     */
    public PhoneNumberInvalid() {
        System.out.println("Invalid Phone Number."+'\n');
    }

}
