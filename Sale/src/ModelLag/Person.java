package ModelLag;

/**
 * @author Gruppe 2 / DM71
 * @date May 2010
 */

public class Person
{
    private String name;
    private String address;
    private int phone;

    /**
     * @param construct class Person with parameters
     */
    public Person(String name, String address, int phone)
    {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    /**
     * @param construct class Person without parameters
     */
    public Person()
    {
        this.name = null;
        this.address = null;
        this.phone = 0;
    }

    /**
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * @return the address
     */
    public String getAddress()
    {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address)
    {
        this.address = address;
    }

    /**
     * @return the phone
     */
    public int getPhone()
    {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(int phone)
    {
        this.phone = phone;
    }

    
}
