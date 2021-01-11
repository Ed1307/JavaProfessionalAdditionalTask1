package task3;

public class Task3 {
    public static void main(String[] args) {

        String name = "Roman";
        name = name.toLowerCase();
        char[] arrName = name.toCharArray();

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char[] arrAlphabet = alphabet.toCharArray();

        int sum = 0;
        for (int i = 0; i < arrName.length; i++) {
            for (int j = 0; j < arrAlphabet.length; j++) {
                if(arrName[i] == arrAlphabet[j]){
                    sum+= j+1;
                }
            }
        }

        System.out.println(sum);
    }
}
