package service;
public class NoCars implements StreetLightStateI{

	StretLightsContext streetLightContext;
	
	public NoCars(StretLightsContext newStreetLightContext) {
		this.streetLightContext = newStreetLightContext;
	}

	@Override
	public void allowCar() {
		System.out.println("No cars to cross the intersection");
		streetLightContext.setState(streetLightContext.getNoCars());
	}

	@Override
	public void blockCar() {
		System.out.println("No cars to block at the intersection");
		streetLightContext.setState(streetLightContext.getNoCars());
	}

	@Override
	public void changeLight() {
		// TODO Auto-generated method stub
		
	}

/*	@Override
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
		
	}*/


}
