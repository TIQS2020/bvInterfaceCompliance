package br.com.nfe.xml.envio.vo;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

public class F55IJC81 {

	private List<F55IJC81Item> item;

	public F55IJC81() {
		super();
		// TODO Auto-generated constructor stub
	}

	@XmlElement(name = "ITEM")
	public List<F55IJC81Item> getItem() {
		return item;
	}

	public void setItem(List<F55IJC81Item> item) {
		this.item = item;
	}

}
