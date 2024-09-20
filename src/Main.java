public class Main {
    // ANSI escape codes for colors
    public static final String RESET = "\033[0m";  // Reset to default color
    public static final String RED = "\033[0;31m";
    public static final String GREEN = "\033[0;32m";
    public static final String BLUE = "\033[0;34m";
    public static final String CYAN = "\033[0;36m";
    public static final String YELLOW = "\033[0;33m";
    public static final String BOLD = "\033[1m";

    public static void main(String[] args) {

        System.out.println("Hello world!");
        // Print some colored text to the console
        System.out.println(RED + "Velkommen til chat-applikationen!" + RESET);
        System.out.println(GREEN + "Dette er en simpel CLI med farver." + RESET);
        System.out.println(BLUE + BOLD + "Indtast en besked: " + RESET);

        // Simulere at brugeren skriver en besked
        String besked = "Hej med dig!";
        System.out.println(CYAN + "Din besked: " + besked + RESET);



    }
}