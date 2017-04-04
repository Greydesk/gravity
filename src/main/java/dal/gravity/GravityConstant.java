package dal.gravity;

public class GravityConstant implements GravityModel{
   	private double Gravity = 9.80665;
   	public GravityConstant(double Gravity){
   		this.Gravity=Gravity;
   	}
	@Override
	public double getGravitationalField() {
		// TODO Auto-generated method stub
		return Gravity;
	}
}
