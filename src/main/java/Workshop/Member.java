package Workshop;

public class Member {
    private String name;
    private String address;
    private String phoneNumber;
    private String email;

    public Member(String name, String address, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }

    public String getEmail(){
        return email;
    }

    @Override
    public String toString(){
        return "Name: " + name + " Address: " + address + " Phone Number: " + phoneNumber + " Email: " + email + "\n";
    }
}
