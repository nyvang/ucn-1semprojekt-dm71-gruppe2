/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ModelLag;
import java.util.ArrayList;

/**
 *
 * @author gruppe 2, dm71
 * @date may 2010
 */
public class ProductContainer
{
    private ArrayList<ProductDescription> stockList;
    private ArrayList<String> addressList;
    private ArrayList<String> buildingList;
    private String address;
    private String building;

    public ProductContainer( String address, String building) 
    {
        stockList = new ArrayList<ProductDescription>();
        addressList = new ArrayList<String>();
        buildingList = new ArrayList<String>();
        this.address = address;
        this.building = building;
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
     * @return the building
     */
    public String getBuilding()
    {
        return building;
    }

    /**
     * @param building the building to set
     */
    public void setBuilding(String building)
    {
        this.building = building;
    }

    /**
     *@param find ProductDescription
     */
    public void findProductDescription()
    {

    }

    /**
     *@param add ProductDescription
     */
    public void addProductDescription(ProductDescription proddescr)
    {
        stockList.add(proddescr);
    }





}
