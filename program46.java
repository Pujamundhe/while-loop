import java.io.*;
class program46{
	public static void main(String[] args)throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the number");
		int num =Integer.parseInt(br.readLine());
		int count=0;
		while(num>0){
			 int digit= num%10;
			 count = count + digit;
			 num =num/10;
		}
		System.out.println(count);
		
	}
}


	
