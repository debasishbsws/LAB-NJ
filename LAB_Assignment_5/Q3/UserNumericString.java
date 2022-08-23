package LAB_Assignment_5.Q3;

public class UserNumericString extends Exception {
    // user Define exception thrown before when a String contains number valus as
    // subtring
    public UserNumericString() {
        super();
    }

    // toString()
    @Override
    public String toString() {
        return "UserNumericString: String contains number valus as subtring";
    }
}
