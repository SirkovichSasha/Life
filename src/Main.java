import java.util.HashMap;

public class Main {

    //==========================// homework 1 ============================================
    public static Ball getBallByNumber(Box[]boxes, int number){
        for (Box oneBox:boxes) {
            if(oneBox.ball.ballNumder==number)
                return oneBox.ball;
        }
        return null;
    }

    //==========================// homework 2 ============================================
    public static int getDifferentBallsNumber(Box[]boxes){
        int number=-1;
        int differentBalls=0;
        for (Box oneBox:boxes) {
            if(oneBox.ball.ballNumder>number)
            {
                differentBalls++;
                number=oneBox.ball.ballNumder;
            }
        }
        return differentBalls;
    }

    //==========================// homework 2 option 2 ============================================
    public static int getDifferentBallsNumber2(Box[]boxes){

        int differentBalls=0;
        Ball beforeBall=new Ball(-1);
        for (Box oneBox:boxes) {
            if(oneBox.ball!=beforeBall)
            {
                differentBalls++;
                beforeBall=oneBox.ball;
            }
        }
        return differentBalls;
    }

    //=========================homework 3======================
    public static int getDifferentBallsNumber3(Box[]boxes) {

        int differentBalls=0;
        HashMap<Ball,Integer>balls=new HashMap<>();
        for (Box oneBox:boxes)
        {
            if(!balls.containsKey(oneBox.ball))
               balls.put(oneBox.ball,0);
            balls.put(oneBox.ball,balls.get(oneBox.ball)+1);
        }
//        for (Ball oneBall:balls.keySet()) {
//            if(balls!=null) differentBalls++;
//        }
        //return differentBalls;

        return balls.size();

    }


        public static void main(String[] args) {
//        //============= set of boxes array
//        Box [] boxes=new Box[10];
//        for (int i=0;i<9;i++) {
//            boxes[i].ball.ballNumder=i*2;
//            System.out.println(boxes[i]);
//        }

        Ball ball1=new Ball(2);
        Ball ball2=new Ball(4);
        Ball ball3=new Ball(8);
        //
        Box b1=new Box(ball1);
        Box b2=new Box(ball2);
        Box b3=new Box(ball3);
        Box [] boxes=new Box[]{b1,b2,b2,b3};


        System.out.println("Find ball with number 8 : "+getBallByNumber(boxes,8));
        System.out.println("Different boxes number(1) : "+getDifferentBallsNumber(boxes));
        System.out.println("Different boxes number(2) : "+getDifferentBallsNumber2(boxes));
        System.out.println("Different boxes number(3) : "+getDifferentBallsNumber3(boxes));
    }
}
