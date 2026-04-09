package IO_Programing;

import java.io.Serializable;

public class SocialMedia implements Serializable //marker interface 
{
	//mediaCount (Static) not serialized because it is static
	//private transient int popularity
	private String name;
	private int userCount;
	
	public SocialMedia(String name, int userCount) {
		super();
		this.name = name;
		this.userCount = userCount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUserCount() {
		return userCount;
	}

	public void setUserCount(int userCount) {
		this.userCount = userCount;
	}

	@Override
	public String toString() {
		return "SocialMedia [name=" + name + ", userCount=" + userCount + "]";
	}

	
}
