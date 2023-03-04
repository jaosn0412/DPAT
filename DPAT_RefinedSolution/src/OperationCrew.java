public class OperationCrew{

    void landing(String airplane) {
        System.out.println("Operation Crew received message : " + airplane + " landing");
    }

    void emergency(String airplane) {
        System.out.println("<!> Operation Crew received message : " + airplane + " emergency landing");
    }
}