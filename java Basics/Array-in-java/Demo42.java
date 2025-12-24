import java.util.*;
class Demo42{
				public static void main(String []args){
					Scanner sc=new Scanner (System.in);
					char arr[]=new char[4];
					System.out.println("enter characters :");
					for(int i=0;i<arr.length;i++){
						arr[i]=sc.next().charAt(0);
					}
					System.out.println(Arrays.toString(arr));
				}
}