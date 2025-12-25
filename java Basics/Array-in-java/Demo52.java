import java.util.*;
class Demo52{
				public static void main(String[]args){
					Scanner sc=new Scanner(System.in);
					
					System.out.println("enter element to replace :"); 
					int replace=sc.nextInt();
					System.out.println("enter elements :"); 
					int arr[]=new int [3];

					for(int i=0;i<arr.length;i++){
						arr[i]=sc.nextInt();
					}
					for(int i=0;i<arr.length;i++){
						arr[i]=replace;
					}
					System.out.println(Arrays.toString(arr));
				}
}