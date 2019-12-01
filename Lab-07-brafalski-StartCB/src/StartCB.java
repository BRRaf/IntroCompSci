
public class StartCB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int end = 0;
		CBController c = new CBController();
		
		while (end == 0) {
			
		 end = c.getView().getSqPanel().EndCheck();
		 
		}
		
		c.getView().End();
	}

}
