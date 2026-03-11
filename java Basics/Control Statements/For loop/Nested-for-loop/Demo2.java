class Demo2{	
				public static void main(String [] args){
					int num=0;
					for(int i=1;i<2;i++){
						for(int j=1;j<2;j++){
							num=j++;
						}
					}
					System.out.println(num);
				}
}