package Chapter_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";

        System.out.println(s.replace(" and", ","));
        System.out.println(s.substring(7)); // 인덱스 기준 7 부터 시작
        System.out.println(s.substring(s.indexOf("Java")));
        System.out.println(s.substring(s.indexOf("Java"),s.indexOf(".")));

        System.out.println("----------------------------------");

        s= "               I love Java.            ";
        System.out.println(s);
        System.out.println(s.trim());

        System.out.println("----------------------------------");

        String s1="Java";
        String s2="Python";
        System.out.println(s1+s2);
        System.out.println(s1+","+s2);
        System.out.println(s1.concat(",").concat(s2));
    }
}
