package Exceptions;

/**
 * <h3>
 * ESTG - Escola Superior de Tecnologia e Gestão<br>
 * IPP - Instituto Politécnico do Porto <br>
 * LEI - Licenciatura em Engenharia Informática<br>
 * PP - Paradigmas de Programação<br>
 * </h3>
 * <p>
 * <strong>Descrição: </strong><br>
 * Class that represents the PhoneNumberInvalid exception
 * </p>
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
