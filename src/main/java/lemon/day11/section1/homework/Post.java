package lemon.day11.section1.homework;

import java.io.IOException;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class Post {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		
		//准备一个post请求
		HttpPost httpPost = new HttpPost("http://mgt.myhwdztest.com/api/purchase/member_purchase/insert_member_purchase");
		
		
		//参数设置
		HttpEntity httpEntity = new StringEntity("userName=liyinglong&password=111111&_spam=1566975010615",
				ContentType.APPLICATION_FORM_URLENCODED);
		httpPost.setEntity(httpEntity);
		
		
		httpPost.setHeader("Host", "mgt.myhwdztest.com");
		httpPost.setHeader("Connection", "keep-alive");
		//httpPost.setHeader("Content-Length", "55");
		httpPost.setHeader("Cache-Control", "no-cache");
		httpPost.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/76.0.3809.100 Safari/537.36");
		httpPost.setHeader("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
		httpPost.setHeader("Accept", "*/*");
		httpPost.setHeader("Origin", "http://mgt.myhwdztest.com");
		httpPost.setHeader("Referer", "http://mgt.myhwdztest.com");
		httpPost.setHeader("Accept-Encoding", "gzip, deflate");
		httpPost.setHeader("Accept-Language", "zh-CN,zh;q=0.9");
		httpPost.setHeader("Cookie", "_relogin_id_token=73|5E0142EA-5774-4CB7-9C67-84DFD56E8C19|liyinglong; member_credit_list=2; JSESSIONID=832C21D8B06B256C9127EAA786E24E44; isMarket=");
		//创建一个发包客户端
		CloseableHttpClient httpClient = HttpClients.createDefault();
		
		//发包，等到http响应
		CloseableHttpResponse response = httpClient.execute(httpPost);
		
		//获取响应行
		StatusLine statusLine = response.getStatusLine();
		System.out.print(statusLine.getProtocolVersion()+" ");
		System.out.print(statusLine.getStatusCode()+" ");
		System.out.println(statusLine.getReasonPhrase());
		
		System.out.println("---------------");
		//获取响应头
		Header[] head = response.getAllHeaders();
		for (Header header : head) {
			System.out.println(header.getName()+":"+header.getValue());
		}
		System.out.println("---------------");
		//获取响应体
		HttpEntity httpEntitys = response.getEntity();
		String entityStr = EntityUtils.toString(httpEntity);
		System.out.println(entityStr);
		}

}
