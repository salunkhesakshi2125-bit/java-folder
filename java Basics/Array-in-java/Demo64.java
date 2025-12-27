import java.util.*;
class Demo64{
				public static void main(String [] args){
					Scanner sc=new Scanner(System.in);
					System.out.println("enter array size :");
					int len = sc.nextInt();
					System.out.println("enter array elements :");
					int arr[]=new int[len];
					int count=0;

					for(int i=0;i<arr.length;i++){
						arr[i]=sc.nextInt();
					}
					for(int i=0;i<arr.length;i++){
						if (arr[0]<arr[i]){			
							count++;
						}
					}
					System.out.println("greater elements :"+count);
				}
}