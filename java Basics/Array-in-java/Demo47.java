import java.util.*;
class Demo47{
				public static void main(String[]args){
					Scanner sc=new Scanner(System.in);
					System.out.println("enter array size :");
					int len=sc.nextInt();
					System.out.println("enter elements :"); 
					int arr[]=new int [len];
					
					for(int i=0;i<arr.length;i++){
						arr[i]=sc.nextInt();
					}

					int newarr[]=new int [len];
					System.out.println("rotated array :");
					newarr[arr.length-1]=arr[0];
					for(int i=1;i<arr.length;i++){
						newarr[i-1]=arr[i];
					}
					System.out.println(Arrays.toString(newarr));
				}
}