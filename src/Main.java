import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 사용자에게 입력을 받기 위하여 Scanner 생성자를 통하여 Scanner 객체 생성
        Scanner sc = new Scanner(System.in);
        // 입력 받을 두 정수를 담을 int 타입의 변수 생성 및 초기화
        int firstNumber, secondNumber = 0;
        // 입력받을 사칙연산 기호를 담을 변수 생성 및 초기화
        char symbol = ' ';


        // 첫번째 숫자를 입력받기 위한 문장 출력
        System.out.print("첫 번째 숫자를 입력하세요: ");
        // 입력받은 문자를 int타입으로 받아 미리 생성해 둔 변수에 담아준다
        firstNumber = sc.nextInt();
        // 두번째 숫자를 입력받기 위한 문장 출력
        System.out.print("두 번째 숫자를 입력하세요: ");
        // 입력받은 문자를 int타입으로 받아 미리 생성해 둔 변수에 담아준다
        secondNumber = sc.nextInt();

        // 숫자를 정상적으로 입력받는지 테스트하기 위한 출력 메소드
        System.out.println("첫번째 숫자: " + firstNumber + " 두번째 숫자: " + secondNumber);

        // 사칙연산 기호를 입력받기 위한 문장 출력
        System.out.print("사칙연산 기호를 입력하세요: ");
        // 입력받은 문자열(String)을 선언해놓은 변수인 char 타입으로 형변화 후 변수에 담아준다
        symbol = sc.next().charAt(0);

        // 기호를 정상적으로 입력받는지 테스트하기 위한 출력 메소드
        System.out.println("입력받은 문자 : " + symbol);
    }
}