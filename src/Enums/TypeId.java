package Enums;

/**
 * <h3>
 * ESTG - Escola Superior de Tecnologia e Gestão<br>
 * IPP - Instituto Politécnico do Porto <br>
 * LEI - Licenciatura em Engenharia Informática<br>
 * PP - Paradigmas de Programação<br>
 * </h3>
 * <p>
 * <strong>Descrição: </strong><br>
 * Class that represents the available types of id
 * </p>
 */
public enum TypeId {N,I;

    /**
     * Coverts TypeId to string
     * 
     * @param t Type of Id
     * @return String of the id type
     */
    public String TypeIdToString(TypeId t){
        switch(t){
            case N: return "National";
            case I: return "International";
            default: return "Invalid";
        }
    }
    
}
