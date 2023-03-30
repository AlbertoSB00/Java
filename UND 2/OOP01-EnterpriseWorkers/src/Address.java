public class Address implements Cloneable {

    // Property.
    private String vieType;
    private String name;
    private int number;
    private String apartment;
    private String zipCode;
    private String town;

    // Methods.
    // Constructor for Address.
    public Address(String vieType, String name, int number, String apartment, String zipCode, String town){
        this.vieType = vieType;
        this.name = name;
        this.number = number;
        this.apartment = apartment;
        this.zipCode = zipCode;
        this.town = town;
    }

    // vieType
    public String getVieType(){ return vieType; }
    public void setVieType(String vieType){ this.vieType = vieType; }

    // name
    public String getName(){ return name; }
    public void setName(String name){ this.name = name; }

    // number
    public int getNumber(){ return number; }
    public void setNumber(int number){ this.number = number; }

    // apartment
    public String getApartment(){ return apartment; }
    public void setApartment(String apartment){ this.apartment = apartment; }

    // zipCode
    public String getZipCode(){ return zipCode; }
    public void setZipCode(String zipCode){ this.zipCode = zipCode; }

    // town
    public String getTown(){ return town; }
    public void setTown(String town){ this.town = town; }

    public String toString(){
        return "21.- Address: " + this.getVieType() + " " + this.getName() + " " + this.getNumber() + " " + this.getApartment() + " " + this.getZipCode() + " " + this.getTown();
    }

    public Address clone(){
        try{
            return (Address) super.clone();
        }
        catch (CloneNotSupportedException cnse){
            System.out.println("20.- The class doesn't implements the Cloneable interface.");
            return null;
        }
    }
}
