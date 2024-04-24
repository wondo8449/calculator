public class CircleCalculator extends Calculator{

    // 원의 넓이를 구하는 메서드, 매개변수로 입력된 원의 반지름을 받아와준다
    public double calculate(double radius) {
        // 결과값을 담을 변수 생성
        double result = 0.0;

        // 상수인 RATIO를 가져와서 원의 반지름을 구해 result에 담아준다
        result = radius * radius * RATIO;
        // 나온 결과를 List에 추가해 준다
        setResults(result);
        // 결과값을 리턴해준다
        return result;
    }
}
