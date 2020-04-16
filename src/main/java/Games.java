public class Games {
    public static void main(String[] args) {

        Barrier [] barriers = new Barrier[3];
        barriers[0] = new RunningTrack(100);
        barriers[1] = new Wall(1);
        barriers[2] = new RunningTrack(50);

        Object [] participants = new Object[3];
        participants[0] = new Human(100, 1.5);
        participants[1] = new Cat(200, 4.0);
        participants[2] = new Robot(300, 1.0);

        for (int i = 0; i < 3; i++) {
            if(barriers[i] instanceof RunningTrack){
                RunningTrack r = (RunningTrack) barriers[i];
                for (int j = 0; j < 3; j++) {
                    if(participants[j] instanceof Human){
                        Human human = (Human) participants[j];
                        r.isRunDistance(human);
                    }
                    if(participants[j] instanceof Cat){
                        Cat cat = (Cat) participants[j];
                        r.isRunDistance(cat);
                    }
                    if(participants[j] instanceof Robot){
                        Robot robot = (Robot) participants[j];
                        r.isRunDistance(robot);
                    }
                }
            }
            if(barriers[i] instanceof Wall){
                Wall w = (Wall) barriers[i];
                for (int j = 0; j < 3; j++) {
                    if(participants[j] instanceof Human){
                        Human human = (Human) participants[j];
                        w.isJumpOverBerrier(human);
                    }
                    if(participants[j] instanceof Cat){
                        Cat cat = (Cat) participants[j];
                        w.isJumpOverBerrier(cat);
                    }
                    if(participants[j] instanceof Robot){
                        Robot robot = (Robot) participants[j];
                        w.isJumpOverBerrier(robot);
                    }
                }
            }
        }
    }
}
