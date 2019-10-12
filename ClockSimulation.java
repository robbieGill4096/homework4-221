
public class ClockSimulation {
	public static final long DAY = 86400;
	public static final long WEEK = 604800;
	public static final long MONTH = 2592000;
	public static final long YEAR = 31536000;
	
	//public static void 
	public static void setTime(Bag bag, long day2) {
		for(Object x : bag) {
			int tickCount =0;
			while(tickCount < day2 ) {
			((Clock) x).tick();
			tickCount +=1;
			}
		}
			for(Object i : bag) {
				
				((Clock) i).display();
				((Clock) i).reset();;
				
			}
			
		
		
	}
public static void timePassed(Bag bag) {
	for(Object x : bag) {
		
		((Clock) x).display();
		
	}
	
}
	public static void main(String[] args) {
		Bag bag = new Bag();
		bag.setCapacity(5);
		bag.add(new Sundial());
		bag.add(new CuckooClock());
		bag.add(new GrandfatherClock());
		bag.add(new WristWatch());
		bag.add(new AtomicClock());
		System.out.println("Times before start: ");
		setTime(bag, 0);
		System.out.println("After one day: ");
		setTime(bag, DAY);
		System.out.println("After one week: ");
		setTime(bag, WEEK);
		System.out.println("After one month:");
		setTime(bag, MONTH);
		System.out.println("After one year: ");
		setTime(bag, YEAR);
		
		
		
	
	}
	
}
