package Feb1TaskProgram;

import java.util.Scanner;

public class GetWebsiteUrl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Take website URL input from the user
        System.out.print("Enter the website URL: ");
        String website = scanner.nextLine();
        website.toLowerCase();
        if(website.endsWith(".com"))
        {
            System.out.println("Commercial website");
        } else if (website.endsWith(".org"))
        {
            System.out.println("organizational website");
        }
        else if (website.endsWith(".edu"))
        {
            System.out.println("educational website");
        }

    }
}
