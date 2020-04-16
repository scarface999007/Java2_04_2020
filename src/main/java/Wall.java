public class Wall extends Barrier {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public void isJumpOverBerrier(Jumpable jumpable){
        jumpable.jump(height);
    }
}
