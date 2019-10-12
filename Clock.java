
public abstract class Clock implements TimePiece {
	private ClockType clockType;
	protected Time time;
	

	public static enum ClockType {
		 digital, quantum, natural, mechanical,
	}

	public Clock(ClockType clocktype, double drift) {
		this.clockType = clocktype;
		this.time = new Time(drift);
		
	}
	public ClockType getClockType() {
		return clockType;
	}
	
	public void setClockType(ClockType clocktype) {
		this.clockType = clocktype;
	}
	public void reset() {
		time.resetToStartTime();
		
	}
	public void tick() {
		time.incrementTime();
		
	}
	public abstract void display();
	

}

