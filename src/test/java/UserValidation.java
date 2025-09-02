
public class UserValidation {
	public boolean check(String inUID,String inPSW)
	{
		String UID="srinu";
		String PSW="Srinu@123";
		if(inUID.equals(UID) && inPSW.equals(PSW))
			return true;
		else
			return false;
	}
}
