public class EastGreen implements StreetLightStateI{

	StretLightsContext streetLightContext;
	
	public EastGreen(StretLightsContext newStreetLightContext) {
		this.streetLightContext = newStreetLightContext;	
	}
		
	@Override
	public void allowCar() {
		System.out.println("Car can pass through East Signal");
		streetLightContext.setState(streetLightContext.getEastGreen());
	}

	@Override
	public void blockCar() {
		System.out.println("Car cannot pass through East Signal");
		streetLightContext.setState(streetLightContext.getEastRed());
	}

	@Override
	public void changeNorth() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changeEast() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changeSouth() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changeWest() {
		// TODO Auto-generated method stub
		
	}

}
