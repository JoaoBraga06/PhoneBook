package Demo;
import PhoneBook.*;

/**
 *
 * @author joaop
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Contacts
        Contact c = new Contact("Joao", "Brito", "123456789", "00PT", "Portugal");
        Contact s = new Contact("Braga","Bravo","910648193");
        Contact e = new Contact("Bas", "Dost", "759024998", "00ES", "Spain");
         
        //Phone Boook
        PhoneBook p = new PhoneBook();
        
        //Testing
        p.addContact(c);
        p.addContact(s);
        p.addContact(e);
        //p.removeContact("123456789");
        p.listContacts();
    }
    
}
