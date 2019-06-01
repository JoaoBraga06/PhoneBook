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
 * Class that represents the DuplicatePhoneNumber exception
 * </p>
 */
public class DuplicatePhoneNumber extends Exception {

    /**
     * Creates a new instance of <code>DuplicatePhoneNumber</code> without
     * detail message.
     */
    public DuplicatePhoneNumber() {
        System.out.println("This phone number already exists."+'\n');
    }
}
