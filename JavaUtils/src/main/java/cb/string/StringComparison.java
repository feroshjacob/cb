package cb.string;

import org.apache.lucene.search.spell.JaroWinklerDistance;
import org.apache.lucene.search.spell.LevensteinDistance;
import org.apache.lucene.search.spell.LuceneLevenshteinDistance;
import org.apache.lucene.search.spell.NGramDistance;

public class StringComparison  {

	public static final int POST_PROCESS_JARO = 6;
	public static final int POST_PROCESS_HAM = 5;
	public static final int POST_PROCESS_JACAR = 4;
	public static final int POST_PROCESS_NGRAM = 3;
	public static final int POST_PROCESS_LUCENE_LEVEN = 2;
	public static final int POST_PROCESS_LEVEN = 1;
	public static final int NO_POSTPROCESS = 0;
	public static final int POST_PROCESS_EQUALS = 10;

	public static IStringCompare getDefault() {
	   return  new IStringCompare() {
			
			public float compare(String string1, String string2) {
			//	System.out.println("CMP:" +string1 +":"+ string2);	
				if( string1.trim().toLowerCase().equals(string2.trim().toLowerCase())){
					return 1.0f;
					
				}
				return 0.0f;
			}
		};
	}
	
	public static IStringCompare getJaroWinklerDistance(){
		
		final JaroWinklerDistance obj = new JaroWinklerDistance();			

		return new IStringCompare() {
			public float compare(String string1, String string2) {
				return obj.getDistance(string1, string2);
			}
		};
	}
	
	public static IStringCompare getLevensteinDistance(){
		
		final LevensteinDistance obj = new LevensteinDistance();			

		return new IStringCompare() {
			public float compare(String string1, String string2) {
				return obj.getDistance(string1, string2);
			}
		};
	}
	
	
	public static IStringCompare getLuceneLevensteinDistance(){
		
		final LuceneLevenshteinDistance obj = new LuceneLevenshteinDistance();			

		return new IStringCompare() {
			public float compare(String string1, String string2) {
				return obj.getDistance(string1, string2);
			}
		};
	}
	public static IStringCompare getNgramDistance(){
		
		final NGramDistance obj = new NGramDistance();			
 
		return new IStringCompare() {
			public float compare(String string1, String string2) {
				return obj.getDistance(string1, string2);
			}
		};
	}
	public static IStringCompare getHammingDistance(){
		
		return new HammingDistance();	
	}
	public static IStringCompare getJacardiSimilarity(){
		
		return new JaccardSimiliarity();	
	}
	public static IStringCompare getComplexCompare(final IStringCompare ...compares){
		
	  return new IStringCompare() {
		
		public float compare(String string1, String string2) {
			float val=0.0f;
			for(IStringCompare compare: compares){
				val += compare.compare(string1, string2);
			}
			return val;
		}
	};

	}	
	
	
	public static void main(String[] args) {
	//	IStringCompare  cmp =StringComparison.getNgramDistance();
		//IStringCompare cmp = new HammingDistance();
		IStringCompare cmp = new JaccardSimiliarity();
		System.out.println(cmp.getClass().getName());
		System.out.println(cmp.compare("Ferosh Jacob", "Ferosh Jacob"));
		System.out.println(cmp.compare("Ferosi Jacob", "Farosh Jacob"));
		System.out.println(cmp.compare("Ferosh Jacob", "Jacob Jacob"));
	}

	public static IStringCompare getStringComparer(int algoIndex) {
		switch (algoIndex) {
		case NO_POSTPROCESS:
			System.out.println("NULL");
			return  null;
		case POST_PROCESS_LEVEN:
			System.out.println("LEVEN");
			return getLevensteinDistance();
		case POST_PROCESS_LUCENE_LEVEN:
			System.out.println("LUCLEVE");
			return getLuceneLevensteinDistance();
		case POST_PROCESS_NGRAM:
			System.out.println("NGRAM");
			return getNgramDistance();
		case POST_PROCESS_JACAR:
			System.out.println("JACAR");
			return getJacardiSimilarity();
		case POST_PROCESS_HAM:
			System.out.println("HAM");
			return getHammingDistance();
		case POST_PROCESS_JARO:
			System.out.println("JARO");
			return  getJaroWinklerDistance();
		default:
			System.out.println("DEFAULT");
			return getDefault();
		}
	}
	public static IStringCompare getStringCompare(int... algoIndex){
		if(algoIndex[0]==NO_POSTPROCESS) return null;
	
		IStringCompare[] compares = new IStringCompare[algoIndex.length];
		int i=0;
		for(int index : algoIndex){
			compares[i]= getStringComparer(index);
			i++;
		}
		return getComplexCompare(compares);
	}
}
