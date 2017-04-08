package oortcloud.hungryanimals.entities.capability;

public class CapabilityTamablesAnimal implements ICapabilityTamableAnimal {

	private double taming;
	
	public CapabilityTamablesAnimal() {
		setTaming(-2);
	}
	
	@Override
	public double getTaming() {
		return taming;
	}

	@Override
	public double setTaming(double taming) {
		double old = this.taming;
		this.taming = taming;
		return old;
	}

	@Override
	public double addTaming(double taming) {
		return setTaming(getTaming()+taming);
	}

}
