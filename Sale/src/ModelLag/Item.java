package ModelLag;
/**
* @author Gruppe 2 / DM71
* @date May 2010
*/
public class Item
{

    private String serialNumber;

    /**
     *
     * @param serialNumber
     */
    public Item(String serialNumber)
    {
        this.serialNumber = serialNumber;
    }

    /**
     *
     * @return the serialNumber
     */
    public String getSerialNumber()
    {
        return serialNumber;
    }

    /**
     *
     * @param sets the serialNumber
     */
    public void setSerialNumber(String serialNumber)
    {
        this.serialNumber = serialNumber;
    }

}
