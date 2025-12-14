import java.util.Scanner;
class Demo11{
			public static void main(String[]args){
				Scanner sc=new Scanner (System.in);
				System.out.println("Enter Number:");
				int num=sc.nextInt();
				System.out.println("Enter Number to Search:");
				int search=sc.nextInt();

			
				int rem=0;
				boolean isFound=false;
				while(num>0){
					rem=num%10;
					if(rem==search){
						isFound=true;
						break;
					}
					num=num/10;
				}
				if(isFound){
					System.out.println("number found");
				}
				else{
					System.out.println("number not found");
				}
			}
}