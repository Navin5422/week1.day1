package Week1.day1;

public class FibonacciSeries {

public static void main(String[] args) {
		
int firstNum=0;
int secondNum=1;
int sum=0;
int iteration = 9;
System.out.println("Fiboncacci Series for " +iteration +" numbers:");
System.out.println(firstNum);
System.out.println(secondNum);
for (int i=1;i<=iteration;i++) 
{
sum=firstNum+secondNum;
System.out.println(sum);
firstNum = secondNum;
secondNum=sum;
}		
			
}	
}


	