package pa;

public class TweetEntryDriver {
	
	public static void main(String[] args) {	
		
		//Create 1st tweet entry
		TweetEntry tweet1 = new TweetEntry();
		tweet1.setFirstName("David");
		tweet1.setLastName("Montanez");
		tweet1.setUserName("Davem0n");
		tweet1.setTweetText("Twitter limits Tweet length to 140 characters "
				+ "making the definition of a \"character\" \n and how they are"
				+ "counted central to any Twitter application.");
		tweet1.setTweetDate("06/06/2016");
		
		//Display 1st tweet information
		tweet1.showMyTweet();
		System.out.println("");
		System.out.println(tweet1.toString());
		
		//Create 2nd tweet entry using contructor
		TweetEntry tweet2 = new TweetEntry("Bryce", "Case", "realytcracker",
				"Go to https://soundcloud.com/ytcracker/ytcracker-terminal"
				+ " if you want to hear\n good tunes.", "06/07/2016");
		
		//Display 2nd tweet information
		tweet2.showMyTweet();
		System.out.println("");
		System.out.println(tweet2.toString());
		System.out.println("");
		
		//Compare 1st and 2nd tweet lengths
		System.out.println("Are the tweets the same? " + tweet2.equals(tweet1));
		
	}
}