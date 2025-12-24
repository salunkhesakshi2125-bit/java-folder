import java.util.*;
class Demo38{
				public static void main(String[] args){
					int [] arr={10,20,30};
					int [] newarr=new int[arr.length];
					System.out.println("elements :");
					for (int i=0;i<arr.length;i++){
						newarr[i]=arr[i]++;
					}
					System.out.println(Arrays.toString(newarr));
				}
}