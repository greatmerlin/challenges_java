package FFHS;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Client {

    private final SimpleStringProperty firstName = new SimpleStringProperty("");
    private final SimpleStringProperty lastName = new SimpleStringProperty("");
//    private final SimpleIntegerProperty income = new SimpleIntegerProperty(0);
    private final SimpleStringProperty dateOfBirth = new SimpleStringProperty("");

    public Client(){
        this("","","");
    }

    public Client(String firstName, String lastName, String dateOfBirth){
        setFirstName(firstName);
        setLastName(lastName);
//        setIncome(income);
        setDateOfBirth(dateOfBirth);
    }

    public String getFirstName() {
        return firstName.get();
    }

    public SimpleStringProperty firstNameProperty() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }

    public String getLastName() {
        return lastName.get();
    }

    public SimpleStringProperty lastNameProperty() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName.set(lastName);
    }

//    public int getIncome() {
//        return income.get();
//    }
//
//    public SimpleIntegerProperty incomeProperty() {
//        return income;
//    }
//
//    public void setIncome(int income) {
//        this.income.set(income);
//    }

    public String getDateOfBirth() {
        return dateOfBirth.get();
    }

    public SimpleStringProperty dateOfBirthProperty() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth.set(dateOfBirth);
    }
}
