package lemon.day13.section01;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

public class RequestTester {

	//OKHttpclient、RestAssured(restful)
	public static void main(String[] args) throws Exception {
		// 准备一个url
		String url = "http://test.lemonban.com/futureloan/mvc/api/member/register";
		// 参数用map组装起来
		Map<String, String> paramMap = new HashMap<String, String>();
		paramMap.put("mobilephone", "13888888888");
		paramMap.put("pwd", "123456");
		// 调用我写的方法
		String result = HttpUtils.post(url, paramMap);
		System.out.println(result);
	}
}
