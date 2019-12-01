
public class Poem implements Writing {

	private String rhymescheme;
	private String name;
	private String writing;
	private Status status;
	
	public Poem(String name, String rhymescheme) {
		this.name = name;
		this.rhymescheme = rhymescheme;
		writing = "";
		status = Status.writing;
	}
	
	
	
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void Extra(String add) {
		// TODO Auto-generated method stub
		writing += add;
	}

	public void setWriting(String writing) {
		this.writing = writing;
	}
	
	@Override
	public String getWriting() {
		// TODO Auto-generated method stub
		return writing;
	}

	@Override
	public Status getStatus() {
		// TODO Auto-generated method stub
		return status;
	}

	@Override
	public void setStatus(Status status) {
		// TODO Auto-generated method stub
		this.status = status;
	}

	public String toString() {
		String rtn = name+": "+rhymescheme+" rhyme scheme: "+writing+" (The status of this book is "+status+")";
		return rtn;
	}
	
}
