public class OOPSBannerapp {

    public static void main(String[] args) {
        printBanner();
    }

    // Function to return banner lines
    public static String[] getBanner() {
        return new String[] {
                "    ***     ***    ******     *****   ",
                "   ** **   ** **   **   **   **   **  ",
                "  **   ** **   **  **   **   **        ",
                "  **   ** **   **  ******      *****   ",
                "  **   ** **   **  **              **  ",
                "   ** **   ** **   **        **    **  ",
                "    ***     ***     **         *****   "
        };
    }

    // Function to print banner
    public static void printBanner() {
        String[] banner = getBanner();

        for (String line : banner) {
            System.out.println(line);
        }
    }
}