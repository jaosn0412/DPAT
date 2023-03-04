public abstract class AirTrafficControl {

    protected Mediator mediator;
    protected String airplaneID;

    public AirTrafficControl(Mediator mediator, String airplaneID){
        this.mediator = mediator;
        this.airplaneID = airplaneID;
    }

    public abstract void notify(String message);
    public abstract void receive(String message);
}
