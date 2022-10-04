public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Please input a word: ");
    String line = keyboard.nextLine();

    String cleanLine = line.replaceAll("[\\W]", "");
    String reverse = new StringBuilder(cleanLine).reverse().toString();
    boolean isPalindrome = cleanLine.equals(reverse);

    System.out.print("It is " + isPalindrome + " that this word is a palindrome.");
}
