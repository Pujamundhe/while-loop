import java.io.*;
class program44{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the number");
		int num=Integer.parseInt(br.readLine());
		while(num>0){
			
		        int digit =num%10;
			if(digit%2==1){
				
				System.out.println(digit);
			
				
			}
			
			num=num/10;
			
		}
		
	}
}



