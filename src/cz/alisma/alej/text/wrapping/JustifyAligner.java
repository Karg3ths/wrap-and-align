package cz.alisma.alej.text.wrapping;

import java.util.List;

public class JustifyAligner implements Aligner {
	@Override
    public String format(List<String> words,int width, int widthoftext) {
        StringBuilder result = new StringBuilder();
	    int pocet = words.size();
	    int mezery = width - widthoftext;
        int mezerymezislovy = 0 ;
	    int x = 0;
	    if(pocet > 1) {
	    	x = mezery % (pocet -1);
	    	mezerymezislovy = (mezery - (x)) / (pocet - 1);
	    }else {
	    	x = 0;
	    }
            
        boolean first = true;
	    int pozice = 1;
        for (String w : words) {
        	if (!first) {
        		result.append(" ");
        	} else {
        		first = false;
        	}
        	result.append(w);
		if(!(pozice == pocet)){
		  result.append(Opakuj.opakuj(" ", mezerymezislovy));
		}
		pozice++;
		if ( x > 0) {
			result.append(" ");
			x--;
		}
        }

        return result.toString();
	}

}
