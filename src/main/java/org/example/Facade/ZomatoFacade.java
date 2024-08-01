package org.example.Facade;

public class ZomatoFacade {

    private Restarunt restarunt;

    private DeliveryBoy deliveryBoy;

    private Delivery delivery;

    public void placeOrder() {
        restarunt.prepareOrder();
        delivery.assignDeliveryBoy();
        deliveryBoy.picUpOrder();
        deliveryBoy.deliverOrder();
    }
}
