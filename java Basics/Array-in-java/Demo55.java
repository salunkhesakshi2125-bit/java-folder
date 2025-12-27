class Demo55{
				public static void main (String[] args){
					int arr[]={1,2,3,4,5};
					int first=0;
					int last =arr.length-1;
					for(int i=0;i<arr.length/2;i++){
						System.out.println(arr[i]+arr[last]);
						last--;
					}
					if (arr.length%2!=0){
						System.out.println(arr[arr.length/2]);
					}else{
						System.out.println(arr[arr.length/2-1]);
					}


				}
}