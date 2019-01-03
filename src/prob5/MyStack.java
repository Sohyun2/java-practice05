package prob5;

public class MyStack {
	private int top;
	private String[] buffer;

	@SuppressWarnings("unchecked")
	public MyStack(int capacity) {
		buffer = new String[capacity];
		top = -1;
	}

	public void push(String s) {
		
		// isFull?
		if(top+1 == buffer.length) {
			//System.out.println("Stack is full!");
			
			String[] tmpBuffer = new String[buffer.length+1];
			
			for(int i=0; i<tmpBuffer.length-1; i++) {
				tmpBuffer[i]  = buffer[i];
			}
			buffer = tmpBuffer;
		}
		
		top++;
		buffer[top] = new String(s);
		//System.out.println(buffer[top]);
	}

	public String pop() throws MyStackException {
		if(isEmpty()) throw new MyStackException();
		
		String returnStr = buffer[top];
		buffer[top] = null;
		top--;
		
		return returnStr;
	}

	public boolean isEmpty() {
		return top == -1;
	}
}