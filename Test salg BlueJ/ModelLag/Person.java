package ModelLag;

/**
 *
 * @author nn119171
 */
public class Person 
{
    private String name;
    private String address;
    private int phone;

    public Person(String name, String address, int phone)
    {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public Person()
    {
        this.name = null;
        this.address = null;
        this.phone = 0;
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
        this.name = name;
    }

    /**
     * @return the addres
     */
    public String getAddres() {
        return address;
    }

    /**
     * @param addres the addres to set
     */
    public void setAddres(String addres) {
        this.address = address;
    }

    /**
     * @return the phone
     */
    public int getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(int phone) {
        this.phone = phone;
    }

    
}
