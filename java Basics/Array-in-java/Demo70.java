import java.util.*;
class Demo70{
				public static void main(String [] args){
					Scanner sc = new Scanner(System.in);
					System.out.println("enter size of array :");
					int len=sc.nextInt();
					int []arr=new int[len];
				
					System.out.println("enter elements :");
					for(int i=0;i<arr.length;i++){
						arr[i]=sc.nextInt();
					}
					boolean  isPalindrome=true;
					int mid=arr.length/2;
					for(int i=0;i<arr.length;i++){
						if(arr[i]!=arr[arr.length-1-i]){
							isPalindrome=false;
							break;
						}
					}
					if(isPalindrome){
						System.out.println("palindrome");
					}else{
						System.out.println(" not palindrome");
					}
				}
}