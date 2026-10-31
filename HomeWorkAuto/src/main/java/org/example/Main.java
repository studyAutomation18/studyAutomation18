package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        baiSo1();
        // baiSo2();
        // baiSo3();
        // baiSo4();
        // baiso5();
        //baiSo6();
       // baiSo7();
       // baiSo8();
       // baiSo9();
       // baiSo10();
        baiSo11();
    }


    static void baiSo1() {
        // Bài 1: XÓA NGUYÊN ÂM TRONG CHUỖI
        String str = " Hello my name is Linh, I'm a software engineer. ";
        String result = removeVewels(str);
        System.out.println(result);

    }

    static String removeVewels(String originalString) {
        String result = "";
        // Bắt đầu vòng lặp dùng for ; int là sẽ lấy vị trí đầu tiên bawts đầu lấy
        // i=0 là ký tự đầu tiên của chuô

        for (int i = 0; i < originalString.length(); i++) {
            //char : Kiểu dữ liệu ký tự, character: tên biến mình đặt, originalString ; chuỗi mình define phía trên
            // chartAt: hàm có sẵn trong java để laays ký tự tại ví trí (i) trong chuỗi

            char character = originalString.charAt(i);
            //Dấu ! phủ định
            if (character != 'a' && character != 'e' && character != 'i' && character != 'o' & character != 'u' && character !=
                    'A' && character != 'E' && character != 'I' && character != 'O' && character != 'U') {
                result += character;
                // Phải có result :     result += character; để nối các ký tự lại với nhau thành chuỗi mới , nếu ko có công jressult thì chỉ lấy ký tự cuối cùng trong chu thôi

            }
        }

        return result;
    }


    static void baiSo2() {
        // Bài 2: Tìm giá trị lớn thứ hai trong mảng
        // int [] : mảng kiểu interger kiểu số. ( input)

        int[] inputNumbers = {2, 3, 4, 5, 6, 9, 10};


        int secondMaxValue = secondMax(inputNumbers);
        System.out.println(" Giá trị lớn thu hai trong mang la: " + secondMaxValue);
    }


    static int secondMax(int[] numbers) {
        // secondMax ; là tên ham, tu define
        // numbers ; tên biến , tự define

        if (numbers.length < 2) {
            return Integer.MIN_VALUE;
        } else {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < numbers.length; i++) {
                if (i == 0) {
                    max = numbers[i];
                } else {
                    if (numbers[i] > max) {
                        max = numbers[i];
                    }
                }
            }
            int secondMax = numbers[0];
            for (int i2 = 1; i2 < numbers.length; i2++) {
                if (numbers[i2] < max && numbers[i2] > secondMax) {
                    secondMax = numbers[i2];
                }
            }
            return secondMax;


        }
    }

    static void baiSo3() {
        // Bài 3: tính tổng các số chẵn từ 0 đến số nguyên dương n
        int n = 10;
        // List là collection có dữ liệu là kiểu int
        // listSoChan là tên biến để lưu dữ liệu dãy số chẵn/ createArray là hàm đã define trước đó
        // tính hàm số chẵn : int là kiểu dữ liệu trả về là số nguyên , sumSoChan2 : tên biến để lưu dữ liệu , sumSoChan là hàm đã được define trước đó
        // listSoChan là list int
        int sumSoChan = sumSoChan(n);
        System.out.println("Tổng số chẵn là: " + sumSoChan);


    }

    // list là 1 group dữ liệu  có array , list , set, .../ list có thể thay đổi số lượng các phần từ mà nó chứa
    // int: kiểu dữ liệu cái list đó chứa , createArrray là tên ha mình tự đặt , int n : l tham ssoos đầu vào can input gì
    static int sumSoChan(int n) {
        //

        // List<Integer> result = new ArrayList();

        int sumSoChan = 0; // define kêt quả cuối cùng
        // 

        for (int i = 0; i <= n; i++) {

            if (i % 2 == 0) {
                System.out.println("So chan la: " + i);
                sumSoChan = sumSoChan + i;
                //     result.add(i);
            }

            // thêm số i vào list thì dùng result.add(i)

        }
        return sumSoChan;

    }
