package prahl.daniel.abstract_class;

/**
 * Created by danielprahl on 5/1/17.
 */
public abstract class Account {
    private float balance;
    private String pin;

    {
        balance = 0.00f;
        pin = "0000";
    }


    public void credit(float value){
        balance += value;
    }

    public void debit(float value) {
        if(value < getBalance()){
            balance -= value;
        }
    }

    public float getBalance(){
        return balance;
    }

    public void setBalance() {
        // todo
    }

    public boolean verifyPin(String pin) {
        if(this.pin == pin){
            return true;
        }else {
            return false;
        }
    }

    private void setPin(String pin) {
        if(Integer.parseInt(pin) < 9999 && Integer.parseInt(pin) >= 0000) {
            this.pin = pin;
        }else{
            System.out.println("Error - PIN must be no more than 4 digits");
        }
    }

    public void updatePin(String oldPin, String newPin) {
        if(verifyPin(oldPin) == true){
            setPin(newPin);
        }else{
            System.out.println("Error - PIN entered does not match PIN on record");
        }
    }
}
