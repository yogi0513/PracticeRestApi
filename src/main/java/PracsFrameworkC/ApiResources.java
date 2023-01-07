package PracsFrameworkC;

public enum ApiResources {
	
	AddPlaceApI("/maps/api/add/json"),
	getPlaceApi("/maps/api/place/get/json");
	
	private String resources;
	
	ApiResources(String resources){
	this.resources=	resources;
	
	}
	public String getResource() {
		return resources;
	}
	
}
