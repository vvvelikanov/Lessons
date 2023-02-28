package Task4_GUI;

public class GreenhouseControls extends Controller{
    private boolean light = false;
    public class LightOn extends Event {
        public LightOn(long delayTime) {
            super(delayTime);
        }
        public void action() {
// Поместите сюда код управления оборудованием,
// выполняющий непосредственное включение света, light = true;
        }
        public String toString() {return "Свет включен";}
    }
    public class LightOff extends Event {
        public LightOff(long delayTime) {super(delayTime);}

        public void action() {
// Поместите сюда код управления оборудованием,
// выполняющий выключение света, light = false;
        }
        public String toString() {
            return "Свет выключен";
        }
    }

    private boolean water = false;
    public class WaterOn extends Event {
        public WaterOn(long delayTime) { super(delayTime); }
        public void action() {
// Здесь размещается код управления оборудованием, water = true;
        }
        public String toString() {return "Полив включен";}
    }

    public class WaterOff extends Event {
        public WaterOff(long delayTime) {super(delayTime);}
        public void action() {
// Здесь размещается код управления оборудованием, water = false;
        }
        public String toString() {return "Полив выключен";}
    }

    private String thermostat = "День";
    public class ThermostatNight extends Event {
        public ThermostatNight(long delayTime) { super(delayTime);}

        public void action() {
// Здесь размещается код управления оборудованием, thermostat = "Ночь";
        }
        public String toString() {return "Термостат использует ночной режим";}
    }

    public class ThermostatDay extends Event {
        public ThermostatDay(long delayTime) {super(delayTime);}
        public void action () {
// Здесь размещается код управления оборудованием, thermostat = "День";
        }
        public String toString () {return "Термостат использует дневной режим";}
    }

    public class VentilationOn extends Event{
        public VentilationOn(long delayTime){
            super(delayTime);
        }
        public void action() {}
        public void start() {super.start();}
        public String toString(){return "Проветрирование оранжереи включено";}
    }

    public class VentilationOff extends Event{
        public VentilationOff(long delayTime){
            super(delayTime);
        }
        public void action() {}
        public void start() {super.start();}
        public String toString(){return "Проветрирование оранжереи отключено";}
    }


    public class Bell extends Event {
        public Bell(long delayTime) {super(delayTime);}
        public void action() {addEvent(new Bell(delayTime));}
        public String toString() {return "Бам!";}
    }
    public class Restart extends Event {
        private Event[] eventList;
        public Restart(long delayTime, Event[] eventList) {
            super(delayTime);
            this.eventList = eventList;
            for(Event e : eventList) addEvent(e);
        }
        public void action() {
            for(Event e : eventList) {
                e.start(); // Перезапуск каждого события
                addEvent(e);
        }
            start(); // Перезапуск текущего события
            addEvent(this);
        }
        public String toString() {
            return "Перезапуск системы";
        }
    }
    public static class Terminate extends Event {
        public Terminate(long delayTime) { super(delayTime); }
        public void action() { System.exit(0); }
        public String toString() { return "Отключение"; }
    }
}
