package Chapter_06;

public class _03_Return {

    public static String getPhoneNumber(){
        String phoneNumber="02-1234-5678";
        return phoneNumber;
    }

    public static String getAddress(){
        return "서울시 어딘가";
    }

    public static String getActivities(){
        return "볼링장, 탁구장, 노래방";
    }

    public static void main(String[] args) {
        String contactNumber = getPhoneNumber();
        System.out.println("호텔 전화번호 : " + contactNumber);
        String address = getAddress();
        System.out.println("호텔 주소는 : " + address);
        System.out.println("호텔 액티비티 : " + getActivities());
    }
}
