package org.example.Visitor;

public class Bank extends Client{

    private String bankInsurance;

    public Bank(String name, String email, String address, String insurance) {
        super(name,email,address);
        this.bankInsurance = insurance;
    }


    @Override
    public void sendMail() {

    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
