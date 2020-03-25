package epam.tddjunit;

public class RemoveA {
	public String remove(String s) {
		String result = s;
		int strlength = s.length();
		if(strlength < 1) {
			result = s;
		}
		if(strlength >= 2) {
			char firstChar = s.charAt(0);
			char secondChar = s.charAt(1);
			String remainingChars = s.substring(2, strlength);

			if(firstChar == 'A' && secondChar == 'A') {
				result = remainingChars;
			}
			if(firstChar != 'A' && secondChar == 'A') {
				result = firstChar + remainingChars;
			}
			if(firstChar == 'A' && secondChar != 'A') {
				result = secondChar + remainingChars;
			}
			if(firstChar != 'A' && secondChar != 'A') {
				result = s;
			}
		}
		return result;
		
	}

}
