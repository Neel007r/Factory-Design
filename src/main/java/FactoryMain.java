import com.phone.Android;
import com.phone.OS;
import com.phone.OperatingSysFactory;

public class FactoryMain {

	public static void main(String[] args) {
		
		OperatingSysFactory osf = new OperatingSysFactory();
		OS obj = osf.getInstance("Closed");
		obj.spec();

	}

}
