package homework;

import java.io.*;
import java.util.Scanner;

public class bai5 {
    public static void sumOfInputFile(String inputFileName, String outputFileName){
        File inputFile = new File(inputFileName);
        File outputFile = new File(outputFileName);
        int sum = 0;

        try (Scanner scanner = new Scanner(inputFile)) {
            try (PrintWriter writer = new PrintWriter(outputFile)) {
                while (scanner.hasNext()) {
                    if (scanner.hasNextInt()) {
                        sum += scanner.nextInt();
                    } else {
                        scanner.next(); // Bỏ qua nếu không phải số nguyên
                    }
                }
                writer.println("Tổng các số nguyên: " + sum);
                System.out.println("Kết quả đã được ghi vào file " + outputFileName);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Không tìm thấy file " + inputFileName);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //nhap path file input
        String inputFileName = sc.nextLine();
        //nhap path file output
        String outputFileName = sc.nextLine();
        sumOfInputFile(inputFileName, outputFileName);
    }
}
