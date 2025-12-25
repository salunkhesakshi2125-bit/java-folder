import java.util.*;
class Demo48{
				public static void main(String[]args){
					Scanner sc=new Scanner(System.in);
					System.out.println("enter array size :");
					int len=sc.nextInt();
					System.out.println("enter elements :"); 
					int arr[]=new int [len];
					
					for(int i=0;i<arr.length;i++){
						arr[i]=sc.nextInt();
					}
					
					int temp=arr[0];
					System.out.println("rotated array :");
					for(int i=1;i<arr.length;i++){
						arr[i-1]=arr[i];
					}
					arr[arr.length-1]=temp;
					System.out.println(Arrays.toString(arr));
				}
}