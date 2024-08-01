package org.example.Visitor;

import java.util.List;

public class InsuranceVisitor implements Visitor{

    @Override
    public void visit(Bank bank) {

        // Send Mail
    }

    @Override
    public void visit(Hospital hospital) {
        // Send main
    }

    public void sendInsuranceDetails(List<Client> clientList) {
        clientList.forEach(client -> client.accept(this));
    }
}
