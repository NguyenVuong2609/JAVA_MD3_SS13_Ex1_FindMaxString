package Rikkei.academy;

import java.util.LinkedList;
import java.util.Scanner;

public class FindMaxString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = "Welcome";
        LinkedList<Character> maxList = new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> charList = new LinkedList<>();
            charList.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (charList.getLast() < string.charAt(j)){
                    charList.add(string.charAt(j));
                }
            }
            if (charList.size() > maxList.size()) {
                //Nếu kích cỡ của list trung gian lớn hơn kích cỡ của list có độ dài lớn nhất thì gán lại max
                maxList.clear();
                maxList.addAll(charList);
            }
            charList.clear();
        }
        for (Character ch: maxList) {
            System.out.print(ch);
        }
        System.out.println();
    }
}
