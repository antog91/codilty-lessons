
public class BinaryGap {
	public static int calculateBinaryGap(int number) {
		int count = 0;
		int previousCount = 0;
		
		String binaryString = Integer.toBinaryString(number);
		System.out.println(Integer.toBinaryString(number));
		
		for(char binaryChar : binaryString.toCharArray()) {
			if(binaryChar == '1') {
				if(previousCount < count) {
					previousCount = count;
				}
				count = 0;
			} else {
				count++;
			}
		}
		
		return previousCount;
	}
	
	public static void main(String [] args) {
		System.out.println(calculateBinaryGap(3343221));
	}
}
