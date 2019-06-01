package PhoneBook;
import Enums.TypeId;
import Exceptions.*;

/**
 * <h3>
 * ESTG - Escola Superior de Tecnologia e Gestão<br>
 * IPP - Instituto Politécnico do Porto <br>
 * LEI - Licenciatura em Engenharia Informática<br>
 * PP - Paradigmas de Programação<br>
 * </h3>
 * <p>
 * <strong>Descrição: </strong><br>
 * Class that represents one Phone Book that can contain various valid contacts
 * </p>
 */
public class PhoneBook implements PhoneBookContract{
    /**
     * Initial Size
     */
    private static final int TAM_INI=1;
    
    /**
     * Increment Size
     */
    private static final int TAM_INC=1;
    
    /**
     * Decrement Size
     */
    private static final int TAM_DEC=1;
   
    /**
     * Contacts
     */
    private Contact[] contacts;

    /**
     * Construtor of Phone Book
     */
    public PhoneBook() {
        this.contacts= new Contact[TAM_INI];
    }

    @Override
    public boolean addContact(Contact c) {
        boolean IsAdded= true;
        
        try{
            for(int i=0;i<this.Size();i++){
                if(this.contacts[i].equalsContact(c))
                    throw new DuplicatePhoneNumber();
            }
            
            if(this.Size()==this.contacts.length)
                throw new SizeFull();
            
        }catch(DuplicatePhoneNumber e){
            IsAdded=false;
        }catch(SizeFull e){
            int i=0;
            
            Contact[] contact_tmp = new Contact[this.Size()+TAM_INC];
            for(Contact contact : this.contacts){
                contact_tmp[i]=contact;
                i++;
            }
            this.contacts=contact_tmp;
        }
        if(IsAdded){
            this.contacts[this.Size()]=c;
            System.out.println(c.getPhoneNumber()+" has been added to the phone book."+'\n');
        }
        
        return IsAdded;
    }

    @Override
    public boolean removeContact(String phoneNumber) {
        boolean IsRemoved=true;
        int i=0;
        
        try{
            if(this.Size()==0)
                throw new PhoneBookEmpty();
            
            while(i<this.Size() && (this.contacts[i].getPhoneNumber().compareTo(phoneNumber))!=0){
                i++;
            }
            if(i==this.Size())
                throw new PhoneNumberInvalid();
        } catch (PhoneBookEmpty | PhoneNumberInvalid e) {
            IsRemoved=false;
        }
        
        if(IsRemoved){
            for(i=0;i<this.Size()-1;i++){
                this.contacts[i]=this.contacts[i+1];
            }
            this.contacts[this.Size()-1]=null;
            if((this.contacts.length-this.Size())>=TAM_DEC){
                Contact[] contact_temp = new Contact[this.Size()];
                for(int j=0;j<this.Size();j++){
                    contact_temp[j]=this.contacts[j];
                }
                this.contacts=contact_temp;
            }
            System.out.println(phoneNumber+" has been removed from the phone book."+'\n');
        }
        
        return IsRemoved;
    }

    @Override
    public Contact getContact(String phoneNumber) {
        boolean IsContact=true;
        int i=0;
        
        try{
            if(this.Size()==0)
                throw new PhoneBookEmpty();
            while(i<this.Size() && (this.contacts[i].getPhoneNumber().compareTo(phoneNumber))!=0){
                i++;
            }
            if(i==this.Size())
                throw new PhoneNumberInvalid();
        }catch(PhoneBookEmpty | PhoneNumberInvalid e){
            IsContact=false;
        }
        if(IsContact)
            return this.contacts[i];
        else
            return null;
    }

    @Override
    public void listContacts() {
        try{
            if(this.Size()==0)
                throw new PhoneBookEmpty();
            for(Contact contact : this.contacts){
                if(contact.getType()==TypeId.I){
                    System.out.println("Name: "+contact.getName()+" "+contact.getLastName());
                    System.out.println("Country: "+contact.getCountry());
                    System.out.println("Phone Number: "+contact.getPhoneNumber()+'\n');
                }
            }
        }catch(PhoneBookEmpty e){
            
        }
    }
    
    /**
     * Calculates the number of contacts in the phone book
     * 
     * @return Number of contacts
     */
    private int Size(){
        int i=0;
        while(i<this.contacts.length && this.contacts[i]!=null){
            i++;
        }
        return i;
    }    
}
