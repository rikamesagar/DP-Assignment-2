package service;
public class EastGreen implements StreetLightStateI{

	StretLightsContext streetLightContext;
	int tempCarsPassed = 0;
	
	public EastGreen(StretLightsContext newStreetLightContext) {
		this.streetLightContext = newStreetLightContext;	
	}
		
	@Override
	public void allowCar() {
		/*
		streetLightContext.allowCar();*/
		if (streetLightContext.getNumberOfCarsPassed() < 3) {
			System.out.println("Car passed through East Signal");
			tempCarsPassed = streetLightContext.getNumberOfCarsPassed();
			tempCarsPassed++;
			streetLightContext.setNumberOfCarsPassed(tempCarsPassed);
			streetLightContext.setState(streetLightContext.getEastGreen());
		} else {
			System.out.println("Only 2 Cars can pass through East Signal");
			streetLightContext.blockCars();
		}		
	}

	@Override
	public void blockCar() {
		streetLightContext.setState(streetLightContext.getWait());
	}

	@Override
	public void changeLight() {
		streetLightContext.setState(streetLightContext.getEastGreen());
		streetLightContext.setState(streetLightContext.getWestRed());
		streetLightContext.setState(streetLightContext.getNorthRed());
		streetLightContext.setState(streetLightContext.getSouthRed());
		streetLightContext.allowCar();
	}
}