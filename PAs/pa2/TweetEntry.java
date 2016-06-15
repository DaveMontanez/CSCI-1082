package pa;

public class TweetEntry {
	
	public String firstName;
	public String lastName;
	public String userName;
	public String tweetText;
	public String tweetDate;
	
	//constructor methods	
	public TweetEntry() {
		
	}

	public TweetEntry(String firstName, String lastName, String userName,
		String tweetText, String tweetDate){		
			this.firstName = firstName;
			this.lastName = lastName;
			this.userName = userName;
			this.tweetText = tweetText;
			this.tweetDate = tweetDate;
	}	

	//Accessor methods
	public String getFirstName(){
		return firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public String getUserName(){
		return userName;
	}
	
	public String getTweetText(){
		return tweetText;
	}
	
	public String getTweetDate(){
		return tweetDate;
	}
	
	//Mutator methods
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	public void setUserName(String userName){
		this.userName = userName;
	}
	
	public void setTweetText(String tweetText){
		this.tweetText = tweetText;
	}
	
	public void setTweetDate(String tweetDate){
		this.tweetDate = tweetDate;
	}
	
	public void showMyTweet(){
		if (this.tweetText.length() <= 140){
			System.out.println(firstName + " " + lastName + " @" + userName);
			System.out.println("@" + userName + " " + tweetText);
		} else {
			String shortTweet = tweetText.substring(0, 140);
			System.out.println(firstName + " " + lastName + " @" + userName);
			System.out.println("@" + userName + " " + shortTweet + "...");
		}
	}
	
	@Override
	public String toString(){
		String userData = String.format("Profile Summary: \n"
				+ "\tFirst Name: %s \n"
				+ "\tLast Name: %s \n"
				+ "\tUsername: %s \n"
				+ "\tDate started: %s \n", this.firstName, this.lastName,
						this.userName, this.tweetDate);
		return userData;
	}
	
	public boolean quals(TweetEntry tweetObj){
		if (tweetText.length() == tweetObj.getTweetText().length()){
			return true;
		} else return false; 
	}	
}