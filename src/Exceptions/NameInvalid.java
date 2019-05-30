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
public class NameInvalid extends Exception {

    /**
     * Creates a new instance of <code>NameInvalid</code> without detail
     * message.
     */
    public NameInvalid() {
        System.out.println("Invalid Name."+'\n');
    }

}
