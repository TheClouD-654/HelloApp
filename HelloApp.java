import java.util.Scanner;
public class HelloApp {
    public static void main(String[] args) {
        
        StringBuilder nameBuilder = new StringBuilder();
        for (String input:args) {
            nameBuilder.append(input).append(", ");
        }
        String name;
        if (nameBuilder.length()>0) {
            System.out.println("Enter your name:");
            S
            name = nameBuilder.substring(0, nameBuilder.length() - 2);
        }
        System.out.println("Hello, " + name + "!");
    }
}
