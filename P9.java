//wajp to implement chatbot
import java.io.*;
import java.util.*;
class P9{
public static void main(String[] args)
{
Console c=System.console();
HashMap<String,String> conv=new HashMap<>();
conv.put("hi","hello");
conv.put("hello","hi");
conv.put("i love you","welcome to the club");
conv.put("your contact","my github id is ashutosh1808");
conv.put("what do you know","everything");
conv.put("what are you learning","mern stack");
conv.put("thank you","happy to help");
conv.put("bye","see you soon");

while(true){
	String res=c.readLine("enter your queries or press q to exit: ");
	if(res.equals("q"))
		break;
	else if(conv.get(res)!=null)
		System.out.println(conv.get(res));
	else
		System.out.println("i am still learning");
}

}
}