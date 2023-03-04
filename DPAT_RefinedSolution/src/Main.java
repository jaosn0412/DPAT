public class Main {

    public static void main(String[] args){
        Mediator mediator = new ConcreteMediatorFacade();
        AirTrafficControl ur718 = new UR718(mediator, "UR718");
        AirTrafficControl ak901 = new AK901(mediator, "AK901");
        AirTrafficControl mh377 = new MH377(mediator, "MH377");
        mediator.addAirplane(ur718);
        mediator.addAirplane(ak901);
        mediator.addAirplane(mh377);

        //scenario: Airplane MH377 sent message "MH377 Landing"
        mh377.notify("MH377 landing");

        //notify other airplanes on MH377 landing
        mediator.notifyAirplane(mh377, mh377.airplaneID + " landing");

        //notify respective crews on MH377 landing //required in normal landing
        mediator.landing(mh377.airplaneID);

        //notify respective crews on MH377 emergency landing //required in emergency landing
        //mediator.emergency(mh377.airplaneID);
    }
}
