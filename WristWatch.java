
public class WristWatch extends Clock  {

	public WristWatch() {
		super(ClockType.digital, 0.000034722);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		//should print to standard output the time and drift of a given clock in the following format
		//clock_type, description, time [YX: XX: XX], total drift = Z.ZZ seconds 
		
		System.out.println(super.getClockType()+", "+"WristWatch" + ", " + "[" + super.time.formattedTime()+"], " + "total drift = " + super.time.getTotalDrift());
	}

}
