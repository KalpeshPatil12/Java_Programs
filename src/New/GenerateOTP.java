package New;

import java.util.Random;

public class GenerateOTP {

	static char[] OTP(int len) {
		
		System.out.println("Generate OTP using random(): ");
		
		System.out.print("Your OTP is: ");
		
		String numbers = "0123456789";
		
		Random ran = new Random();
		
		char[] otp = new char[len];
		
		for(int i =0; i<len; i++) 
		{
			otp[i] = numbers.charAt(ran.nextInt(numbers.length()));
		}
		
		return otp;
		
	}
	
	public static void main(String[] args) 
	{
		int length = 4;
		
		System.out.println(OTP(length));
	}
	
}
