package Reqres.Practice10;

import java.util.List;

public class ResponseBody {
	private Integer page;
	private Integer per_page;
	private Integer total;
	private Integer total_pages;
	private List<Data> data = null;
	private Support support;

	public Integer getPage() {
	return page;
	}

	public void setPage(Integer page) {
	this.page = page;
	}

	
	public Integer getTotal() {
	return total;
	}

	public void setTotal(Integer total) {
	this.total = total;
	}

	
	public Integer getPer_page() {
		return per_page;
	}

	public void setPer_page(Integer per_page) {
		this.per_page = per_page;
	}

	public Integer getTotal_pages() {
		return total_pages;
	}

	public void setTotal_pages(Integer total_pages) {
		this.total_pages = total_pages;
	}

	public List<Data> getData() {
	return data;
	}

	public void setData(List<Data> data) {
	this.data = data;
	}

	public Support getSupport() {
	return support;
	}

	public void setSupport(Support support) {
	this.support = support;
	}

   
	
}

// to convert valid json schema 
//https://www.liquid-technologies.com/online-json-to-schema-converter