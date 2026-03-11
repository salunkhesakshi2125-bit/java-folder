class Demo2{
				public static void main(String [] args){
					StringBuffer s= new StringBuffer ("Khushi");
					System.out.println(System.identityHashCode(s));		
					StringBuffer s1= new StringBuffer ("sarvesh");
					System.out.println(System.identityHashCode(s1));
				}
}