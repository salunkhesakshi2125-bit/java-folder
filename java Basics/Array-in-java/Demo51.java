import java.util.*;
class Demo51{
				public static void main(String[]args){
					Scanner sc=new Scanner(System.in);
					System.out.println("enter elements :"); 
					int arr[]=new int [3];
					int count=0;
					for(int i=0;i<arr.length;i++){
						arr[i]=sc.nextInt();
					}
					
					for (int i=0;i<arr.length;i++){
						count++;
					}
					System.out.println("total elements in array :");
					System.out.println(count);
				}
}