package ca.ualberta.cs.lonelytweet;

import java.io.Serializable;
import java.util.Date;

public class ImportantLonelyTweet extends LonelyTweet implements Serializable {

	public ImportantLonelyTweet() {
	}
//Comment out because of never use in here
// --Commented out by Inspection START (2017-11-02, 11:42 PM):
//	public ImportantLonelyTweet(String text, Date date) {
//		this.tweetDate = date;
//		this.tweetBody = text;
//	}
// --Commented out by Inspection STOP (2017-11-02, 11:42 PM)

	public Date getTweetDate() {
		return tweetDate;
	}

	public void setTweetDate(Date tweetDate) {
		this.tweetDate = tweetDate;
	}

}