import java.util.Scanner;

public class ArithmeticApp {

    // 사칙연산을 해줄 메서드 return 할 값이 없기 때문에 void이고
    // 인스턴스 변수를 사용하지 않기 때문에 메인 메서드에서 인스턴스화를 하지 않고
    // 바로 사용하기 위하여 static으로 선언을 해준다
    public static void start() throws Exception {

        // ArithmeticParser를 사용해야해서 인스턴스화를 해준다
        ArithmeticParser arithmeticParser = new ArithmeticParser();
        // Scanner를 사용해야해서 인스턴스화를 해준다
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 숫자를 입력해주세요 : ");
        // int 값으로 입력을 받아 변수에 담아준다
        int firstInput = scanner.nextInt();

        System.out.print("연산자를 입력해주세요 : ");
        // String 값으로 입력을 받아 변수에 담아준다
        String operator = scanner.next();

        System.out.print("두번째 숫자를 입력해주세요 : ");
        // int 값으로 입력을 받아 변수에 담아준다
        int secondInput = scanner.nextInt();

        // 각각 받아온 값들을 arithmeticParser의 알맞는 메서드에 매개변수로 전달하여 실행시켜준다
        // arithmeticParser.parse* 메서드들은 return this가 되어있어 자기자신을 다시 호출하여
        // arithmeticParser와 같이 되기 때문에 .을 사용하여 다른 메서드를 연속으로 사용할 수 있게 된다(Method Chaining)
        arithmeticParser.parseFirstNum(firstInput)
                .parseOperator(operator)
                .parseSecondNum(secondInput);

        // arithmeticParser.excutecalculate()의 값(double)을 받아와서 출력해준다
        System.out.println("결과 : " + arithmeticParser.excutecalculate());

        System.out.print("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제) : ");
        // String 값으로 입력을 받아 변수에 담아준다
        String remove = scanner.next();

        // remove에 들어온 값이 'remove'와 같다면
        if(remove.equals("remove")) {
            // arithmeticParser의 저장된 첫번째 인덱스 값을 지워주는 메서드인 removeResult()를 실행해준다
            arithmeticParser.removeResult();
        }

        System.out.print("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회) : ");
        // String 값으로 입력을 받아 변수에 담아준다
        String inquiry = scanner.next();

        // inquiry에 들어온 값이 'inquiry'와 같다면
        if(inquiry.equals("inquiry")) {
            // arithmeticParser의 결과를 출력하는 메서드인 inquiryResults()를 실행해준다
            System.out.println(arithmeticParser.inquiryResults());
        }
    }
}
