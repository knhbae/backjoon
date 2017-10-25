package testCom;

public class Main4674_2 {
	
	public static void main(String[] args) throws Exception{
				System.out.println(SelfNumber(9993));

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
