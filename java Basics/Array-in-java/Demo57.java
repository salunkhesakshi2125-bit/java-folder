import java.util.*;
class Demo57{
				public static void main(String [] args){
					Scanner sc=new Scanner(System.in);
					System.out.println("enter array size :");
					int len = sc.nextInt();
					System.out.println("enter array elements :");
					int arr[]=new int[len];
					boolean isSorted=true;
					for(int i=0;i<arr.length;i++){
						arr[i]=sc.nextInt();
					}
					
					for(int i=1;i<arr.length;i++){
						if(arr[i]<arr[0]+1){
							isSorted=false;
							break;
						}
					}
					if(isSorted){		
						System.out.println("sorted");
					}else{
						System.out.println(" not sorted");
					}
				}
}
					