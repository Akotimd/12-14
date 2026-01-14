public class Pain {
    public static void main(String[] args) {
        String phoneNumber = "+ 960 415 75 37";
        phoneNumber = phoneNumber.replace("-", "");
        phoneNumber = phoneNumber.replace(" ", "");
        phoneNumber = phoneNumber.replace("+", "");
        if (phoneNumber.length() == 10) {
//            phoneNumber = '7' + phoneNumber;
        } else if  (phoneNumber.length() > 11) {
            throw new RuntimeException("Телефон слишком длинный");
        } else if (phoneNumber.length() < 10) {
            throw new RuntimeException("Телефон слишком короткий");
        } else if (phoneNumber.length() == 11 && phoneNumber.charAt(0) != '7') {
            throw new RuntimeException("AMONGUSSSS!!!");
        }
        System.out.println("phoneNumber = " + phoneNumber);
        String expectedPhone = "79604157537";
        if (phoneNumber.equals(expectedPhone)) {
            System.out.println("Успех");
        } else {
            System.out.println("Нудачна");
        }
    }
}
