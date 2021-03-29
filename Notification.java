
import java.util.Date;



/**
 * @author NAC
 * @version 1.0
 * @created 30-Dec-2020 10:31:51 PM
 */
public class Notification {

	private String description;
	private Date date;
	private String type;
	private String username;
        
	public Notification(){

	}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
        
        
        
	public void finalize() throws Throwable {

	}

}