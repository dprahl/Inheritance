package prahl.daniel.abstract_class;

/**
 * Created by danielprahl on 5/1/17.
 */
public class SavingsAccount extends Account {
    private float interestRate;

    public SavingsAccount() {

    }

    public SavingsAccount(float interestRate) {
        this.interestRate = interestRate;
    }

    public void setInterestRate(float newRate) {
        this.interestRate = newRate;
    }

    public float getInterestRate() {
        return interestRate;
    }

}
