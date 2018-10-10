import com.sforce.soap.enterprise.EnterpriseConnection;
import com.sforce.soap.enterprise.GetUserInfoResult;
import com.sforce.soap.enterprise.sobject.Account;
import com.sforce.ws.ConnectionException;
import com.sforce.ws.ConnectorConfig;


public class Main {

	public static void main(String[] args) throws ConnectionException {

		ConnectorConfig c = new ConnectorConfig();
		c.setUsername("nnaveenraju@yahoo.com");
		c.setPassword("************");
		
		c.setAuthEndpoint("https://login.salesforce.com/services/Soap/c/41.0");
		EnterpriseConnection ec = new EnterpriseConnection(c) ;
		
		GetUserInfoResult r = ec.getUserInfo();
		System.out.println(r.getUserFullName());
		
		
		 
	}

}
