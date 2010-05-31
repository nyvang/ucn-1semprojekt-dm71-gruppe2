package ModelLag;

/**
 *
 * @author nn119171
 */
public class Group {

    double discount;
    int daysOfCredit;
    double maxCredit;
    int id;

public Group(double discount, int daysOfCredit, double maxCredit) {
        this.discount = discount;
        this.daysOfCredit = daysOfCredit;
        this.maxCredit = maxCredit;
        id = generateID();
    }

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

public int getId()
{
    return id;
}

public int getDaysOfCredit() {
        return daysOfCredit;
    }

public void setDaysOfCredit(int daysOfCredit) {
        this.daysOfCredit = daysOfCredit;
    }

public double getDiscount() {
        return discount;
    }

public void setDiscount(double discount) {
        this.discount = discount;
    }

public double getMaxCredit() {
        return maxCredit;
    }

public void setMaxCredit(double maxCredit) {
        this.maxCredit = maxCredit;
    }





}

