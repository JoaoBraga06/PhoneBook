package PhoneBook;

/**
 * <h3>
 * ESTG - Escola Superior de Tecnologia e Gestão<br>
 * IPP - Instituto Politécnico do Porto <br>
 * LEI - Licenciatura em Engenharia Informática<br>
 * PP - Paradigmas de Programação<br>
 * </h3>
 * <p>
 * <strong>Descrição: </strong><br>
 * Interface that represents the Contract that is applied in the class Phone Book
 * </p>
 */
public interface PhoneBookContract {    
    /**
     * Adds a valid contact to the phone book
     * 
     * @param c Contact to add
     * @return Sucess
     */
    public boolean addContact(Contact c);
    
    /**
     * Removes a contact in the phone book
     * 
     * @param phoneNumber Phone number of the contact to remove
     * @return Sucess
     */
    public boolean removeContact(String phoneNumber);
    
    /**
     * Gets a contact based on the phone number
     * 
     * @param phoneNumber Phone number of the contact
     * @return Contact
     */
    public Contact getContact(String phoneNumber);
    
    /**
     * Prints all the international contacts in the phone book
     */
    public void listContacts();
}
