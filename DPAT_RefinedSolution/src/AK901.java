public class AK901 extends AirTrafficControl {

    public AK901(Mediator mediator, String airplaneID){
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
