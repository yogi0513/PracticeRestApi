package PracticeFolder5;

import java.util.List;

public class Courses {

	private List<WebAutomation> webAutomation;
	private List<Api> api;
	private List<Mobile> mobile;

	public List<Api> getApi() {
		return api;
	}

	public void setApi(List<Api> api) {
		this.api = api;
	}

	public List<Mobile> getMobile() {
		return mobile;
	}

	public void setMobile(List<Mobile> mobile) {
		this.mobile = mobile;
	}

	public void setWebAutomation(List<WebAutomation> pc) {
		this.webAutomation = pc;
	}

	public List<WebAutomation> getWebAutomation() {
		return webAutomation;
	}

}
