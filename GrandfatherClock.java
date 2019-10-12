
public class GrandfatherClock  extends Clock  {

	public GrandfatherClock() {
		super(ClockType.mechanical, .000347222);
		
	}

	@Override
	public void display() {
		System.out.println(super.getClockType()+", "+"GrandfatherClock" + ", " + "[" + super.time.formattedTime()+"], " + "total drift = " + super.time.getTotalDrift());
	
		
	}

}
