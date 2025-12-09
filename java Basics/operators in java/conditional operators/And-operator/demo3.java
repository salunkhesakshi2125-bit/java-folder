class demo3{
			public static void main(String [] args){
				int a=5; 
				int b= 7;
				boolean c= ++a>b++ &&++a>++b;
				System.out.println(c);
				System.out.println(a);
				System.out.println(b);
				}
}