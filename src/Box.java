import java.util.Objects;

public class Box {
    protected Ball ball;

    public Box(Ball ball) {
        this.ball = ball;
    }

    public Box() {
        ball=new Ball();
    }

    @Override
    public String toString() {
        return "Box{" +
                "ball=" + ball.ballNumder +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Box)) return false;
        Box box = (Box) o;
        return ball.equals(box.ball);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ball.ballNumder);
    }
}
