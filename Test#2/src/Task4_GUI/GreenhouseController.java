package Task4_GUI;

public class GreenhouseController {
    public static void main(String... args) {


        GreenhouseControls gc = new GreenhouseControls();
        gc.addEvent(gc.new Bell(900));
        Event[] eventList =
            { gc.new ThermostatNight(0),
                gc.new LightOn(200),
                gc.new LightOff(400),
                gc.new WaterOn(600),
                gc.new WaterOff(800),
                gc.new VentilationOn(1000),
                gc.new VentilationOff(1200),
                gc.new ThermostatDay(1800)
            };
        gc.addEvent(gc.new Restart(2400, eventList));
        if(args.length == 1)
            gc.addEvent(
                new GreenhouseControls.Terminate(
                    Long.parseLong(args[0])));
        gc.run();
    }
}
