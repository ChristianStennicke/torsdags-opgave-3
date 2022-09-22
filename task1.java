
class Palindrome{

public static void main(String[] args)
{
	printlfPalindrome("Den laks skal ned");
}
	static void printlfPalindrome(String imput)
	{
		String str = imput;
		String reverseStr ="";

	int strLength = str.length();

	for(int i = (strLength - 1); i>=0; --i){
	reverseStr = reverseStr + str.charAt(i);
	}
	if (str.toLowerCase().equals(reverseStr.toLowerCase()) 
	{
		System.out.println(str);

	}
	else{
		System.out.println("Imput is not Palindrome")
	}
}
	}
