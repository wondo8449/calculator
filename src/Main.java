import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 사용자에게 입력을 받기 위하여 Scanner 생성자를 통하여 Scanner 객체 생성
        Scanner sc = new Scanner(System.in);
        // 입력 받을 두 정수를 담을 int 타입의 변수 생성 및 초기화
        int firstNumber, secondNumber = 0;
        // 입력받을 사칙연산 기호를 담을 변수 생성 및 초기화
        char symbol = ' ';
        // 종료, 삭제, 조회 입력을 받기 위한 변수 생성 및 초기화
        String close = null, remove = null, inquiry = null;
        // 종료 함수의 boolean 값을 담기 위한 변수 생성 및 초기화
        boolean check = true;
        // Calculator를 사용하기 위해 객체 생성
        Calculator cal = new Calculator();

        // 무한 계산을 하기 위한 while문 실행
        while(check) {
            // 첫번째 숫자를 입력받기 위한 문장 출력
            System.out.print("첫 번째 숫자를 입력하세요: ");
            // 입력받은 문자를 int타입으로 받아 미리 생성해 둔 변수에 담아준다
            firstNumber = sc.nextInt();

            // 입력받은 정수가 0보다 작거나 같다면 while문으로 들어가게 된다
            while (firstNumber <= 0) {
                // 양의 정수가 아니니 다시 입력하라는 문구 출력
                System.out.println("양의 정수가 아닙니다. 다시 입력해주세요.");
                System.out.print("첫 번째 숫자를 입력하세요: ");
                // 새로 입력받은 정수를 변수에 담아준다
                firstNumber = sc.nextInt();
                //만약 새로 입력한 정수도 양의 정수가 아니라면 다시 반복문을 돌게 된다
            }

            // 두번째 숫자를 입력받기 위한 문장 출력
            System.out.print("두 번째 숫자를 입력하세요: ");
            // 입력받은 문자를 int타입으로 받아 미리 생성해 둔 변수에 담아준다
            secondNumber = sc.nextInt();

            // 입력받은 정수가 0보다 작거나 같다면 while문으로 들어가게 된다
            while (secondNumber <= 0) {
                // 양의 정수가 아니니 다시 입력하라는 문구 출력
                System.out.println("양의 정수가 아닙니다. 다시 입력해주세요.");
                System.out.print("두 번째 숫자를 입력하세요: ");
                // 새로 입력받은 정수를 변수에 담아준다
                secondNumber = sc.nextInt();
                //만약 새로 입력한 정수도 양의 정수가 아니라면 다시 반복문을 돌게 된다
            }

            // 숫자를 정상적으로 입력받는지 테스트하기 위한 출력 메소드
            System.out.println("첫번째 숫자: " + firstNumber + " 두번째 숫자: " + secondNumber);

            // 사칙연산 기호를 입력받기 위한 문장 출력
            System.out.print("사칙연산 기호를 입력하세요: ");
            // 입력받은 문자열(String)을 선언해놓은 변수인 char 타입으로 형변화 후 변수에 담아준다
            symbol = sc.next().charAt(0);

            // 기호를 정상적으로 입력받는지 테스트하기 위한 출력 메소드
            System.out.println("입력받은 문자 : " + symbol);

            // 생성된 Calculator 객체에 calculator 메소드에 접근하여 입력받은 값들을 매개변수로 전달하여 실헹
            cal.calculate(firstNumber, secondNumber, symbol);

            // 삭제 여부를 확인하기 위한 문장 출력
            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            // 삭제 여부를 만들어둔 String 객체에 담아준다
            remove = sc.next();
            // 만약 사용자가 입력한 값이 "remove"와 같다면
            if (remove.equals("remove")) {
                // Calculator의 removeResult 메소드를 실행하여 0번 인덱스 값 삭제
                cal.removeResult();
            }

            // 저장된 연산결과를 조회할지에 대해 묻는 문장 출력
            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            // 조회 여부를 만들어둔 String 객체에 담아준다
            inquiry = sc.next();
            // 만약 사용자가 입력한 값이 "inquiry"와 같다면
            if (inquiry.equals("inquiry")) {
                // 현재까지 저장된 연산결과를 조회해준다 getter를 생성해놨기 때문에 따로 메소드를 생성하지 않고 getter를 활용해준다
                System.out.println(cal.getResults());
            }

            // 더 계산할지에 대한 여부를 묻기 위한 출력
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            // 사용자가 입력한 값을 만들어둔 String 변수에 담아준다
            close = sc.next();
            // String 클래스의 비교방법인 .equals 메소드를 사용해 exit가 입력되었는지 확인
            if (close.equals("exit")) {
                // exit가 입력되었다면 check 값을 false로 변경해 더 이상 while문을 돌지 않도록 설정
                check = false;
            }
        }
    }
}