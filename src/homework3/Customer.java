package homework3;

public class Customer {
    private String name;
    private String lastname;
    private String phonNumber;
    private String city;
    private String street;
    private String houseNumber;

    public String getFullName() {
        String FLname = "Name: " + name + " Last Name: " + lastname;
        return FLname;
    }

    public String getFullAddress() {
        String fullAddress = "City: " + city + " Street: " + street + " House №: " + houseNumber;
        return fullAddress;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhonNumber() {
        return phonNumber;
    }

    public void setPhonNumber(String phonNumber) {
        this.phonNumber = phonNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }
}
