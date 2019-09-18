package lemon.day15.study01.section02;

/**
 * 接口詳細參數
 * @author LiYinglong
 *
 */
public class ApiInfoCase {
	private String caseId;
	private String apiId;
	private String requestData;
	private ApidetailCase apiInfo;
	public String getCaseId() {
		return caseId;
	}
	public void setCaseId(String caseId) {
		this.caseId = caseId;
	}
	public String getApiId() {
		return apiId;
	}
	public void setApiId(String apiId) {
		this.apiId = apiId;
	}
	public String getRequestData() {
		return requestData;
	}
	public void setRequestData(String requestData) {
		this.requestData = requestData;
	}
	
	
	public ApidetailCase getApiInfo() {
		return apiInfo;
	}
	public void setApiInfo(ApidetailCase apiInfo) {
		this.apiInfo = apiInfo;
	}
	@Override
	public String toString() {
		return "ApiInfoCase [caseId=" + caseId + ", apiId=" + apiId + ", requestData=" + requestData + ", apiInfo="
				+ apiInfo + "]";
	}
	
	
}
