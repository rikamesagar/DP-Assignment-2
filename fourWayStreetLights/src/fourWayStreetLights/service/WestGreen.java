package service;
public class WestGreen implements StreetLightStateI{

	StretLightsContext streetLightContext;
	int tempCarsPassed = 0;
	
	public WestGreen(StretLightsContext newStreetLightContext) {
		this.streetLightContext = newStreetLightContext;	
	}
		
	@Override
	public void allowCar() {
		if (streetLightContext.getNumberOfCarsPassed() < 3) {
			System.out.println("Car passed through West Signal");
			tempCarsPassed = streetLightContext.getNumberOfCarsPassed();
			tempCarsPassed++;
			streetLightContext.setNumberOfCarsPassed(tempCarsPassed);
			streetLightContext.setState(streetLightContext.getWestGreen());
		} else {
			System.out.println("Only 2 Cars can pass through West Signal");
			streetLightContext.blockCars();
		}		
	}

	@Override
	public void blockCar() {
		streetLightContext.setState(streetLightContext.getWait());
	}

	@Override
	public void changeLight() {
		streetLightContext.setState(streetLightContext.getEastRed());
		streetLightContext.setState(streetLightContext.getWestGreen());
		streetLightContext.setState(streetLightContext.getNorthRed());
		streetLightContext.setState(streetLightContext.getSouthRed());
		streetLightContext.allowCar();
	}	
}