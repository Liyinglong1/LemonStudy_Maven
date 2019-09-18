package lemon.day06.homework02;


/*实操并掌握如下String类的API
判断是否以指定字符串开头或结尾 startsWith endWith 
字符串截取 substring 
字符串拆分 split 
字符串查找 indexOf lastIndexOf contains 
字符串比较 equals equalsIgnoreCase 
字符串拼接 concat 
判空 isEmpty
去掉左右空格 trim 
字符串长度 length 
转大小写 toUpperCase toLowerCase 
替换 replace replaceFirst replaceAll 
字符串描述 valueOf */
public class PlayString {
	public static void main(String[] args) {
		String str  = "Hello Lemon Study";
		String str1  = " Hello Lemon Study";
		String str2  = "Lemon Hello Lemon Study";
		//判断是否以指定字符串开头或结尾 startsWith endWith 
		System.out.println(str.startsWith("H"));
		System.out.println(str.endsWith("s"));
		
		//字符串截取 substring 
		System.out.println(str.substring(6));
		System.out.println(str.substring(1, 2));
		
		//字符串拆分 split 
		System.out.println("------------------");
		System.out.println(str.split("e",2)[0]);   //n-1次
		
		System.out.println(str.split("e",3)[1]);
		System.out.println(str.split("e",3)[2]);
		//字符串查找 indexOf lastIndexOf contains 
		System.out.println(str.indexOf("Le"));
		System.out.println(str.lastIndexOf("e"));
		System.out.println(str.contains("Lemon"));  //是否包含
		
		//字符串比较 equals equalsIgnoreCase 
		System.out.println(str.equals("Hello Lemon Study"));
		System.out.println(str.equalsIgnoreCase("hello Lemon Study")); //忽略大小写比较
		
		//字符串拼接 concat 
		System.out.println(str.concat("good"));
		
		//判空 isEmpty
		System.out.println(str.isEmpty());
		
		//去掉左右空格 trim 
		System.out.println(str1.trim());
		
		//字符串长度 length 
		System.out.println(str.length());
		
		//转大小写 toUpperCase toLowerCase 
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		//替换 replace replaceFirst replaceAll 
		System.out.println(str2.replace("Lemon","Google"));
		System.out.println(str2.replaceFirst("Lemon","Google"));
		System.out.println(str2.replaceAll("Lemon","Google"));
		
		//字符串描述 valueOf
		System.out.println(str.valueOf(str));
	}

}
