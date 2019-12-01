
public class Novel implements Writing {

	private String name;
	private String add;
	private Status status;
	private String writing;
	private String character;
	
	public Novel(String name){
		this.name = name;
		this.add = "";
		this.
		status = Status.writing;
		this.writing = "";
		this.character = "";
	}
	
	

	
	public void setCharacter(String Character) {
		this.character = Character;
	}
	
	public String getCharacter() {
		return character;
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void Extra(String add) {
		// TODO Auto-generated method stub
		
		this.add = add;
		
		writing += this.add;
	
	}

	
	public void setWriting(String writing) {
		this.writing += writing;
	}
	
	
	@Override
	public String getWriting() {
		// TODO Auto-generated method stub
			return writing;
			
	}

	public String toString() {
		String rtn = name+": Staring "+character+": "+writing+" (this book is "+status+")";
		
		return rtn;
	}
	
	
	
	@Override
	public Status getStatus() {
		// TODO Auto-generated method stub
		return status;
	}
	
	public void setStatus(Status status) {
		this.status = status;
	}


}
