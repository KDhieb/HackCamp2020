package com.example.hackcamp.models;

public class PCodeForRankingResults {

    /* You have some overall score field. This will be used to display the options IN ORDER
    (i.e. by potentially using something like an ArrayList in the back end). This list size may or
    may not be fixed to show the best 5-10 options instead of showing you every restaurant in a 5km
    radius or something (something we'll have to decide on).

    private double totalScore = 0; <-- Initialized as zero.

    We have some constant multipliers for how we'd like to give weight to things. We're analyzing on
    three different criteria: Google rating, distance, and busyness (since this is a busyness app, I
    think this should be top priority, followed by rating then distance).

    I'm assuming that Google does the "not busy" or "very busy" score somehow. I think there
    are three categories:

    1. Not (too) busy
    2. A little busy
    3. As busy as it gets (i.e. very busy)

    So we have 5 constants total:

    3 for BUSYNESS_RATING (a constant value which is fetched by a helper)...

    private static final int NOT_BUSY = 3 ---> (This is the highest score, what we want)
    private static final int LITTLE_BUSY = 2 (Good, but not perfect)
    private static final int VERY_BUSY = 1 (Only multiply by 1 because we want to lower the score)

    ...and 2 for criteria:

     private static final int GOOGLE_RATING = (this will be fetched and calculated using a helper
     method (all of these will), the max score is
     500 (for a 5 star restaurant for example) and the lowest is 100. 4.6 stars = 460 points

     private static final int DISTANCE = 10 * number of kms away you are (we should make it so the
     user can only travel a maximum of 10km anyway).

     Now we calculate like so.

     totalScore = ceil((GOOGLE_RATING * BUSYNESS_RATING) / DISTANCE)

     So for example, a 4.4 star restaurant 3km away that is not busy gets a score of...

     totalScore = ceil((440 * 3) / 20)
     totalScore = ceil(66)
     totalScore = 66

     But a 4 star restaurant 1km away (closer) that is not busy gets a score of...
     totalScore = ceil((400 * 3) / 10)
     totalScore = ceil(120)
     totalScore = 120

     And a 5 star restaurant that is close (1km) but too busy (not viable, discouraged)
     gets a score of...
     totalScore = ceil((500 * 1) / 10)
     totalScore = ceil(50)
     totalScore = 50

     And this is why we need ceil...

     e.g. 3.4 star 5km away and very busy...
     totalScore = ceil((340 * 1) / 50))
     totalScore = ceil(6.8)
     totalScore = 7


     FIELDS FOR API:
     - TYPE OF BUSINESS
     - MINIMUM STAR RATING
     - MAX_DISTANCE (up to 20km)

    FIELDS FROM API:
    - STAR RATING (get this back)
    - BUSYNESS (from scraping)
    - DISTANCE FROM YOU AS USER TO STORE
    =====================================
   FROM API BUT NOT USED TO CALCULATE SCORE:
    - CONTACT INFO






     */
}
