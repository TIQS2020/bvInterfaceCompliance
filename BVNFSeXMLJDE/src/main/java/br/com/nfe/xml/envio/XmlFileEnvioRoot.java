package br.com.nfe.xml.envio;



import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import br.com.nfe.xml.envio.vo.F55IJC02;
import br.com.nfe.xml.envio.vo.F55IJC80;
import br.com.nfe.xml.envio.vo.F55IJC81;
import br.com.nfe.xml.envio.vo.F55IJC82;
import br.com.nfe.xml.envio.vo.F55IJC83;
import br.com.nfe.xml.envio.vo.F55IJC84;


@XmlRootElement(name = "nfse")
@XmlType(propOrder = {"f55ijc80","f55IJC81","listF55IJC82","listF55IJC83","listF55IJC84","f55ijc02"})
public class XmlFileEnvioRoot {
	// usar o jaxb
	private F55IJC80 f55ijc80;
	private F55IJC81 f55IJC81;
	private List<F55IJC82> listF55IJC82;
	private List<F55IJC83> listF55IJC83;
	private List<F55IJC84> listF55IJC84;
	private F55IJC02 f55ijc02;
	
	

	public XmlFileEnvioRoot() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public XmlFileEnvioRoot(F55IJC80 f55ijc80, F55IJC81 f55ijc81, List<F55IJC82> listF55IJC82, List<F55IJC83> listF55IJC83,
			List<F55IJC84> listF55IJC84, F55IJC02 f55ijc02) {
		super();
		this.f55ijc80 = f55ijc80;
		f55IJC81 = f55ijc81;
		this.listF55IJC82 = listF55IJC82;
		this.listF55IJC83 = listF55IJC83;
		this.listF55IJC84 = listF55IJC84;
		this.f55ijc02 = f55ijc02;
	}
	

	@XmlElement
	public F55IJC80 getF55ijc80() {
		return f55ijc80;
	}	

	public void setF55ijc80(F55IJC80 f55ijc80) {
		this.f55ijc80 = f55ijc80;
	}

	@XmlElement(name = "F55IJC81")
	public F55IJC81 getF55IJC81() {
		return f55IJC81;
	}

	public void setF55IJC81(F55IJC81 f55IJC81) {
		this.f55IJC81 = f55IJC81;
	}

	@XmlElement(name = "F55IJC82")
	public List<F55IJC82> getListF55IJC82() {
		return listF55IJC82;
	}

	public void setListF55IJC82(List<F55IJC82> listF55IJC82) {
		this.listF55IJC82 = listF55IJC82;
	}

	@XmlElement(name = "F55IJC83")
	public List<F55IJC83> getListF55IJC83() {
		return listF55IJC83;
	}

	public void setListF55IJC83(List<F55IJC83> listF55IJC83) {
		this.listF55IJC83 = listF55IJC83;
	}

	@XmlElement(name = "F55IJC84")
	public List<F55IJC84> getListF55IJC84() {
		return listF55IJC84;
	}

	public void setListF55IJC84(List<F55IJC84> listF55IJC84) {
		this.listF55IJC84 = listF55IJC84;
	}	
	
	@XmlElement(name = "F55IJC02")
	public F55IJC02 getF55ijc02() {
		return f55ijc02;
	}

	public void setF55ijc02(F55IJC02 f55ijc02) {
		this.f55ijc02 = f55ijc02;
	}

	
	
	

}
