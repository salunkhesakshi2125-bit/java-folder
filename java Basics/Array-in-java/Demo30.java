class Demo30{
				public static void main(String[] args){
					int [] arr={5,8,5};
					boolean isSame=true;
					for(int i=1;i<arr.length;i++){
						if(arr[0]==arr[i]){	
							isSame=false;
							break;
						}
					}
					if(isSame){
						System.out.println("false");
					}else{
					System.out.println("true");

					}
				}
}
