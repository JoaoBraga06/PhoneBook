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
 * Class that represents the NameInvalid exception
 * </p>
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
