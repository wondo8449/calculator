import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 사용자에게 입력을 받기 위하여 Scanner 생성자를 통하여 Scanner 객체 생성
        Scanner sc = new Scanner(System.in);
        // 입력 받을 두 정수를 담을 int 타입의 변수 생성 및 초기화
        int firstNumber, secondNumber = 0;
        // 입력받을 사칙연산 기호를 담을 변수 생성 및 초기화
        char symbol = ' ';
        // 결과값을 담을 변수 생성 및 초기화
        int result = 0;
        // 나누기를 실행할 시 나머지를 담을 변수 생성 및 초기화
        int rest = 0;
        // 종료 입력을 받기 위한 변수 생성 및 초기화
        String close = null;
        // 종료 함수의 boolean 값을 담기 위한 변수 생성 및 초기화
        boolean check = true;
        // 연산 결과를 담아줄 배열 생성
        int[] results = new int[10];
        results[0] = 1;
        results[1] = 2;
        results[2] = 3;
        results[3] = 4;
        results[4] = 5;
        results[5] = 6;
        results[6] = 7;
        results[7] = 8;
        results[8] = 9;

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

            // 입력된 기호 별로 case를 나눠 연산 실행
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
                    // 만약 입력받은 두 번째 정수가 0이라면 입력될 수 없다는 문구 출력
                    if (secondNumber == 0) {
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                        // 0이 아니라면 아래의 연산 실행
                    } else {
                        // 나눗셈의 몫을 담아주는 부분
                        result = firstNumber / secondNumber;
                        // 나눗셈의 나머지를 담아주는 부분
                        rest = firstNumber % secondNumber;
                        System.out.println("몫 : " + result);
                        System.out.println("나머지 : " + rest);
                    }
                    break;
                // 사칙연산 기호가 잘못 입력된 경우 출력
                default:
                    System.out.println("사칙연산 기호를 잘못 입력하였습니다.");
            }
            // 계산 결과를 배열에 담기 위한 반복문
            for( int i=0; i < results.length; i++){
                // 만약 배열의 마지막 인덱스까지 값이 있다면
                if(results[9] != 0){
                    // for문을 돌며 1번 인덱스부터 j-1을 한 자기 바로 앞번호 인덱스로 들어가게 된다
                    for(int j=1; j <= 9; j++) {
                        results[j-1] = results[j];
                    }
                    // 모든 인덱스의 값이 한칸씩 앞으로 간 후 마지막 인덱스의 새로운 결과값을 넣어준다
                    results[9] = result;
                    // 다시 반복되지 않도록 break를 걸어준다
                    break;
                }
                // 만약 i번째 배열의 값이 초기값인 0이라면
                if(results[i] == 0) {
                    // 해당 인덱스 번호에 결과값을 저장
                    results[i] = result;
                    // 저장하였다면 뒤의 인덱스에까지 저장되지 않도록 for문을 나가기
                    break;
                }
            }

            // 현재까지의 저장 결과를 보여주기 위한 출력
            // 배열은 results로 바로 출력하면 주소값이 뜨기 때문에 해당 주소의 값을 가져와주는 toString메소드 사용
            System.out.println("현재까지의 결과 : " + Arrays.toString(results));

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