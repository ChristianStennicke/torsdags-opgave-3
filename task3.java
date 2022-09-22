import java.util.Random;

class task3{
static int[] array = { 1, 1, 1, 2, 2, 3, 3, 3, 4, 5, 5, 5, 6, 6, 7, 8, 8, 9, 9, 10 };
public static void main(String[] args)
{
//divisble(7);
//System.out.println(getRandom(array));
//sub(5);
//fibonacci(1,1);

}
static void divisble(int divider)
{
	for(int i = 100; i>=0; --i)
	{
		if(i%divider == 0)
		{
			System.out.println(i);
		}

	}

}
static int getRandom(int[] array)
		{
			int rand = new Random().nextInt(array.length);
			return array[rand];
		}
static void sub(int number)
{
	System.out.println(number);
	if(number > 0)
	{
		number = number -1;
		sub(number);
	}
}
static void fibonacci(int a, int b)
{
	System.out.println(a+" \t");
	if(b<=1000)
	{
		fibonacci(b,a+b);
	}
}
}
