package org.itjl.fl;

import java.util.List;

public class QPage {
	
	private int Cpage;
	
	private int PageRange;
	
	private int flpage;
	
	private long Total;
		
	private List list;
	
	
	public int getFlpage() {
		return flpage;
	}

	public void setFlpage(int flpage) {
		this.flpage = flpage;
	}

	public int getCpage() {
		return Cpage;
	}

	public void setCpage(int cpage) {
		Cpage = cpage;
	}

	public int getPageRange() {
		return PageRange;
	}

	public void setPageRange(int pageRange) {
		PageRange = pageRange;
	}

	public long getTotal() {
		return Total;
	}

	public void setTotal(long total) {
		Total = total;
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}
	
	
}
