import java.util.*;
class Demo54{
				public static void main(String[]args){
					Scanner sc=new Scanner(System.in);
					System.out.println("enter array size :");
					int len=sc.nextInt();
					System.out.println("enter elements :"); 
					int arr[]=new int [len];
					int sum=0;
					for(int i=0;i<arr.length;i++){
						arr[i]=sc.nextInt();
					}
					sum=arr[0]+arr[arr.length-1];
					System.out.println("sum is :"+sum);

				}
}