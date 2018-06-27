public class StretLightContext{
	StreetLightStateI hasCars;
	StreetLightStateI noCars;
	StreetLightStateI redLight;
	StreetLightStateI greenLightNorth;
	StreetLightStateI greenLightSouth;
	StreetLightStateI greenLightEast;
	StreetLightStateI greenLightWest;

	StreetLightStateI currentState;

	int carsCrossed;

	public StreetLight(){
		hasCars = new HasCars(this);
		noCars = new NoCars(this);
		carsCrossed = 0;
		if(carsCrossed >= 2){
			currentState = redLight;
		}
	}

	public void setStreetLightStateI(StreetLightStateI newStreetLightStateI){
		currentState = newStreetLightStateI;
	}

	public void changeLightForNorth(){
		currentState.changeLightForNorth();
	}

	public void changeLightForSouth(StreetLightStateI newStreetLightStateI){
		currentState.changeLightForSouth();
	}

	public void changeLightForEast(StreetLightStateI newStreetLightStateI){
		currentState.changeLightForEast;
	}

	public void changeLightforWest(StreetLightStateI StreetLightStateI){
		currentState.changeLightForWest();
	}

	public int noOfCarsCrossed(){}

}
