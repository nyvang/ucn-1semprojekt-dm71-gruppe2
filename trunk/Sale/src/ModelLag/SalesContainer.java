package ModelLag;
import java.util.ArrayList;

/**
 *
 * @author Anita gruppe 2, dm71
 * @date May 2010
 */
public class SalesContainer
{

    private ArrayList<Sale> salesList;
    private static SalesContainer instance;

    /**
     * @param construct class SalesContainer without parameters
     */
    public SalesContainer()
    {
        salesList = new ArrayList<Sale>();
    }

    /**
     * @param instance create singleton
     */
    public static SalesContainer getInstance()
    {
        if(instance == null)
           {
              instance = new SalesContainer();
           }
        return instance;
    }

    /**
     * @return the salesList
     */
    public ArrayList<Sale> getSalesList()
    {
        return salesList;
    }

    /**
     *Generates ID for next Sale created in system
     */
    public int generateID()
    {
        int index = 0;
        int newID = 0;
        if(getSalesList().size() != 0)
        {
        index = getSalesList().size() - 1;
        Sale s = getSalesList().get(index);
        newID = s.getSaleID() + 1;
        }//end if
        else
        {
            newID = 1;
        }//end else
        return newID;
    }

    /**
     * @param s adds Sale s to salesList
     */
    public void addSale(Sale s)
    {
        getSalesList().add(s);
    }

}
