
public class StringDemo {
/*
 * String buffer is synchronized and thread safe
 * String builder is not  synchronized and  not thread safe
 * String value cannot be modified whereas others give a chance to modify
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
              String s = "Hello World";
              StringBuffer buffer = new StringBuffer(s);
              buffer.append("bye");
              s = buffer.toString();
              System.out.println(s);
	}

}
