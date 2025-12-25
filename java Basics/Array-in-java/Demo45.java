import java.util.*;
class Demo45{
				public static void main(String[]args){
					Scanner sc=new Scanner(System.in);
					System.out.println("enter character :"); 
					char arr[]=new char [5];
					
					for(int i=0;i<arr.length;i++){
						arr[i]=sc.next().charAt(0);
					}
					System.out.println(Arrays.toString(arr));
				}
}