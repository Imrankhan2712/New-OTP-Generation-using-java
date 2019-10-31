import java.util.*;

class OTPgeneration
{
    public static void main(String ar[])
    {
        int length = 6;
        System.out.println("New OTP Generation:");
        System.out.println(otpGeneration(length));
    }

    static char[] otpGeneration(int length)
    {
        String number = "0123456789";
        char OTP[] = new char[length];

        Random random_obj = new Random();

        for(int i=0; i<length; i++)
        {
            OTP[i] = number.charAt(random_obj.nextInt(number.length()));
        }

        return OTP;
    }
}