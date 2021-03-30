package tekWillHomeWorks.homeWork2003.march29Switch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EnableDisableLightsHouseWithSwitch {
    /*
2.Write a Java program which will enable or disable a device in your house based
on the code entered by user.
Test data
Input code: 0
Expected output:
You've enabled the lights in the bathroom
Another example -
Input key: 1
Expected output:
You've disabled the lights in the bathroom
The devices and printed statements are completely up to you. You decide what does each
code does. Limit yourself to 10 cases, so it means 5 devices with 2 options:
 enable/disabled, and each action assigned to a code, which is also up to your choosing.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a number to conect or disconect the light: ");
        byte disableEnableLights = Byte.parseByte(reader.readLine());
        switch (disableEnableLights) {
            case 0:
                System.out.println("You've enabled the lights in the bathroom");
                break;
            case 1:
                System.out.println("You've disabled the lights in the bathroom");
                break;
            case 2:
                System.out.println("You've disabled the lights in the bedroom");
                break;
            case 3:
                System.out.println("You've enabled the lights in the bedroom");
                break;
            case 4:
                System.out.println("You've enabled the lights in the living room");
                break;
            case 5:
                System.out.println("You've disabled the lights in the living room");
                break;
            case 6:
                System.out.println("You've enabled the lights in the garage");
                break;
            case 7:
                System.out.println("You've disabled the lights in the garage");
                break;
            case 8:
                System.out.println("You've disabled the lights in the office");
                break;
            case 9:
                System.out.println("You've enabled the lights in the office");
                break;
            default:
                System.out.println("Worning! The number " + disableEnableLights + " isn't a comand to disabled or enabled a light or is probably for enother device or house.");
        }
    }
}
