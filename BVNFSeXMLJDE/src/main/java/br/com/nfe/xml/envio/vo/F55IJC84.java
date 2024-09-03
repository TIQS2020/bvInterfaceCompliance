package br.com.nfe.xml.envio.vo;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;


public class F55IJC84 {
	
	private List<F55IJC84Item> item;

	public F55IJC84() {
		super();
		// TODO Auto-generated constructor stub
	}

	@XmlElement(name = "ITEM")
	public List<F55IJC84Item> getItem() {
		return item;
	}

	public void setItem(List<F55IJC84Item> item) {
		this.item = item;
	}
	

}
