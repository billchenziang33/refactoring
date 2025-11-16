package theater;

/**
 * Class representing a performance of a play.
 */
public class Performance {

    private final String playID;
    private final int audience;

    public Performance(String playID, int audience) {
        this.playID = playID;
        this.audience = audience;
    }

    /**
     * Returns the play ID for this performance.
     *
     * @return the play ID
     */
    public String getPlayID() {
        return playID;
    }

    /**
     * Returns the audience size for this performance.
     *
     * @return the audience count
     */
    public int getAudience() {
        return audience;
    }
}
