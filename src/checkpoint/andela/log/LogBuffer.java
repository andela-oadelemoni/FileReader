package checkpoint.andela.log;

import java.util.ArrayList;
import java.util.List;

public class LogBuffer
{
	  
	  // LIST TO HOLD LOG FILES.
	  private List<String> log_data = new ArrayList<String>();
	  
	  public synchronized void addLog(String s) {
		  log_data.add(s);
	  }
	  
	  public synchronized List<String> getLog() {
		  return log_data;
	  }
	  
}
