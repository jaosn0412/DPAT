public class MH377 extends AirTrafficControl {

    public MH377(Mediator mediator, String airplaneID){
        super(mediator, airplaneID);
    }

    @Override
    public void notify(String message) {
        System.out.println(this.airplaneID + " sent message : " + message);
    }

    public void receive(String message) {
        System.out.println(this.airplaneID + " received message : " + message);
    }
}