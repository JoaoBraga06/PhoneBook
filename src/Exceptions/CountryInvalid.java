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
 * Class that represents the CountryInvalid exception
 * </p>
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
