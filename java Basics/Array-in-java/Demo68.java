import java.util.*;
class Demo68{
				public static void main(String [] args){
					Scanner sc = new Scanner(System.in);
					System.out.println("enter size of array :");
					int len=sc.nextInt();
					int []arr=new int[len];
				
					System.out.println("enter elements :");
					for(int i=0;i<arr.length;i++){
						arr[i]=sc.nextInt();
					}
					int index=arr.length-1;
					int newarr[]=new int [len];
					boolean isPalindrome=true;
					for(int i=0;i<arr.length;i++){
						newarr[index]=arr[i];
						index--;
					}
					for(int i=0;i<arr.length;i++){
						if(arr[i]!=newarr[i]){
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