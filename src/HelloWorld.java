import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
//        Win: CTRL + ?
//        println (print and line): in ra ngoài màn hình và xuống dòng
        System.out.println("Hello World!");

        System.out.println("Hello " + "Testing09");

//        1. Khai báo biến
//        - Số (số nguyên, số thực)
//        - Chuỗi (String)
//        Cách khai báo biến:
//        <kiểu dữ liệu> <tên biến> = <dữ liệu>;
        int number1 = 10;
        int number2 = 20;

        float number3 = 3.5f;
        double number4 = 7.0;

        String string1 = "Hello World!";
        String string2 = "Testing09";

        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println(number3);
//         Chuỗi + số => println sẽ tự động convert từ số -> chuỗi
        System.out.println(string1 + number1);

//        Nhập giá trị từ bàn phím
//        => Scanner
//        Khai báo đối tượng Scanner
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter a number: ");
//        int number6 = scanner.nextInt();
//        System.out.println("Number entered: " + number6);
//
//        System.out.println("Please enter a float number: ");
//        float number7 = scanner.nextFloat();
//        System.out.println("Number entered: " + number7);

//        System.out.println("Please enter a string: ");
//        String string3 = scanner.nextLine();
//        System.out.println("String entered: " + string3);

//        Phép tính +, -, *, /(chia lấy nguyên), %(chia lấy dư)
//        đi chung với biến (variable)
//        +
        int result = number1 + number2;
        System.out.println("Result: " + result);
//        System.out.println("Result: " + (number1 + number2));
//        System.out.println("Result: " + (number1 + number2 + 30));

//        -
        System.out.println("Result: " + (number1 - number2));

//        *
        System.out.println("Result: " + (number1 * number2));

//        / (chia lấy nguyên)
        System.out.println("Result: " + (80 / 7));

//        % (chia lấy dư)
        System.out.println("Result: " + (80 % 7));

//        result = number1 + number2;
        int number16 = 10;
//        System.out.println("Before: " + number16);
//        number16 += 2;
//        System.out.println("After: " + number16);
//        number16++;
//        System.out.println("After: " + number16);
//        ++number16;
//        System.out.println("After: " + number16);

//        number16++: gán giá trị hiện tại của number16 (11)
//        và gán vào biến number 17 (11)
//        và tăng giá trị number 16 lên 1 đơn vị
        int number17 = number16++;
        System.out.println("After number17: " + number17);
        System.out.println(number16);

//        ++number16: tăng giá trị number 16 lên 1 đơn vị (12)
//        và gán vào biến number 18 (12)
        int number18 = ++number16;
        System.out.println("After number18: " + number18);
        System.out.println(number16);

//        true - false
//        (>, >=, <, <=, ==, !=)
//        phải đi kèm với keyword if-else
//        kết quả của phép so sánh là boolean (true or false)
        int number5 = 30;
        int number6 = 40;
        boolean check1 = number5 > number6;
        boolean check2 = number5 < number6;
        boolean check3 = number5 == number6;
        boolean check4 = number5 != number6;

        System.out.println("Check1: " + check1);
        System.out.println("Check2: " + check2);
        System.out.println("Check3: " + check3);
        System.out.println("Check4: " + check4);
    }
}
