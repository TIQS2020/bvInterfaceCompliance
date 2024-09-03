package br.com.nfe.xml.envio.vo;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;



public class F55IJC83 {
	
	private List<F55IJC83Item> item;

	public F55IJC83() {
		super();
		// TODO Auto-generated constructor stub
	}

	@XmlElement(name = "ITEM")
	public List<F55IJC83Item> getItem() {
		return item;
	}

	public void setItem(List<F55IJC83Item> item) {
		this.item = item;
	}

	

}
