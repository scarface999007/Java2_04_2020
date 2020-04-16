public class Robot implements Runnable, Jumpable {

    private double runDistance;
    private double jumpHeight;

    public Robot(double runDistance, double jumpHeight) {
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }


    public void jump(double height) {
        System.out.println((jumpHeight > height) ? "Robot jump" : "Robot didn't jump");
    }

    public void run(double distance) {
        if(runDistance - distance >= 0){
            System.out.println("Robot run");
            runDistance -= distance;
        } else {
            System.out.println("Robot didn't run");
        }
    }
}
