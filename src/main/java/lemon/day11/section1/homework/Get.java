package lemon.day11.section1.homework;

import java.io.IOException;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class Get {
	public static void main(String[] args) throws Exception, IOException {

		// 准备一个get请求
		HttpGet httpGet = new HttpGet(
				"http://mgt.myhwdztest.com/api/purchase/member_purchase/query_page_member_purchase?"
				+ "memberId=&purchaseStatus=&isOverdue=&quoteStatus=&purchaseSource=&pageNum=1&pageSize=15&_spam=1566954132577");
		// 准备一个发包客户端
		CloseableHttpClient httpclient = HttpClients.createDefault();
		// 发包 得到一个http 响应
		CloseableHttpResponse response = httpclient.execute(httpGet);
		
		
		//获取响应行
		StatusLine statusLine = response.getStatusLine();
		System.out.print(statusLine.getProtocolVersion()+" ");
		System.out.print(statusLine.getStatusCode()+" ");
		System.out.println(statusLine.getReasonPhrase()+" ");
		System.out.println("---------------");
		//获取响应头
		Header[] headerResponse = response.getAllHeaders();
		for (Header header : headerResponse) {
			System.out.println(header.getName()+":"+header.getValue());
		}
		System.out.println("---------------");
		//获取响应体
		HttpEntity httpEntity = response.getEntity();
		String entityStr = EntityUtils.toString(httpEntity);
		System.out.println(entityStr);
	}
}
