public class Main {
    public static void main(String[] args) {
        // teste
        System.out.println(lengthOfLastWord("teste teste"));

    }
    static int lengthOfLastWord(String s){
        int length = 0;
        boolean found = false;
        char [] sChar = s.toCharArray();

        for (int i = sChar.length - 1; i >= 0 && !found; i--){
            if(sChar[i] != ' '){
                length++;
                if(i != 0){
                    if(sChar[i - 1] == ' '){
                        found = true;
                    }
                }
            }
        }
        return length;
    }
}