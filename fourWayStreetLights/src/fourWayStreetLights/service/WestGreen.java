public class WestGreen implements StreetLightStateI{

	StretLightsContext streetLightContext;
	
	public WestGreen(StretLightsContext newStreetLightContext) {
		this.streetLightContext = newStreetLightContext;	
	}

	@Override
	public void allowCar() {
		System.out.println("Car can pass through South Signal");
		streetLightContext.setState(streetLightContext.getSouthGreen());
	}

	@Override
	public void blockCar() {
		System.out.println("Car cannot pass through South Signal");
		streetLightContext.setState(streetLightContext.getSouthRed());
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