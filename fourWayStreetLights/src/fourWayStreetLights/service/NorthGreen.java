package service;
public class NorthGreen implements StreetLightStateI{

	StretLightsContext streetLightContext;
	int tempCarsPassed = 0;
	
	public NorthGreen(StretLightsContext newStreetLightContext) {
		this.streetLightContext = newStreetLightContext;	
	}
		
	@Override
	public void allowCar() {
		/*
		streetLightContext.allowCar();*/
		if (streetLightContext.getNumberOfCarsPassed() < 3) {
			System.out.println("Car passed through North Signal");
			tempCarsPassed = streetLightContext.getNumberOfCarsPassed();
			tempCarsPassed++;
			streetLightContext.setNumberOfCarsPassed(tempCarsPassed);
			streetLightContext.setState(streetLightContext.getNorthGreen());
		} else {
			System.out.println("Only 2 Cars can pass through North Signal");
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
		streetLightContext.setState(streetLightContext.getNorthGreen());
		streetLightContext.setState(streetLightContext.getSouthRed());
		streetLightContext.allowCar();
	}
}