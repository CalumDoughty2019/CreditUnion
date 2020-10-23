import java.util.Scanner;

public class Customer {
    //variables
    private static int count = 0;
    private int customerID = 0;
    private String name;
    private String addressLine1;
    private String addressLine2;
    private String postcode;
    private String phonenumber;

    public void setHasSavings(boolean hasSavings) {
        this.hasSavings = hasSavings;
    }

    private boolean hasSavings;


    //Constructors
    //default
    public Customer(){
        customerID=count++;
        name = "Bob";
        addressLine1 = "5 park road";
        addressLine2 = "Glasgow";
        postcode = "G64 1AA";
        phonenumber = "12345678901";
        hasSavings = false;
    }

    public Customer(String name, String addressLine1, String addressLine2, String postcode, String phonenumber){
        customerID=count++;
        this.name = name;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.postcode = postcode;
        this.phonenumber = phonenumber;
        hasSavings = false;
    }


    //getters and setters
    public int getCustomerID() {
        return customerID;
    }


    public boolean isHasSavings() {
        return hasSavings;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }




}
