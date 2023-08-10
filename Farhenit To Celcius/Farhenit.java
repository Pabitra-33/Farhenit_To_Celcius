import java.util.*;

public class Farhenit{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float temperature,celcius;
        System.out.println("Enter temperature in farhenit:");
        temperature = in.nextFloat();
        celcius = ((temperature - 32) * 5) / 9;
        System.out.println("Temerature in celcius:" +celcius);
    }
}