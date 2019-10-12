
public class CuckooClock  extends Clock  {

	public CuckooClock() {
		super(ClockType.mechanical,.000694444);
		
	}

	@Override
	public void display() {
		System.out.println(super.getClockType()+", "+"CuckooClock" + ", " + "[" + super.time.formattedTime()+"], " + "total drift = " + super.time.getTotalDrift());
	
	}

}
