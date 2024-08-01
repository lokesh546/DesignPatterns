package org.example.Visitor;

public class Hospital extends Client{

    private String hospitalInsurance;

    public Hospital(String address, String email, String name,String hospitalInsurance) {
        super(address, email, name);
        this.hospitalInsurance = hospitalInsurance;
    }

    @Override
    public void sendMail() {

    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
