package lemon.day08;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class XmlTest {
	public static void main(String[] args) throws Exception {
		ArrayList<User> userlist = readXml("/config/user2.xml");
		for (User user : userlist) {
			System.out.println(user);
		}
	}
	public static ArrayList<User> readXml(String xml) throws Exception {
		//创建一个容器，保存所有用户
		ArrayList<User> userlist = new ArrayList<User>();
		//创建解析器：SaxReader对象
		SAXReader read = new SAXReader();
		//读取xml文件-->成为一个文档对象
		Document document = read.read(XmlTest.class.getResourceAsStream(xml));
		//读取<user>根元素
		Element rootElement = document.getRootElement();
		//打印根元素名字
		System.out.println(rootElement.getName());
		//读取根元素的所有子节点
		List<Element> subElements = rootElement.elements();
		
		//遍历所有的子节点
		for (Element subElement : subElements) {
			User user = new User();
			//获取子节点的信息
			//提取出标签上的属性--》属性对象
			Attribute id = subElement.attribute("id");
			System.out.println(id.getValue());
			
			List<Element> userInfoElements = subElement.elements();
			for (Element userInfoElement : userInfoElements) {
				//获取子元素标签
				String tagName = userInfoElement.getName();
				// System.out.print(tagName +"-->");
				//获取子元素值
				String value =userInfoElement.getStringValue();
				//System.out.println(value);
				
				//循环判断
//				if("name".equals(tagName)) {
//					user.setName(value);
//				}else if("age".equals(tagName)){
//					user.setSex(value);
//				}else {
//					user.setGender(value);
//				}
				
				//反射判断
				//获取字节码对象
				Class<User> clazz = User.class;
				//获取setXxx的方法名
				String setMethod ="set" +((tagName.charAt(0)+"").toUpperCase()+tagName.substring(1));
				System.out.println(setMethod);
				//通过字节码对象获得方法对象
				Method method = clazz.getMethod(setMethod, String.class);
				//反射调用set方法
				method.invoke(user, value);
			}
			userlist.add(user);
		}
		return userlist;
	}
	
}
