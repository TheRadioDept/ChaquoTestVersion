import rake_nltk
from rake_nltk import Rake

def main():
	r = Rake() 

	text = "Feature extraction is not that complex. There are many 			algorithms available that can help you with feature extraction. Rapid Automatic Key Word Extraction is one of those"

	r.extract_keywords_from_text(text) 

	words = r.get_ranked_phrases_with_scores()
	return words
	
	
	
