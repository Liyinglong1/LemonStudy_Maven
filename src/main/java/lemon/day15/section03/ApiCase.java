package lemon.day15.section03;

public class ApiCase {
	private String CaseId;
	private String Url;
	private String RequestData;
	public String getCaseId() {
		return CaseId;
	}
	public void setCaseId(String caseId) {
		CaseId = caseId;
	}
	public String getUrl() {
		return Url;
	}
	public void setUrl(String url) {
		Url = url;
	}
	public String getRequestData() {
		return RequestData;
	}
	public void setRequestData(String requestData) {
		RequestData = requestData;
	}
	@Override
	public String toString() {
		return "ApiCase [CaseId=" + CaseId + ", Url=" + Url + ", RequestData=" + RequestData + "]";
	}
	
	
}
