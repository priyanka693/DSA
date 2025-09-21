public class ReverseWord {
    public static void main(String[] args) {
        String str = "My name is mukesh";
        String rev = " ";
        String[] word = str.split(" ");

        for(int i=word.length -1 ; i>=0; i--) {
            rev = rev + word[i] + " ";
        }

        System.out.println(rev);
    }
}
