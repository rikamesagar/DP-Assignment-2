public class SouthGreen implements StreetLightStateI{

	StretLightsContext streetLightContext;
	
	public SouthGreen(StretLightsContext newStreetLightContext) {
		this.streetLightContext = newStreetLightContext;	
	}
	
	@Override
	public void allowCar() {
		streetLightContext.allowCar();
		if (streetLightContext.getNumberOfCarsPassed() < 3) {
			streetLightContext.setState(streetLightContext.getSouthGreen());
			System.out.println("Car passed through South Signal");
		} else {
			System.out.println("Only 2 Cars can pass through South Signal");
			streetLightContext.setState(streetLightContext.getSouthRed());
		}
	}

	@Override
	public void blockCar() {
		System.out.println("Car cannot pass through South Signal");
		streetLightContext.setState(streetLightContext.getSouthRed());
	}

	@Override
	public void changeNorth() {
		System.out.println("North Changed to Red");
		streetLightContext.setState(streetLightContext.getNorthRed());
	}

	@Override
	public void changeEast() {
		System.out.println("East Changed to Red");
		streetLightContext.setState(streetLightContext.getEastRed());
	}

	@Override
	public void changeSouth() {
		System.out.println("South Changed to Red");
		streetLightContext.setState(streetLightContext.getSouthRed());
	}

	@Override
	public void changeWest() {
		System.out.println("West Changed to Red");
		streetLightContext.setState(streetLightContext.getWestRed());
	}
}