package lemon.day15.study01.section01;

public class ApiEntity {
	private String CaseId;
	private String url;
	private String RequestData;
	public String getCaseId() {
		return CaseId;
	}
	public void setCaseId(String caseId) {
		CaseId = caseId;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getRequestData() {
		return RequestData;
	}
	public void setRequestData(String requestData) {
		RequestData = requestData;
	}
	@Override
	public String toString() {
		return "ApiEntity [CaseId=" + CaseId + ", url=" + url + ", RequestData=" + RequestData + "]";
	}
	
	
}
