public class Human implements Runnable, Jumpable {

    private double runDistance;
    private double jumpHeight;

    public Human(double runDistance, double jumpHeight) {
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }

    public void jump(double height) {
        System.out.println((jumpHeight > height) ? "Human jump" : "Human didn't jump");
    }

    public void run(double distance) {
        if(runDistance - distance >= 0){
            System.out.println("Human run");
            runDistance -= distance;
        } else {
            System.out.println("Human didn't run");
        }
    }
}
