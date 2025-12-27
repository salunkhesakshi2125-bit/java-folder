import java.util.*;
class Demo59{
				public static void main(String [] args){
					Scanner sc=new Scanner(System.in);
					System.out.println("enter array size :");
					int len = sc.nextInt();
					System.out.println("enter array elements :");
					int arr[]=new int[len];

					for(int i=0;i<arr.length;i++){
						arr[i]=sc.nextInt();
					}
					int value=arr[0];
					for(int i=0;i<arr.length-1;i++){
						arr[i]=arr[i+1];
					}
					arr[arr.length-1]=value;
					System.out.println(Arrays.toString(arr));
				}
}
					