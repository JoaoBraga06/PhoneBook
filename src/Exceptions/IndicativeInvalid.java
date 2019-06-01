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
 * Class that represents the IndicativeInvalid exception
 * </p>
 */
public class IndicativeInvalid extends Exception {

    /**
     * Creates a new instance of <code>IndicativeInvalid</code> without detail
     * message.
     */
    public IndicativeInvalid() {
        System.out.println("Invalid Indicative."+'\n');
    }
}
