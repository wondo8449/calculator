import java.util.ArrayList;
import java.util.List;

public class Calculator {

    // 메인 메소드에서 접근할 수 있도록 접근 제어자는 public으로 설정해주고 return 타입은 계산 결과를
    // List 객체에 담아 리턴해줄 것이기 때문에 List로 설정해준다. 매개변수로는 두 개의 양의 정수,
    // 사칙연산 기호를 각각 받아오도록 설정하여 계산을 담당할 메소드를 만들어준다
    public List<Integer> calculator(int firstNumber, int secondNumber, char symbol){
        // 결과 값을 담아 리턴할 List 객체 생성
        List<Integer> results = new ArrayList<>();
        // 결과값과 나머지를 담기 위한 변수 생성
        int result = 0, rest = 0;

        // 받아온 매개변수로 switch문 실행
        switch (symbol) {
            // + 일 때의 연산 실행
            case '+':
                result = firstNumber + secondNumber;
                System.out.println("result : " + result);
                // 더 이상 switch문을 돌지 않도록 break를 설정
                break;
            // - 일 때의 연산 실행
            case '-':
                result = firstNumber - secondNumber;
                System.out.println("result : " + result);
                break;
            // * 일 때의 연산 실행
            case '*':
                result = firstNumber * secondNumber;
                System.out.println("result : " + result);
                break;
            // / 일 때의 연산 실행
            case '/':
                // 만약 입력받은 두 번째 정수가 0이 아니라면 try 문 안에 연산 실행
                try {
                    // 나눗셈의 몫을 담아주는 부분
                    result = firstNumber / secondNumber;
                    // 나눗셈의 나머지를 담아주는 부분
                    rest = firstNumber % secondNumber;
                    System.out.println("몫 : " + result);
                    System.out.println("나머지 : " + rest);
                // catch문을 통해 두 번째 정수가 0이라면 Exception을 잡도록 설계
                } catch (ArithmeticException e) {
                    // 만약 입력받은 두 번째 정수가 0이라면 입력될 수 없다는 문구 출력
                    System.out.println("나눗셈에서 두 번째 정수에는 0이 입력될 수 없습니다.");
                }
                break;
            // 사칙연산 기호가 잘못 입력된 경우 출력
            default:
                System.out.println("사칙연산 기호를 확인해주세요.");
        }

        // 사칙연산 결과를 List 객체에 담아준다
        results.add(result);

        // 연산 결과가 담긴 results를 리턴해준다
        return results;
    }

    // 생성한 메소드가 잘 동작하는지 확인하기 위한 메인 메소드(메인 클래스와 연동 시 테스트 필요없음으로 삭제 예정)
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.calculator(10, 1, '+');
    }
}
