package stringsProgram;

public class AddTheSetNumbersInTheGivenString {

	public static void main(String[] args) {
		String s="abc123ef56 ";
		String result="";
		int sum=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='0' && ch<='9') {
				result=result+ch;
			}
			else {
			   if(result!=""){
				   int num=Integer.parseInt(result);
				   sum=sum+num;
				   result="";
			   }
			}
		}
		System.out.println(sum);
	
	}

}
