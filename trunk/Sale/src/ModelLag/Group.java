/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ModelLag;

/**
 *
 * @author nn119171
 */
public class Group {

    double discount;
    int daysOfCredit;
    double maxCredit;

public Group(double discount, int daysOfCredit, double maxCredit) {
        this.discount = discount;
        this.daysOfCredit = daysOfCredit;
        this.maxCredit = maxCredit;
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

