package stackPrograms;

class Stack
{
	private static final int n = 1024;
	private Object s[];
	private static int top;
	
	public Stack()
	{
		s = new Stack[n];
		this.top = -1;
	}
	
	public void push(Object temp) throws Exception
	{
		if(top == n)
			throw new Exception("Stack Overflow");
		s[++top] = temp;
		//System.out.println("The element "+temp+" is inserted");
	}
	
	public Object pop() throws Exception
	{
		if(top == -1)
			throw new Exception("Stack is empty");
		Object element = s[top];
		s[top--] = null;
		System.out.println("Element "+element+" is popped");
		return element;
	}
	
	public int size()
	{
		return top+1;
	}
	
	public boolean isEmpty()
	{
		if(top == -1)
			return true;
		return false;
	}
	
	public void print() throws Exception
	{
		if(isEmpty())
			throw new Exception("Stack is empty");
		System.out.println("Entire stack");
		for(int i=0;i<top;i++)
		{
			System.out.println(s[i]);
		}
	}
}
public class StackImplementation 
{
	public static void main(String args[])
	{
		Stack s1 = new Stack();
		try
		{
			s1.push(new Object());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		try
		{
			Object temp = s1.pop();
		}
		catch(Exception e) 
		{
			System.out.println("Pop :"+e.getMessage());
		}
		
		System.out.println("Is empty :"+s1.isEmpty());
		System.out.println("Size :"+s1.size());
		try
		{
			s1.print();
		}
		catch(Exception e) 
		{
			System.out.println("Printing Details :"+e.getMessage());
		}
		
	}
}
