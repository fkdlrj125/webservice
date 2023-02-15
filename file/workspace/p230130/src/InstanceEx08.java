
public class InstanceEx08 {
	public static Robot constructRobot() {
		Robot robot=new Robot();
		robot.setProductName("Optimus");
		robot.setProductYear(2000);
		
		return robot;
	}
	
	public static void main(String[] args) {
		Robot robot=constructRobot();
		
		robot.showInfo();
	}
	
}
