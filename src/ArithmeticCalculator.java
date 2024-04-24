import java.util.List;

public class ArithmeticCalculator extends Calculator{

    // 연산을 담당할 클래스들을 포함관계로 하기 위해 필드로 선언
    AddOperator addOperator;
    SubtractOperator subtractOperator;
    MultiplyOperator multiplyOperator;
    DivideOperator divideOperator;

    // NPL을 방지하기 위해 생성자를 통하여 초기화 진행
    public ArithmeticCalculator() {
        addOperator = new AddOperator();
        subtractOperator = new SubtractOperator();
        multiplyOperator = new MultiplyOperator();
        divideOperator = new DivideOperator();
    }

    // 메인 메소드에서 접근할 수 있도록 접근 제어자는 public으로 설정해주고 return 타입은 계산 결과를
    // List 객체에 담아 리턴해줄 것이기 때문에 List로 설정해준다. 매개변수로는 두 개의 양의 정수,
    // 사칙연산 기호를 각각 받아오도록 설정하여 계산을 담당할 메소드를 만들어준다
    public void calculate(double firstNumber, double secondNumber, char symbol) {

        // 받아온 매개변수로 switch문 실행
        switch (symbol) {
            // + 일 때의 연산 실행
            case '+':
                // operate 메서드에서 리턴된 결과값을 setResults를 통하여 저장
                setResults(addOperator.operate(firstNumber, secondNumber));
                break;
            // - 일 때의 연산 실행
            case '-':
                setResults(subtractOperator.operate(firstNumber, secondNumber));
                break;
            // * 일 때의 연산 실행
            case '*':
                setResults(multiplyOperator.operate(firstNumber, secondNumber));
                break;
            // / 일 때의 연산 실행
            case '/':
                // 만약 입력받은 두 번째 정수가 0이 아니라면 try 문 안에 연산 실행
                try {
                    setResults(divideOperator.operate(firstNumber, secondNumber));
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
    }
}
