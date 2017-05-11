package _02_DataTypes;

public class Ex02 {
	
	private double meter;
	private double inch;
	
	public Ex02() {
		meter = 0;
		inch = 0;
	}
	public void setInch(double inch){
		this.inch = inch;
	}
	
	public void compute(){
		meter = inch*0.0254;
	}
	
	public double getMeter(){
		return meter;
	}

}
