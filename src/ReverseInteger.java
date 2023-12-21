import java.util.Arrays;
import java.util.Stack;

public class ReverseInteger {
    public static void reverseArray(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i : arr) {
            stack.push(i);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
    }
    public static String reverseString(String input){
        Stack<String> mStack = new Stack<>();
        String[] words = input.split("");
        for (String word : words){
            mStack.push(word);
        }
        StringBuilder reversedstring = new StringBuilder();
        while (!mStack.isEmpty()){
            reversedstring.append(mStack.pop()).append(" ");
        }
        return reversedstring.toString().trim();
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,5,6,7,8};

        System.out.println(Arrays.toString(array));

        reverseArray(array);
        System.out.println(Arrays.toString(array));

        String inputString = "Hello World";
        System.out.println("chuỗi ban đầu: " +inputString);

        String reversedString = reverseString(inputString);
        System.out.println("chuỗi sau đảo ngược:" +reversedString);
    }

}
