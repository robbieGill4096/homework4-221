
public class AtomicClock extends Clock  {

	public AtomicClock() {
		super(ClockType.quantum,0.0);
		
	}

	@Override
	public void display() {
		System.out.println(super.getClockType()+", "+"AtomicClock" + ", " + "[" + super.time.formattedTime()+"], " + "total drift = " + super.time.getTotalDrift());
		
	}



}
