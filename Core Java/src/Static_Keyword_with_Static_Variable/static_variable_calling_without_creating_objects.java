package Static_Keyword_with_Static_Variable;

class Variable
{
	static int a = 10;
}

public class static_variable_calling_without_creating_objects 
{

	public static void main(String[] args)
	{
		System.out.println(Variable.a);
	}

}
