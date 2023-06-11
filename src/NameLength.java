public class NameLength {
    public static void main(String[] args) {
        String myName = "Stefano";
        int nameLength = myName.length();

        if (nameLength % 2 == 0) {
            System.out.println("The number of letters in my name is even.");
        } else {
            System.out.println("The number of letters in my name is odd.");
        }
    }
}