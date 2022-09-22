class task2
{
	public static void main(String[] args)
	{
		printPartOfWord("København",1,4);
	}
	static void printPartOfWord(String str, int s, int e)
	{
		System.out.println(str.substring(s,e+s));
	} 
}
