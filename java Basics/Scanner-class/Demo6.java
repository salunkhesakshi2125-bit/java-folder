import java.util.Scanner;
class  Demo6{
			public static void main(String[]args){
				Scanner sc= new Scanner (System.in);
				System.out.println("Enter character:");
				char ch=sc.next().charAt(3);
				System.out.println("Entered character:"+ch);
			}
}