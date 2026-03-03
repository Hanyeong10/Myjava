package ch01_variable_operator;

public class Casting {
    static void main() {

        /*double d = 100; // 암시적 형변환 (Casting)
        System.out.println("d : " + d );

        int i = (int)3.14 ; // 명시적 형변환 (형변환연산자)3.14
        System.out.println("i : " + i);


        System.out.println(14/5); // 정수 / 정수이기 때문에 결과값 2

        // (double) 14/5 => 명시적 형변환 14.0/5 => 14.0/5.0 (암시적으로 형변환 되어 5.0으로 처리)
        //>> 2.8로 계산됨.
        System.out.println((double)14/5);
        //(double)(14/5) => 산술 연산자로 인해 (14/5)가 먼저 계산되어 2로 나옴. => (double)(2)로 처리
        // 명시적 2.0
        System.out.println((double)(14/5));*/

        int kor = 50, eng = 60, math = 80;
        int total = kor + eng + math;

        double average = (double) total / 3; // double로 인한 암시적 형변환.
        System.out.println("총점 : " + average);

        System.out.println((double) total/3);

        char ch1 = 'c';
        char ch2 = 'a';
        boolean bool1 = ch1 > ch2 ; // 각각 99 와 97으로 암시적 형변환
        System.out.println("bool 1 : " +bool1);

        int result = ch1 - ch2 +5;
        System.out.println(result);

        char ch3 = 'D';
        String str = ch3 >= 'A' && ch3 <= 'Z'  ? "대문자" : "대문자아님" ;
        System.out.println("str : " +str);
    }
}

