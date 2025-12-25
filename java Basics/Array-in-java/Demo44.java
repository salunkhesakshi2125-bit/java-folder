import java.util.*;
class Demo44{
				public static void main(String[]args){
					Scanner sc=new Scanner(System.in);
					System.out.println("enter array size :");
					int len=sc.nextInt();
					System.out.println("enter elements :"); 
					int arr[]=new int [len];
					
					for(int i=0;i<arr.length;i++){
						arr[i]=sc.nextInt();
					}
					System.out.println("missing element :");
					for(int i=0;i<arr.length;i++){
						if(arr[i]!=i+1){
							System.out.println(i+1);
							break;
						}
					}
				}
}