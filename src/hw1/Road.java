package hw1;

public class Road implements Letable{
    private int dist;

    public Road(int dist) {
        this.dist = dist;
    }

    @Override
    public void doIt(RunAndJumpable r) {
        r.run(dist);
    }
}
