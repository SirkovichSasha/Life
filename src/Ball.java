import java.util.Objects;

public class Ball {
    protected int ballNumder;

    public Ball(int ballNumder) {
        this.ballNumder = ballNumder;
    }
    public Ball() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ball)) return false;
        Ball ball = (Ball) o;
        return ballNumder == ball.ballNumder;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ballNumder);
    }

    @Override
    public String toString() {
        return "Ball{" +
                "ballNumder=" + ballNumder +
                '}';
    }
}
