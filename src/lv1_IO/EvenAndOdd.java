package lv1_IO;

public class EvenAndOdd {
    public static void main(String[] args) {
        System.out.println(solution(3));
    }
    public static String solution(int num) {
        String answer = "";
        if(num%2 == 0) {
            answer = "Even";
        } else {
            answer = "Odd";
        }
        return answer;
    }
}
