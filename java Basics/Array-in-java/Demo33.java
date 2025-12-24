import java.util.*;
class Demo33{
				public static void main(String args[]){
					Scanner sc =new Scanner (System.in);
					int [] arr= new int [3];

					System.out.println("Enter first element :");
					arr[0]=sc.nextInt();

					System.out.println("Enter Second element :");
					arr[1]=sc.nextInt();

					System.out.println("Enter third element :");
					arr[2]=sc.nextInt();
	
					System.out.println(Arrays.toString(arr));
				}
}