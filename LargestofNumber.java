
public class largestnumber { 
		public static void main(String[] args) {
			int[] num = {16,65,86,82,28,82};
			int max = num[0];
			for(int i=0;i<num.length;i++) {
				if(num[i]>max) {
					max = num[i];
				}
			}System.out.println(max);
		}

	}



