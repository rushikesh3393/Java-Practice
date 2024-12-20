import java.util.*;
import java.util.function.*;

public class FunctionInterfaceExample
{
	public static void main(String x[])
	{
		System.out.println(((Supplier <Date>)()-> new java.util.Date()).get());
	}
}
