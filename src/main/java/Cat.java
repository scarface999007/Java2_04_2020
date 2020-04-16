public class Cat implements Runnable, Jumpable {

    private double runDistance;
    private double jumpHeight;

    public Cat(double runDistance, double jumpHeight) {
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }

    /*public void decreaseRunDistance(double runningTrackLength){
        if((runDistance - runningTrackLength) >= 0){
            runDistance -= runningTrackLength;
        }
    }*/

    public void jump(double height) {
        System.out.println((jumpHeight > height) ? "Cat jump" : "Cat didn't jump");
    }

    public void run(double distance) {
        if(runDistance - distance >= 0){
            System.out.println("Cat run");
            runDistance -= distance;
        } else {
            System.out.println("Cat didn't run");
        }
    }
}
