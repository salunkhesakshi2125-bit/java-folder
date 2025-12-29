import java.util.*;
class Demo69{
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
					int left=0;
					int right=arr.length-1;
					while(left<right){
						if(arr[left]!=arr[right]){
							isPalindrome=false;
							break;
						}
						left++;
						right--;
					}
					if(isPalindrome){
						System.out.println("palindrome");
					}else{
						System.out.println(" not palindrome");
					}
				}
}