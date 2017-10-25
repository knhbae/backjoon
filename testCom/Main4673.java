package testCom;

public class Main4673 {
	
	public static void main(String[] args) throws Exception{
		
		int k = 0;
		
		for(int i=1;i<=10000;i++) {
			
			int Dec = 0;
			
			if(i<10) {
				k = 9;
			}
			else if(i<100) {
				k=18;
			}
			else if(i<1000) {
				k=27;
			}
			else {
				k=36;
			}
			for(int j=1;j<=k;j++) {
				int test1 = SelfNumber(i-j);
				if(i == test1) {
					Dec++;
				}
			}
			if(Dec==0) {
				System.out.println(i);
			}
		}
	}
	
	public static int SelfNumber(int a) {
		
		if(a<0) {
			return 0;
		}
		else{
			int temp_a = 0;
			int result = 0;
			
			result = a/1000;
			temp_a = a-result*1000;
			result = result + temp_a/100;
			temp_a = temp_a-temp_a/100*100;
			result = result + temp_a/10;
			temp_a = temp_a - temp_a/10*10;
			result = result + temp_a;
			
			return a + result;
		}
	}
}