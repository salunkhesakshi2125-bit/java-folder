import java.util.*;
class Demo39{
				public static void main(String[]args){
					Scanner sc=new Scanner(System.in);
					System.out.println("enter array size");
					int len=sc.nextInt();
					int arr[]=new int [len];
					
					System.out.println("elements :");
					for (int i=0;i<arr.length;i++){
						arr[i]=sc.nextInt();
					}

					int newarr[]= new int [arr.length];
					for (int i=0;i<arr.length;i++){
						newarr[i]=arr[i]+1;
					}
					System.out.println(Arrays.toString(newarr));
				}
}