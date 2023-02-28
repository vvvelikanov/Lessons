package Tests;

//class SelectorString{//page 292
//        SelectorString(String name){this.name = name;}
//        String name;
//        public String toString(){
//                return name;
//        }
//}

/*class Outer{//page 292
        Outer(String name){this.name = name;}
        private String name;
        class Inner{
                public String toString(){
                        return name;
                }
        }
        Inner toInner(){
                return new Inner();
        }
}

class OutIn{
        Outer outer = new Outer("sd");
        Outer.Inner in = outer.new Inner();
        Outer.Inner in2 = outer.toInner();

}*/

/*class Outer{
        private String name = "dsss";

        void doIn(){
                Inner inner = new Inner();
                inner.doOut();
        }

        private void Output(){
                System.out.println(name);
        }
        class Inner{
                private void doOut(){
                        Output();
                        name = "re";
                        Output();
                }
        }

}*/

abstract class Monster{
        void menace() {

        }
}

class Monsters{
        public static Monster Dangerous(){
                return new Monster() {
                        public void menace() {
                                System.out.println("menace()");
                        }
                        public void destroy(){
                                System.out.println("destroy()");
                        }
                };
        }
        public static Monster Vamp(){
                return new Monster() {
                        public void menace() {
                                System.out.println("menace()");
                        }
                        public void destroy(){
                                System.out.println("destroy()");
                        }
                        public void kill(){
                                System.out.println("kill");
                        }
                        public void drinkBlood(){
                                System.out.println("drink blood");
                        }
                };
        }
}

public class Second {
        public static void main(String[] args) {
                Monster m = Monsters.Dangerous();
                m.menace();
                Monster v = Monsters.Vamp();

        }
}


