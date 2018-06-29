package service;
public class SouthGreen implements StreetLightStateI{

	StretLightsContext streetLightContext;
	int tempCarsPassed = 0;
	
	public SouthGreen(StretLightsContext newStreetLightContext) {
		this.streetLightContext = newStreetLightContext;	
	}
		
	@Override
	public void allowCar() {
		if (streetLightContext.getNumberOfCarsPassed() < 3) {
			System.out.println("Car passed through South Signal");
			tempCarsPassed = streetLightContext.getNumberOfCarsPassed();
			tempCarsPassed++;
			streetLightContext.setNumberOfCarsPassed(tempCarsPassed);
			streetLightContext.setState(streetLightContext.getSouthGreen());
		} else {
			System.out.println("Only 2 Cars can pass through South Signal");
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
		streetLightContext.setState(streetLightContext.getWestRed());
		streetLightContext.setState(streetLightContext.getNorthRed());
		streetLightContext.setState(streetLightContext.getSouthGreen());
		streetLightContext.allowCar();
	}
}