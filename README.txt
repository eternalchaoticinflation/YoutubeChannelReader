Reads youtube Channel metadata using Pattern and Matcher.
Assumes html data from Youtube channel of a broadcaster. Use Chrome to get the html of all elements.
Reads html to get title= and Duration and number views.
		//String patternString = ".*http://.*";

	       // Pattern pattern = Pattern.compile(patternString);

	      //  Matcher matcher = pattern.matcher(text);
		
		// for the pattern [   dir=\ltr\ title=   ]
		//Pattern p = Pattern.compile(".*dir=\"ltr\" title=.*", Pattern.CASE_INSENSITIVE);
		//Pattern viewsPattern = Pattern.compile(".*views<.*", Pattern.CASE_INSENSITIVE);

Should look like:

<ul class="yt-lockup-meta-info"><li>131 views</li><li>9 years ago</li></ul>  </div>
dir="ltr" title="Power Symmetries and Asymmetries: #4: No-Harm Symmetries" 
Duration: 7 minutes, 11 seconds.</span></h3>
<ul class="yt-lockup-meta-info"><li>89 views</li><li>9 years ago</li></ul>  </div>
dir="ltr" title="Power Symmetries and Asymmetries: #3 - Definitions" 
Duration: 2 minutes, 51 seconds.</span></h3>
<ul class="yt-lockup-meta-info"><li>185 views</li><li>9 years ago</li></ul>  </div>
dir="ltr" title="Power Symmetries and Asymmetries: #2 - Soft and Hard Power" 
Duration: 4 minutes, 24 seconds.</span></h3>
<ul class="yt-lockup-meta-info"><li>315 views</li><li>9 years ago</li></ul>  </div>
dir="ltr" title="Power Symmetries and Asymmetries -- #1 -- What Power Is" 
Duration: 2 minutes, 3 seconds.</span></h3>