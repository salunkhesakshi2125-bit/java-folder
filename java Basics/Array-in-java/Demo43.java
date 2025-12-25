import java.util.*;
class Demo43{
				public static void main(String[]args){
					Scanner sc=new Scanner(System.in);
					System.out.println("enter array size :");
					int len=sc.nextInt();
					System.out.println("enter elements :"); 
					int arr[]=new int [len];
					
					for(int i=0;i<arr.length;i++){
						arr[i]=sc.nextInt();
					}
					int index=0;
					int newarr[]=new int[arr.length];
					for(int i=0;i<arr.length;i++){
						if(arr[i]>0){
							newarr[index]=arr[i];
							index++;
						}
					}
					System.out.println(Arrays.toString(newarr));
				}
}