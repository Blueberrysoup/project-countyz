package com.codebat;

import java.util.ArrayList;

public class CountYZ {
	
	public int countYZ(String yz) {
		int count = 0;
		int i = 0;
		char ch;
		StringBuilder tempStr = new StringBuilder();
		ArrayList<String> yzList = new ArrayList<String>();
		
		while (i < yz.length()){						//Gå igenom hela strängen
			ch = yz.charAt(i);
			if (Character.isLetter(ch))					//om det är en bokstav
				tempStr.append(ch);						//lägg till bokstaven till tempStr
			else{
				yzList.add(tempStr.toString());			//När ett ord är slut, lägg till det i arraylist
				tempStr.delete(0,i);					//Töm tempStr så den kan användas igen				
			}
			i++;
		}
		yzList.add(tempStr.toString());					//Lägg till sista ordet också i arrayList
		
		for (int j = 0; j < yzList.size(); j++){
			if ((yzList.get(j).endsWith("y")) || (yzList.get(j).endsWith("Y")) || (yzList.get(j).endsWith("z")) || (yzList.get(j).endsWith("Z")))
				count ++;
		}
		return count;
	}
}
