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
 * Class that represents the PhoneBookEmpty exception
 * </p>
 */
public class PhoneBookEmpty extends Exception {

    /**
     * Creates a new instance of <code>PhoneBookEmpty</code> without detail
     * message.
     */
    public PhoneBookEmpty() {
        System.out.println("The phone book is empty."+'\n');
    }
}
