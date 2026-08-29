package chap04;


public class TrafficLight {
    private String label;
    private TrafficLight nextLight;

    public static final TrafficLight RED ;
    public static final TrafficLight YELLOW ;
    public static final TrafficLight GREEN ;
    static {
        RED = new TrafficLight("红");
        YELLOW = new TrafficLight("黄");
        GREEN = new TrafficLight("绿");
        RED.nextLight = GREEN;
        YELLOW.nextLight = RED;
        GREEN.nextLight =YELLOW;
    }
    public String getLabel() {
        return label;
    }
    public TrafficLight getNextLight() {
        return nextLight;
    }



    public TrafficLight(String label) {
        this.label = label;

    }
}
