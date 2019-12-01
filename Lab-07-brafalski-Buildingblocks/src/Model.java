public class Model {
	private int xValue;
	private int yValue;
	
	private int sxValue;
	private int syValue;
	private Controller myController;
	
	public Model(Controller c){
		xValue =25;
		yValue =25;
		myController = c;
		
		sxValue = 25;
		syValue = 25;
		
	}
	
	public void increaseX(int inc){
		xValue+=inc;
	}
	
	public void increaseY(int inc){
		yValue+=inc;
	}
	
	public int getXValue(){
		return xValue;
	}

	public int getYValue(){
		return yValue;
	}
	
	public void setXValue(int x){
		xValue = x;
	}
	
	public void setYValue(int y){
		yValue = y;
	}
	
	
	public void sincreasesX(int inc){
		sxValue+=inc;
	}
	
	public void sincreaseY(int inc){
		syValue+=inc;
	}
	
	public int sgetXValue(){
		return sxValue;
	}

	public int sgetYValue(){
		return syValue;
	}
	
	public void setsXValue(int x){
		sxValue = x;
	}
	
	public void setsYValue(int y){
		syValue = y;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}