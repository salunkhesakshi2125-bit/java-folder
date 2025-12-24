import java.util.*;
class Demo35{
				public static void main(String args[]){
					Scanner sc= new Scanner (System.in);
					System.out.println("enter array size :");
					int len=sc.nextInt();
					int []arr=new int[len];
				
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