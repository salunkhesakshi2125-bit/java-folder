import java.util.*;
class Demo34{
				public static void main (String [] args){
					Scanner sc= new Scanner(System.in);
					int arr[]=new int[5];
				
					System.out.println("enter elements :");
					for(int i=0;i<arr.length;i++){
						arr[i]=sc.nextInt();
					}

					System.out.println("entered elements :");
					for(int i=0;i<arr.length;i++){
						System.out.println(arr[i]);
					}
				}
}