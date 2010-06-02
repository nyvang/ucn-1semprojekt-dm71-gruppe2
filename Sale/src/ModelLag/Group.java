package ModelLag;

/**
 * @author Gruppe 2 / DM71
 * @date May 2010
 */

public class Group
{

    double discount;
    int daysOfCredit;
    double maxCredit;
    int id;

    public Group(double discount, int daysOfCredit, double maxCredit)
    {
        this.discount = discount;
        this.daysOfCredit = daysOfCredit;
        this.maxCredit = maxCredit;
        id = generateID();
    }

    /**
     *
     * @return newID (Generates and returns newID)
     */
    public int generateID()
    {
        int index = 0;
        int newID = 0;
        if(GroupContainer.getInstance().getGroupList().size() != 0)
        {
            index = GroupContainer.getInstance().getGroupList().size() - 1;
            GroupContainer.getInstance().getGroupList().get(index);
            newID = getId() + 1;
        } //end if
        else
        {
            newID = 1;
        } //end else
        return newID;
    }

    /**
     *
     * @return Id for a specific group
     */
    public int getId()
    {
        return id;
    }

    /**
     *
     * @return daysOfCredit for a specific group
     */
    public int getDaysOfCredit()
    {
            return daysOfCredit;
    }

    /**
     *
     * @param sets daysOfCredit for at specific group
     */
    public void setDaysOfCredit(int daysOfCredit)
    {
            this.daysOfCredit = daysOfCredit;
    }

    /**
     *
     * @return discount for at specific group
     */
    public double getDiscount()
    {
            return discount;
    }

    /**
     *
     * @param sets discount for at specific group
     */
    public void setDiscount(double discount)
    {
            this.discount = discount;
    }

    /**
     *
     * @return maxCredit for at specific group
     */
    public double getMaxCredit()
    {
            return maxCredit;
    }

    /**
     *
     * @param sets maxCredit for at specific group
     */
    public void setMaxCredit(double maxCredit)
    {
            this.maxCredit = maxCredit;
    }

}

