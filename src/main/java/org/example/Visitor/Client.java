package org.example.Visitor;

public abstract class Client {

    private String name;

    private String email;

    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Client(String address, String email, String name) {
        this.address = address;
        this.email = email;
        this.name = name;
    }

    // Now we got a required to send mail

    public abstract void sendMail();


    public abstract void accept(Visitor visitor);
}
