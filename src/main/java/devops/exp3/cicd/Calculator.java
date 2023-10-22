package devops.exp3.cicd;

public class Calculator 
{
        public int Mul(int a,int b)
        {
        	return a*b;
        }
        public int divide(int a,int b)
        {
        	return a/b;
        }
	public static void main(String[] args)
	{
		Calculator Mycal = new Calculator();
		System.out.println(Mycal.Mul(20,10));
		System.out.println(Mycal.divide(40,5));
	}

}
