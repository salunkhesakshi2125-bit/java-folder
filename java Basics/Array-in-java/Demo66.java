import java.util.*;
class Demo66{
				public static void main(String [] args){
					int [] arr={1,2,3,4,5,6,7,8,9};
					int mid=arr.length/2;
					int index1=0;
					int index2=mid;
					int newarr[]=new int [arr.length];
					for(int i=mid-1;i>=0;i--){
							newarr[index1]=arr[i];
							index1++;
					}
					for(int i=arr.length-1;i>=mid;i--){
							newarr[index2]=arr[i];
							index2++;
					}
					System.out.println(Arrays.toString(newarr));

				}
}
					
					