//    static int sumSoChan(List<Integer> input1) {
//         int sum = 0;
//         for (int i = 0; i<input1.size(); i++){
//             sum = sum + input1.get(i) ;
//         }
//         return sum;
//     }


    //Bài 4: đếm số từ trong một chuỗi.

    // trước khi làm thì phải tạo hàm
    static void baiSo4() {
        String chuoiInputDauVao = "I'm fine";

        int soChu = countWords(chuoiInputDauVao);
        System.out.println("So chu la: " + soChu);
    }

    ;
    // cấu trúc kiểu dữ liệu: int tenHam(String input )
    // int kiểu dữ liệu trả về / String kiểu dữ liệu input / input là tên biến => string và inout là optional

    static int countWords(String chuoiInput) {
        char[] chuoiKyTu = chuoiInput.toCharArray();
        //char[] : đưa chuỗi input về mảng ký tự ví dụ: [I,',m, ,f,i,n,e] 
        // đến tên biến tự đặc là chuoiKyTu
        // chuoiInpu là tên biến đầu vào của hàm đó.
        int countChu = 0;
        for (int i = 0; i < chuoiKyTu.length; i++) {
            if (chuoiKyTu[i] == ' ' || i == chuoiKyTu.length - 1) {
                countChu = countChu + 1;
            }
        }
        return countChu;
    }

    //Bài số 5: chữ cái đầu tiên của mỗi từ trong một chuỗi
    static void baiso5() {
        String chuoiInput = "   Hello  World    , , I love you";
        String getChu = getFirstCharacter(chuoiInput);
        System.out.println("Chu cai dau tien la: " + getChu);
    }

    static String getFirstCharacter(String chuoiInput) {
        char[] chuoiKyTu = chuoiInput.toCharArray();
        String getChu = "";

        for (int i = 0; i < chuoiKyTu.length; i++) {
            if ((i == 0 || chuoiKyTu[i - 1] == ' ') && (chuoiKyTu[i] != ' ' && chuoiKyTu[i] != ',')) {
//                if (chuoiKyTu[i] != ' ' && chuoiKyTu[i] != ',') {
                getChu = getChu + chuoiKyTu[i];
            }
        }

        return getChu;

    }

    // Bai so 6: Tinh thue thu nhap ca nhan
    static void baiSo6() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap thu nhap hang nam: ");
        double thuNhap = sc.nextDouble();

        double thue = tinhThue(thuNhap);

        System.out.println("So thue phai tra la: " + thue);
    }

    static double tinhThue(double thuNhap) {

        double thue = 0;

        if (thuNhap < 0) {
            System.out.println("Thu nhap khong hop le");
            return 0;
        } else if (thuNhap <= 5000000) {
            thue = thuNhap * 0.05;
        } else if (thuNhap <= 10000000) {
            thue = 250000 + (thuNhap - 5000000) * 0.10;
        } else if (thuNhap <= 18000000) {
            thue = 750000 + (thuNhap - 10000000) * 0.15;
        } else if (thuNhap <= 32000000) {
            thue = 1950000 + (thuNhap - 18000000) * 0.20;
        } else if (thuNhap <= 52000000) {
            thue = 4750000 + (thuNhap - 32000000) * 0.25;
        } else if (thuNhap <= 80000000) {
            thue = 9750000 + (thuNhap - 52000000) * 0.30;
        } else {
            thue = 18150000 + (thuNhap - 80000000) * 0.35;
        }

        return thue;
    }

    // Bài số 7: Kiểm tra chuỗi đối xứng (palindrome)

    static void baiSo7(){
        String chuoiInput = "madam";
        boolean ketQua = isPalindrome(chuoiInput);
        System.out.println("Chuoi doi xung: " + ketQua);
    }
    static boolean isPalindrome(String chuoiInput) {
        for (int i = 0; i < chuoiInput.length() / 2; i++) {
            if (chuoiInput.charAt(i) != chuoiInput.charAt(chuoiInput.length() - 1 - i)) {
                return false;
            }
        }
        return true;

    }
        // Bai số 8: Viết một hàm xóa các ký tự lặp lại trong chuỗi, chỉ giữ lại ký tự xuất hiện đầu tiên của mỗi
        //loại.
        // Bài số 8: Xóa ký tự trùng lặp
        static void baiSo8() {
            String chuoiInput = "Runningm";

            String ketQua = removeDuplicate(chuoiInput);

            System.out.println("Ket qua: " + ketQua);
        }

        static String removeDuplicate(String chuoiInput) {
            String ketQua = "";

            for (int i = 0; i < chuoiInput.length(); i++) {
                char kyTu = chuoiInput.charAt(i);

                if (ketQua.indexOf(kyTu) == -1) {
                    ketQua = ketQua + kyTu;
                }
            }

            return ketQua;
        }

        // Bai số 9 : hãy tìm hai số trong
    //mảng có tổng bằng target và trả về chỉ số (index) của chúng (bắt đầu từ 1)
    static void baiSo9() {
        int[] mang = {2, 7, 11, 15};
        int target = 9;

        for (int i = 0; i < mang.length; i++) {
            for (int j = i + 1; j < mang.length; j++) {
                if (mang[i] + mang[j] == target) {
                    System.out.println("Chi so: " + (i + 1) + ", " + (j + 1));
                    return;
                }
            }
        }

        System.out.println("Khong tim thay cap so thoa man.");
    }

    // Bai số 10: Tìm chuỗi con đối xứng dài nhất trong một chuỗi cho trước.
    static void baiSo10() {
        String chuoiInput = "babad";

        String ketQua = longestPalindrome(chuoiInput);

        System.out.println("Chuoi doi xung dai nhat la: " + ketQua);
    }

    // Hàm tìm chuỗi đối xứng dài nhất
    static String longestPalindrome(String chuoiInput) {
        String ketQua = "";

        for (int i = 0; i < chuoiInput.length(); i++) {
            for (int j = i + 1; j <= chuoiInput.length(); j++) {

                String chuoiCon = chuoiInput.substring(i, j);

                if (isPalindrome(chuoiCon) && chuoiCon.length() > ketQua.length()) {
                    ketQua = chuoiCon;
                }
            }
        }

        return ketQua;
    }

    // Bài số 11: Tìm chuỗi con nhỏ nhất
    static void baiSo11() {
        String s = "ADOBECODEBANC";
        String t = "ABC";

        String ketQua = minWindow(s, t);

        System.out.println("Ket qua: " + ketQua);
    }

    // Hàm tìm chuỗi con nhỏ nhất
    static String minWindow(String s, String t) {
        String ketQua = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {

                String chuoiCon = s.substring(i, j);

                if (containsAll(chuoiCon, t)) {
                    if (ketQua.equals("") || chuoiCon.length() < ketQua.length()) {
                        ketQua = chuoiCon;
                    }
                }
            }
        }

        return ketQua;
    }

    // Hàm kiểm tra chuỗi con có đủ ký tự của t không
    static boolean containsAll(String chuoiCon, String t) {

        String tam = chuoiCon;

        for (int i = 0; i < t.length(); i++) {
            char kyTu = t.charAt(i);

            int viTri = tam.indexOf(kyTu);

            if (viTri == -1) {
                return false;
            }

            tam = tam.substring(0, viTri)
                    + tam.substring(viTri + 1);
        }

        return true;
    }

}
    











