import java.util.*;
class Demo49{
				public static void main(String[]args){
					Scanner sc=new Scanner(System.in);
					System.out.println("enter array size :");
					int len=sc.nextInt();
					System.out.println("enter elements :"); 
					int arr[]=new int [len];
					
					int newarr[]=new int[len];
					for(int i=0;i<arr.length;i++){
						arr[i]=sc.nextInt();
					}
					int index=0;
					for(int i=arr.length-1;i>=0;i--){
						newarr[index]=arr[i];
						index++;
					}
					System.out.println(Arrays.toString(newarr));
				}
}	