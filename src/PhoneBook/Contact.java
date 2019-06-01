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
 * Class that represents one contact
 * </p>
 */
public class Contact {
    /**
     * Name
     */
    private String name;
    
    /**
     * Last Name
     */
    private String lastName;
    
    /**
     * Phone Number
     */
    private String phoneNumber;
    
    /**
     * Type
     */
    private TypeId type;
    
    /**
     * Indicative
     */
    private String id;
    
    /**
     * Country
     */
    private String country;

    /**
     * Constructor of a nacional contact
     * 
     * @param name First Name
     * @param lastName Last Name
     * @param phoneNumber Phone Number
     */
    public Contact(String name, String lastName, String phoneNumber) {
        this.setName(name);
        this.setLastName(lastName);
        this.setPhoneNumber(phoneNumber);
        this.type=TypeId.N;
    }

    /**
     * Construcot of a internacinal contact
     * 
     * @param name First Name
     * @param lastName Last Name
     * @param phoneNumber Phone Number
     * @param id Indicative
     * @param country Country
     */
    public Contact(String name, String lastName, String phoneNumber, String id, String country) {
        this.setName(name);
        this.setLastName(lastName);
        this.setPhoneNumber(phoneNumber);
        this.setId(id);
        this.setCountry(country);
        this.type=TypeId.I;
    }
   
    
    
     /**
      * Validation of one name
      * 
     * @param name the name to validate
     * @return Sucess
     */
    public boolean ValidateNames(String name) {
        boolean IsValid=true;
        try{
            if(name.isEmpty() || name.contains(" ") || (name.charAt(0)<65 || name.charAt(0)>90))
                throw new NameInvalid();
                                
            for(int i=1;i<name.length();i++){
                if(name.charAt(i)>=65 && name.charAt(i)<=90)
                    throw new NameInvalid();
            }
            
        }catch(NameInvalid e){
            IsValid=false;
        }
        
        return IsValid;
    }


    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public boolean setPhoneNumber(String phoneNumber) {
        boolean IsValid=true;
        try{
            if(phoneNumber.length()!=9)
                throw new PhoneNumberInvalid();
            for(int i=0;i<phoneNumber.length();i++){
                if(phoneNumber.charAt(i)<48 || phoneNumber.charAt(i)>57)
                    throw new PhoneNumberInvalid();
            }
        }catch(PhoneNumberInvalid e){
            IsValid=false;
        }
        
        if(IsValid)
            this.phoneNumber=phoneNumber;
        
        return IsValid;
    }
    
    /**
     * Checks if there is the contact has the same phone number
     * 
     * @param c Contact
     * @return If the phone number is equal
     */
    public boolean equalsContact(Contact c){
        return this.phoneNumber==c.phoneNumber;
    }

    /**
     * @return the type
     */
    public TypeId getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(TypeId type) {
        this.type = type;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public boolean setId(String id) {
        boolean IsValid=true;
        try{
            if(id.length()!=4 || (id.charAt(0)!=48 && id.charAt(1)!=48))
                throw new IndicativeInvalid();
        }catch(IndicativeInvalid e){
            IsValid=false;
        }
        
        if(IsValid)
            this.id=id;
        
        return IsValid;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public boolean setCountry(String country) {
        boolean IsValid=true;
        try{
            if(country.isEmpty() || (country.charAt(0)<65 && country.charAt(0)>90))
                throw new CountryInvalid();
            for(int i=1;i<country.length();i++){
                if(country.charAt(i)>=65 && country.charAt(i)<=90)
                    throw new CountryInvalid();
            }
        }catch(CountryInvalid e){
            IsValid=false;
        }
        
        if(IsValid)
            this.country=country;
        
        return IsValid;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        if(this.ValidateNames(name))
            this.name = name;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        if(this.ValidateNames(lastName))
            this.lastName = lastName;
    }
    
    
    
}
