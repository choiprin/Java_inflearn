package Chapter_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        String s1="Java";
        String s2="Python";

        System.out.println(s1.equals("Java"));
        System.out.println(s2.equals("python")); // 대소문자 구분
        System.out.println(s2.equalsIgnoreCase("python")); // 대소문자 구분 x

        s1="1234";
        s2="1234";
        System.out.println(s1.equals(s2));// 내용
        System.out.println(s1 == s2);// 참조

        s1 = new String("1234");
        s2 = new String("1234");// new 로 선언하면 다른 메모리에 저장됨?
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
        // Java 에서는 문자열 비교할 땐 equals 사용 추천
    }
}
