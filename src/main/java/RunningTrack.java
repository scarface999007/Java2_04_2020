public class RunningTrack extends Barrier {
    private int length;

    public RunningTrack(int length) {
        this.length = length;
    }

    public void isRunDistance(Runnable runnable){
        runnable.run(length);
    }


}
