// 공용으로 쓸 기능을 Calculator에 선언해놓았기 때문에 상속을 받아준다
public class CircleCalculator extends Calculator {

    // 입력되어 저장될 값을 외부에서 변경할 수 없게 private로 선언하여 준다
    private int radius;

    // 원주율은 절대 변하지 않을 값이기 때문에 static final을 통해 상수로 선언해준다
    private static final double RATIO = 3.14;

    // radius getter
    public int getRadius() {
        return radius;
    }

    // radius setter, 받아온 radius를 CircleCalculator의 radius에 저장한다
    public void setRadius(int radius) {
        this.radius = radius;
    }


    // 원의 넓이 연산을 실행하는 메서드, 이미 setter에서 입력된 값들로 실핼하기 때문에 매개변수는 필요없다
    public double calculate() {
        // 결과값을 담을 변수 생성
        double result = 0.0;

        // 연산을 실행하고 result에 저장해준다
        result = this.radius * this.radius * RATIO;

        // 결과값을 리턴해준다
        return result;
    }
}
