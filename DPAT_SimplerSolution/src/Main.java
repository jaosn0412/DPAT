public class Main {
    public static void main(String[] args) {
        UR718 ur718 = new UR718("UR718");

        //for normal landing
        ur718.notifyMH377(ur718.getPlaneID(), "landing");
        ur718.notifyAK901(ur718.getPlaneID(), "landing");
        ur718.notifyLandingCrew(ur718.getPlaneID(), "landing");

        //for emergency landing
        //ur718.notifyMH377(ur718.getPlaneID(), "emergency-landing");
        //ur718.notifyAK901(ur718.getPlaneID(), "emergency-landing");
        //ur718.notifyEmergencyLandingCrew(ur718.getPlaneID(), "emergency-landing");
    }

}
class UR718 {
    GroundCrew gc = new GroundCrew();
    OperationCrew oc = new OperationCrew();
    FireCrew fc = new FireCrew();
    RescueCrew rc = new RescueCrew();

    public String message;
    public String planeID;

    UR718(String planeID) {
        this.planeID = planeID;
    }

    String getPlaneID(){
        return planeID;
    }

    void notifyMH377(String planeID, String msg){
        MH377 mh377 = new MH377("MH377");
        message = "<!> " + mh377.getPlaneID() + " received message : " + planeID + " " + msg;
        System.out.println(message);
    }

    void notifyAK901(String planeID, String msg){
        AK901 ak901 = new AK901("AK901");
        message = "<!> " + ak901.getPlaneID() + " received message : " + planeID + " " + msg;
        System.out.println(message);
    }

    void notifyLandingCrew(String planeID, String msg){
        gc.notified(planeID, msg);
        oc.notified(planeID, msg);
    }

    void notifyEmergencyLandingCrew(String planeID, String msg){
        gc.notified(planeID, msg);
        oc.notified(planeID, msg);
        fc.notified(planeID, msg);
        rc.notified(planeID, msg);
    }
}

class MH377 {
    GroundCrew gc = new GroundCrew();
    OperationCrew oc = new OperationCrew();
    FireCrew fc = new FireCrew();
    RescueCrew rc = new RescueCrew();

    public String message;
    public String planeID;

    MH377(String planeID) {
        this.planeID = planeID;
    }

    String getPlaneID(){
        return planeID;
    }

    void notifyUR718(String planeID, String msg){
        UR718 ur718 = new UR718("UR718");
        message = "<!> " + ur718.getPlaneID() + " received message : " + planeID + " " + msg;
        System.out.println(message);
    }

    void notifyAK901(String planeID, String msg){
        AK901 ak901 = new AK901("AK901");
        message = "<!> " + ak901.getPlaneID() + " received message : " + planeID + " " + msg;
        System.out.println(message);
    }

    void notifyLandingCrew(String planeID, String msg){
        gc.notified(planeID, msg);
        oc.notified(planeID, msg);
    }

    void notifyEmergencyLandingCrew(String planeID, String msg){
        gc.notified(planeID, msg);
        oc.notified(planeID, msg);
        fc.notified(planeID, msg);
        rc.notified(planeID, msg);
    }
}

class AK901 {
    GroundCrew gc = new GroundCrew();
    OperationCrew oc = new OperationCrew();
    FireCrew fc = new FireCrew();
    RescueCrew rc = new RescueCrew();

    public String message;
    public String planeID;

    AK901(String planeID) {
        this.planeID = planeID;
    }

    String getPlaneID(){
        return planeID;
    }

    void notifyUR718(String planeID, String msg){
        UR718 ur718 = new UR718("UR718");
        message = "<!> " + ur718.getPlaneID() + " received message : " + planeID + " " + msg;
        System.out.println(message);
    }

    void notifyMH377(String planeID, String msg){
        MH377 mh377 = new MH377("MH377");
        message = "<!> " + mh377.getPlaneID() + " received message : " + planeID + " " + msg;
        System.out.println(message);
    }

    void notifyLandingCrew(String planeID, String msg){
        gc.notified(planeID, msg);
        oc.notified(planeID, msg);
    }

    void notifyEmergencyLandingCrew(String planeID, String msg){
        gc.notified(planeID, msg);
        oc.notified(planeID, msg);
        fc.notified(planeID, msg);
        rc.notified(planeID, msg);
    }
}

class GroundCrew {
    public void notified(String sentAirplane, String message){
        System.out.println("<!> Ground Crew received message : " + sentAirplane + " " + message);
    }
}

class OperationCrew {
    public void notified(String sentAirplane, String message){
        System.out.println("<!> Operation Crew received message : " + sentAirplane + " " + message);
    }
}

class FireCrew {
    public void notified(String sentAirplane, String message){
        System.out.println("<!> Fire Crew received message : " + sentAirplane + " " + message);
    }
}

class RescueCrew {
    public void notified(String sentAirplane, String message){
        System.out.println("<!> Rescue Crew received message : " + sentAirplane + " " + message);
    }
}



