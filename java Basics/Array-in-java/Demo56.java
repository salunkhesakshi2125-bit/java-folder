import java.util.*;
class Demo56{
				public static void main(String [] args){
					Scanner sc=new Scanner(System.in);
					System.out.println("enter array size :");
					int len = sc.nextInt();
					System.out.println("enter array elements :");
					int arr[]=new int[len];
					boolean isSame=true;

					for(int i=0;i<arr.length;i++){
						arr[i]=sc.nextInt();
					}
					for(int i=1;i<arr.length;i++){
						if(arr[0]!=arr[i]){
							isSame=false;
							break;
						}
					}
					if(isSame){
						System.out.println("true");
					}else{
						System.out.println("false");
					}
				}
}