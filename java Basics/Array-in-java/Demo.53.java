import java.util.*;
class Demo53{
				public static void main(String[]args){
					Scanner sc=new Scanner(System.in);
					System.out.println("enter array size :");
					int len=sc.nextInt();
					System.out.println("enter elements :"); 
					int arr[]=new int [len];
					int diff=0;
					for(int i=0;i<arr.length;i++){
						arr[i]=sc.nextInt();
					}
					
					for (int i=0;i<arr.length;i++){
						diff=arr[i]-arr[i+1];
					}
					System.out.println(diff);
				}
}