public class SentenceAndWordReverse {

	public static void main(String[] args) {
		
		reverseWrodsAndSentence("hope you are doing well");

	}
	public static void reverseWrodsAndSentence(String str){
		
		String input=str.toLowerCase();
		byte [] strAsByteArray = input.getBytes();
		  byte [] result = new byte [strAsByteArray.length];
		   
		  for(int i = 0; i<strAsByteArray.length; i++){
		  result[i] = strAsByteArray[strAsByteArray.length-i-1];
		  }
		  System.out.println( new String(result));		
	}
}
