package ca.ualberta.cs.lonelytweet;

import java.io.IOException;
import java.util.Date;

/**
 * Created by xzhuang1 on 2017-11-02.
 */

@SuppressWarnings("DefaultFileTemplate")
class LonelyTweet {
    private static final long serialVersionUID = 1L;
    private Date tweetDate;
    private String tweetBody;

    public Date getTweetDate() {
        return tweetDate;
    }

    public void setTweetDate(Date tweetDate) {
        this.tweetDate = tweetDate;
    }

    public void setTweetBody(String tweetBody) {
        this.tweetBody = tweetBody;
    }

    private void writeObject(java.io.ObjectOutputStream out) throws IOException {
        out.writeObject(tweetDate);
        out.writeObject(tweetBody);
    }

    private void readObject(java.io.ObjectInputStream in) throws IOException,
            ClassNotFoundException {
        tweetDate = (Date) in.readObject();
        tweetBody = (String) in.readObject();
    }

    //simplified if in this part because of the redundancy
    public boolean isValid() {
        return !(tweetBody.trim().length() == 0
                || tweetBody.trim().length() > 20);

    }
    

    // change to private
    private String getTweetBody(){
        return tweetBody.toUpperCase();
    }

    @Override
    public String toString() {
        return getTweetDate() + " | " + getTweetBody() ;
    }
}
