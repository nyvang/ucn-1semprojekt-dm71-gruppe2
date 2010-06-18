package ModelLag;

/**
 * @author Gruppe 2 / DM71
 * @date May 2010
 */

/*
 * The item class is only used, if an item with a serial number is entered in the UI
 */

public class Item
{

    private String serialNumber;

    /**
     *
     * @param serialNumber sets the serialNumber
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
