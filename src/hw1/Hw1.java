package hw1;

public class Hw1 {
    public static void main(String[] args) {
        RunAndJumpable[] participants={new Cat("Барсик"),
                                        new Cat("Мурзик", 100,1),
                                        new Cat("Барсик",200,0),
                                        new Human("Иванов"),
                                        new Human("Петров",100,2),
                                        new Human("Сидоров",1000,3),
                                        new Robot("E2D2"),
                                        new Robot("Железяка",900,20),
                                        new Robot("Робот",10000,100)};
        Letable[] let={new Wall(1),
                        new Road(100),
                        new Wall(2),
                        new Road(200),
                        new Wall(3),
                        new Road(300),
                        new Wall(4),
                        new Road(400),
                        new Wall(5),
                        new Road(500)};

        for (RunAndJumpable r: participants) {
            for (Letable letable:let) {
                letable.doIt(r);
                if (!r.isOnDist()){
                    break;
                }
            }
        }
    }
    
}
