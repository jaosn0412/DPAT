public interface Mediator {
    void addAirplane(AirTrafficControl airplane);
    void notifyAirplane(AirTrafficControl airplane, String message);
    void landing(String airplane);
    void emergency(String airplane);
}
