import java.util.*;
class program45{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		while(num>0){
			int digit=num%10;
			if(digit%2==1){
				System.out.println(digit);
			}else{
				System.out.println(digit);
			}
			num=num/10;
		}
		
	}
}


