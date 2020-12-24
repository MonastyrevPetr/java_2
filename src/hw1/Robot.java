package hw1;

public class Robot implements RunAndJumpable{
    private String name;
    private int maxDist;
    private int maxJump;
    private boolean onDist;

    public Robot(String name, int maxDist, int maxJump) {
        this.name = name;
        this.maxDist = maxDist;
        this.maxJump = maxJump;
        onDist=true;
    }

    public Robot(String name) {
        this.name = name;
        maxDist=1000;
        maxJump=10;
        onDist=true;
    }

    public boolean isOnDist() {
        return onDist;
    }

    @Override
    public void run(int dist) {
        if (maxDist>=dist){
            System.out.println(name+" пробежал "+dist+"м");
            maxDist=maxDist-dist;
        }else {
            System.out.println(name+" не пробежал "+dist+"м");
            onDist=false;
        }

    }

    @Override
    public void jump(int height) {
        if (maxJump>=height){
            System.out.println(name+" перепрыгнул "+height+"м");

        }else {
            System.out.println(name+" не перепрыгнул "+height+"м");
            onDist=false;
        }
    }
}
