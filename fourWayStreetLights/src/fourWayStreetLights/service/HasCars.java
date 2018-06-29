package service;

public class HasCars implements StreetLightStateI{

	StretLightsContext streetLightContext;
	
	public HasCars(StretLightsContext newStreetLightContext) {
		this.streetLightContext = newStreetLightContext;
	}

	@Override
	public void allowCar() {
		System.out.println("Car crossed the Intersection");
		streetLightContext.setState(streetLightContext.getHasCars());
	}

	@Override
	public void blockCar() {
		System.out.println("Car blocked, only 2 cars can pass");
		streetLightContext.setState(streetLightContext.getHasCars());
	}

	@Override
	public void changeLight() {
		// TODO Auto-generated method stub
		
	}

	/*@Override
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
*/
}
