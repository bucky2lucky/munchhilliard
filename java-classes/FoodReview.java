import java.time.LocalDate;

/**
  describe this class
*/
public class FoodReview
{
    // declare private instance vars
    private Restaurant restaurant;
    private double reviewScore;
    private String reviewTitle;
    private String reviewBody;
    private String reviewer;
    private User user;
    private LocalDate timestamp;
    private int numUsefulLikes; // similar to Like button, but says "Useful"
    private int numFunnyLikes; // similar to Like button, but says "Funny"
    private int numCoolLikes; // similar to Like button, but says "Cool"

    /**
      describe this constructor
      @param
      @param
      @param
      @param
      @param
    */
    public FoodReview(Restaurant _restaurant, double _reviewScore, String _reviewTitle, String _reviewBody, User _user)
    {
        numUsefulLikes = 0; // defaults to 0
        numFunnyLikes = 0; // defaults to 0
        numCoolLikes = 0; // defaults to 0
        // set instance var values using parameters
        // TO DO
    }

    // accessors and mutators here

    /**
      returns the date that the review was posted
      @return LocalDate object timestamp which is the date that the review was posted
    */
    public LocalDate getTimestamp()
    {
      return timestamp;
    }
  
  
   /**
      returns the name of the reviewer
      @return string reviewer, which is the name of the reviewer
    */
    public String getReviewer(String _reviewer)
    {
      reviewer = _reviewer;
      return reviewer;
    }
