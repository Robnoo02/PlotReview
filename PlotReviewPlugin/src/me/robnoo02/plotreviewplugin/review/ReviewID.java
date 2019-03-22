package me.robnoo02.plotreviewplugin.review;

import me.robnoo02.plotreviewplugin.files.DataFile;

/**
 * This class keeps track of current ID.
 * It triggers an update in the datafile when a new ID is generated.
 * @author Robnoo02
 *
 */
public final class ReviewID {

	private static int count = 0;
	
	/**
	 * Constructor
	 * Private to prevent useless instantiation
	 */
	private ReviewID() {
	}
	
	/**
	 * Generates an ID and triggers an update in the datafile
	 * @return unique ID for a review
	 */
	public static int generateID() {
		count++;
		DataFile.getInstance().updateIDProgress();
		return count;
	}
	
	public static int getCurrentCount() {
		return count;
	}
	
	public static void setCurrentCount(int count) {
		ReviewID.count = count;
	}	
}