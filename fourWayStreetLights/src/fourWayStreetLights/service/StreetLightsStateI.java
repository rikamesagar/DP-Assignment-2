public interface StreetLightStateI{

	void carsArrived();
	void changeLightForNorth();
	void changeLightForSouth();
	void changeLightForEast();
	void changeLightForWest();
	int noOfCarsCrossed();
}
