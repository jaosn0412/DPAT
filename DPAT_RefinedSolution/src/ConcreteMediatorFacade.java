import java.util.ArrayList;
import java.util.List;

public class ConcreteMediatorFacade implements Mediator {

    private List<AirTrafficControl> airplaneList;

    public ConcreteMediatorFacade(){
        this.airplaneList = new ArrayList<>();
    }

    @Override
    public void addAirplane(AirTrafficControl airplane){
        this.airplaneList.add(airplane);
    }

    @Override
    public void notifyAirplane(AirTrafficControl airplane, String message){
        for(AirTrafficControl atc : this.airplaneList){
            //message should not be received by sender
            if(atc != airplane){
                atc.receive(message);
            }
        }
    }

    public void landing(String airplane) {
        GroundCrew gc = new GroundCrew();
        gc.landing(airplane);
        OperationCrew oc = new OperationCrew();
        oc.landing(airplane);
    }

    public void emergency(String airplane) {
        GroundCrew gc = new GroundCrew();
        gc.emergency(airplane);
        OperationCrew oc = new OperationCrew();
        oc.emergency(airplane);
        FireCrew fc = new FireCrew();
        fc.emergency(airplane);
        RescueCrew rc = new RescueCrew();
        rc.emergency(airplane);
    }
}
