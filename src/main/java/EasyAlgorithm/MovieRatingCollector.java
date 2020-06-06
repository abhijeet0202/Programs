package EasyAlgorithm;
import java.util.*;

class RatingAttributes{
    int totalRatingCount;
    double totalRating;

    public RatingAttributes(int totalRatingCount, double totalRating){
        this.totalRatingCount = totalRatingCount;
        this.totalRating = totalRating;
    }

    public void modifyRatingAndCount(int count,double rating){
        totalRatingCount+=count;
        totalRating+=rating;
    }

    public double calculateAverageRating(double rating){
        
        return totalRating/totalRatingCount;
    }
}
public class MovieRatingCollector {
	
    public static class RatingCollectorImpl implements RatingCollector {
    	static Map<String, RatingAttributes> myMovieCollection = new HashMap<String, RatingAttributes>();
        @Override
        public void putNewRating(String movie, double rating) {
        	RatingAttributes ratingAttributes = null;
            if(myMovieCollection.containsKey(movie)) {
            	ratingAttributes = myMovieCollection.get(movie);
            	ratingAttributes.modifyRatingAndCount(1,rating);
            	myMovieCollection.put(movie, ratingAttributes);
            }else {
            	ratingAttributes = new RatingAttributes(1, rating);
            	myMovieCollection.put(movie,ratingAttributes);
            }
        }

        @Override
        public double getAverageRating(String movie) {
        	RatingAttributes ratingAttributes = null;
        	ratingAttributes = myMovieCollection.get(movie);
        	if(ratingAttributes != null) {
        		return ratingAttributes.totalRating/ratingAttributes.totalRatingCount;
        	}
        	return 0;
        }

        @Override
        public int getRatingCount(String movie) {
        	RatingAttributes ratingAttributes = null;
        	ratingAttributes = myMovieCollection.get(movie);
        	if(ratingAttributes != null) {
        		return ratingAttributes.totalRatingCount;
        	}
        	return 0;
        }
    }

    ////////////////// DO NOT MODIFY BELOW THIS LINE ///////////////////

    public interface RatingCollector {
        // This is an input. Make note of this rating.  Rating can be a double number between 0 and 100.
        void putNewRating(String movie, double rating);

        // Get the average rating
        double getAverageRating(String movie);

        // Get the total number of ratings received for the movie
        int getRatingCount(String movie);
    }

    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        int numLines = Integer.parseInt(scanner.nextLine());
        int currentLine = 0;
        while (currentLine++ < numLines) {
            final RatingCollector stats = new RatingCollectorImpl();
            final Set<String> movies = new TreeSet<>();

            String line = scanner.nextLine();
            String[] inputs = line.split(",");
            for (int i = 0; i < inputs.length; ++i) {
                String[] tokens = inputs[i].split(" ");
                final String symbol = tokens[0];
                movies.add(symbol);
                final double price = Double.parseDouble(tokens[1]);

                stats.putNewRating(symbol, price);

            }

            for (String movie : movies) {
                System.out.println(
                        String.format("%s %.4f %d", movie, stats.getAverageRating(movie), stats.getRatingCount(movie)));
            }

        }
        scanner.close();

    }
}
