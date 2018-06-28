public class StretLightsContext{
	StreetLightStateI northGreen;
	StreetLightStateI northRed;
	StreetLightStateI eastGreen;
	StreetLightStateI eastRed;
	StreetLightStateI southGreen;
	StreetLightStateI southRed;
	StreetLightStateI westGreen;
	StreetLightStateI westRed;
	StreetLightStateI hasCars;
	StreetLightStateI noCars;

	StreetLightStateI currentState = noCars;
	
	int numberOfCarsPassed = 0;

	public StretLightsContext(){
		northGreen = new NorthGreen(this);
		northRed = new NorthRed(this);
		eastGreen = new EastGreen(this);
		eastRed = new EastRed(this);
		southGreen = new SouthGreen(this);
		southRed = new SouthRed(this);
		westGreen = new WestGreen(this);
		westRed = new WestRed(this);
		hasCars = new HasCars(this);
		noCars = new NoCars(this);
	}

	public void changeSouth() {
		currentState.changeSouth();
	}

	public void changeNorth() {
		currentState.changeNorth();
	}
	
	public void changeEast() {
		currentState.changeEast();
	}
	
	public void changeWest() {
		currentState.changeWest();
	}
	
	public void blockCars() {
		currentState.blockCar();
	}
	
	public void allowCar() {
		currentState.allowCar();
	}
	
	void setState(StreetLightStateI state) {
		this.currentState = state;
	}
	
	public StreetLightStateI getNorthGreen(){return northGreen;}
	public StreetLightStateI getNorthRed(){return northRed;}
	public StreetLightStateI getSouthGreen(){return southGreen;}
	public StreetLightStateI getSouthRed(){return southRed;}
	public StreetLightStateI getEastGreen(){return eastGreen;}
	public StreetLightStateI getEastRed(){return eastRed;}
	public StreetLightStateI getWestGreen(){return westGreen;}
	public StreetLightStateI getWestRed(){return westRed;}
	public StreetLightStateI getHasCars(){return hasCars;}
	public StreetLightStateI getNoCars(){return noCars;}
}
