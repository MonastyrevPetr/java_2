package hw1;

public class Wall implements Letable{

    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(RunAndJumpable r) {
        r.jump(height);
    }
}
