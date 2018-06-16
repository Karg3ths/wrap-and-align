package cz.alisma.alej.text.wrapping;

import java.util.List;

public class CenterAligner implements Aligner  {
	@Override
    public String format(List<String> words, int width , int widthoftext) {
        StringBuilder result = new StringBuilder();
        int rozdil = width - widthoftext; 
        int mezery = (rozdil - (rozdil % 2)) / 2;
        result.append(Opakuj.opakuj(" ", mezery));
        
        boolean first = true;
        for (String w : words) {
        	if (!first) {
        		result.append(" ");
        	} else {
        		first = false;
        	}
        	result.append(w);
        }

        return result.toString();
	}

}
