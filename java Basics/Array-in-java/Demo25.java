class Demo25{
				public static void main(String[] args){
					int [] arr={1,5,2};
					boolean isFound=false;
					for (int i=0;i<arr.length;i++){
						if (arr[i]==5){
							isFound=true;
							break;
						}
					}
					if(isFound){
						System.out.println("yes");
					}else{
						System.out.println("no");
					}
				}
}