public class Sundial extends Clock {

	public Sundial() {
		super(ClockType.natural,0.00);
		
	}

	@Override
	public void display() {
		System.out.println(super.getClockType()+", "+"Sundial" + ", " + "[" + super.time.formattedTime()+"], " + "total drift = " + super.time.getTotalDrift());
	
		
	}
}