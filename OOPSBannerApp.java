/*
 * OOPSBannerApp UC5 – Render OOPS as Banner using Inline Array Initialization
 */

public class OOPSBannerApp {
    public static void main(String[] args) {
        // Letter O pattern
        String[] O = {
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        };

        // Letter P pattern
        String[] P = {
            "*****",
            "*   *",
            "*   *",
            "*****",
            "*    ",
            "*    ",
            "*    "
        };

        // Letter S pattern
        String[] S = {
            " ****",
            "*    ",
            "*    ",
            " ****",
            "    *",
            "    *",
            "**** "
        };

        // Inline array initialization – each line built with String.join()
        String[] bannerLines = {
            String.join(" ", O[0], O[0], P[0], S[0]),
            String.join(" ", O[1], O[1], P[1], S[1]),
            String.join(" ", O[2], O[2], P[2], S[2]),
            String.join(" ", O[3], O[3], P[3], S[3]),
            String.join(" ", O[4], O[4], P[4], S[4]),
            String.join(" ", O[5], O[5], P[5], S[5]),
            String.join(" ", O[6], O[6], P[6], S[6])
        };

        // Print using enhanced for loop
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}