import java.util.*;
class Demo50{
				public static void main(String[]args){
					Scanner sc=new Scanner(System.in);
					System.out.println("enter array size :");
					int len=sc.nextInt();
					System.out.println("enter elements :"); 
					int arr[]=new int [len];
					
					for(int i=0;i<arr.length;i++){
						arr[i]=sc.nextInt();
					}
					int left=0	;
					int right=arr.length-1;
					while(left<right){
						int temp=arr[left];
						arr[left]=arr[right];
						arr[right]=temp;
						left++;
						right--;
					}
					System.out.println(Arrays.toString(arr));
				}
}