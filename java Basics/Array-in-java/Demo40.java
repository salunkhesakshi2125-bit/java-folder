import java.util.*;
class Demo40{
				public static void main (String [] args){
					Scanner sc= new Scanner (System.in);
					System.out.println("enter array size :");
					int len= sc.nextInt();
					int [] arr=new int[len];

					System.out.println("enter elements :");
					for(int i=0;i<arr.length;i++){
						arr[i]=sc.nextInt();
					}
					
					int newarr[]=new int [len];
					 int index=0;
					for(int i=0;i<arr.length;i++){
						if(arr[i]!=0){
							 newarr[index]=arr[i];
							index++;
						}
					}
					System.out.println(Arrays.toString(newarr));
				}
}