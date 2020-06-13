package com.tavant.main;

class StringOpration {

	public String stringOprationOne(String str) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {

				if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
						|| str.charAt(i) == 'u') {
					sb.append('#');
				} else {
					sb.append(str.charAt(i));
				}
			}
			
		}
		sb.append(sb);
		

		return sb.toString();
	}

}
