package cz.alisma.alej.text.wrapping;

import java.util.List;

public class CenterAligner implements Aligner  {
	@Override
    public String format(List<String> words) {
        StringBuilder result = new StringBuilder();
        
        
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