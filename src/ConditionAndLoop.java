import java.util.Scanner;

public class ConditionAndLoop {
    public static void main(String[] args) {
//        Bài 1: Nhập số nguyên từ bàn phím, kiểm tra số đó là số chẫn hay là số lẻ
//        Input: Số nguyên nhập từ bàn phím => Scanner
//        Output: Số đó là ... (chẵn hoặc lẻ)
//        Process:
//        => Sử dụng if-else để xử lý
//        số chẵn là số chia hết cho 2 => number % 2 == 0
//        số lẻ => (number % 2 == 1) hoặc (number % 2 != 0)
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter a number: ");
//        int number = scanner.nextInt();
//        if (number % 2 == 0) {
//            System.out.println("Number " + number + " is even");
//        } else {
//            System.out.println("Number " + number + " is odd");
//        }

//        Bài 2: Nhập số nguyên từ bàn phím. Kiểm tra số đó là số nguyên dương, nguyên âm hay là số 0.
//        Input: Số nguyên nhập từ bàn phím => Scanner
//        Output: Số đó là ... (số âm, số dương, hoặc là số 0)
//        Process:
//        => Sử dụng if-else if-else để xử lý (hoặc sử dụng 3 if)
//        số nguyên dương => number > 0
//        số nguyên âm => number < 0
//        số không => number == 0
//        if (number > 0) {
//            System.out.println("Number " + number + " is positive");
//        } else if (number == 0) {
//            System.out.println("Number " + number + " is zero");
//        } else {
//            System.out.println("Number " + number + " is negative");
//        }

//        Lưu ý: nếu có quá nhiều if-else => sử dụng switch-case

//        Bài 3: tìm số lớn nhất trong 3 số
//        Input: 3 số nguyên  từ bàn phím.
//        Output: Số lớn nhất
//        Process:

//        System.out.println("Please enter 3 numbers");
//        System.out.print("Number 1: ");
//        int number1 = scanner.nextInt();
//        System.out.print("Number 2: ");
//        int number2 = scanner.nextInt();
//        System.out.print("Number 3: ");
//        int number3 = scanner.nextInt();
//        Cách 1:
//        int max = number1;
//        if (number2 > max) {
//            max = number2;
//        }
//        if (number3 > max) {
//            max = number3;
//        }
//        System.out.println("Max number is " + max);

//        Cách 2:
//        int max2 = Math.max(number1, Math.max(number2, number3));
//        System.out.println("Max number is " + max2);

//        Bài 4: Tính tiền taxi
//        Input: số km
//        Output: tiền taxi (tiền là số chẵn)
//        Process:
//        1km đầu tiên: 15000 VND
//        Từ km thứ 2 trở đi: 12000 VND
//        Tính tiền cước taxi với số km nhập từ bàn phím
//        VD: 3km => 15000 + 2*12000
//        VD2: 1.2km => 15000 + 1*12000 (0.2km thứ 2 => 1km thứ 2)
//        DEFAULT: nhập số km > 0

//        System.out.println("Please enter the distance in km");
//        float km = scanner.nextFloat();
//        int total;
//
//        if (km <= 1.0f && km >= 0.0f) {
//            total = 15000;
//        } else {
//            int additionalKm = (int) Math.ceil(km - 1);
//            total = 15000 + (additionalKm) * 12000;
//        }
//
//        System.out.println("Total: " + total + " VND");

//        Vòng lặp (loop)
//        Bài 1: tính tổng các số từ 1 -> 100
//        Input: Nhập số n để tính tổng tử 1 -> n
//        Output: Tổng các số từ 1 -> n
//        Process:
//        Sử dụng for để xử lý
//        for(<điều kiện bắt đầu loop>; <điều kiện đi vào loop>; <logic để dùng vòng lặp>) {
//          <code ở đây>
//        }
//        ĐK bắt đầu vòng lặp: iterator = 1
//        ĐK đi vào vòng lặp: iterator == n thì đi vào vòng lặp
//        Logic để dừng vòng lặp: iterator = iterator + 1

//        int sum = 0;
//        for (int i = 1; i <= 100; i++) {
//            sum += i;
//        }
//        System.out.println("Sum: " + sum);

//        Bài 2: tính tổng các số chẵn từ 1 -> 100
//        Input: Nhập số n để tính tổng tử 1 -> n
//        Output: Tổng các số từ 1 -> n
//        Process:
//        ĐK bắt đầu vòng lặp: i = 1
//        ĐK đi vào vòng lặp: i <= n
//        Logic dừng vòng lặp: i++

//        int sum1 = 0;
//        for (int i = 1; i <= 100; i++) {
//            if (i % 2 == 0) {
//                sum1 += i;
//            }
//        }
//        System.out.println("Sum: " + sum1);

//        Bài 3: In bảng cửu chương
//        Input: nhập n với n là bảng cửu chương thứ n
//        Output: in ra bằng cửu chương thứ n
//        Process:
//        ĐK bắt đầu vòng lặp: i = 1
//        Đk đi vào vòng lặp: i <= 10
//        Logic dừng vòng lặp: i++

//        System.out.print("The multiplication table of number: ");
//        int number = scanner.nextInt();
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(number + " * " + i + " = " + (number * i));
//        }

        System.out.println("The multiplication table:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("");
            for (int j = 1; j <= 10; j++) {
                System.out.print(i + " * " + j + " = " + (i * j) + "\t");
            }
        }
    }
}
