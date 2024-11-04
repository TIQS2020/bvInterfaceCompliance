package br.com.nfe.xml.envio;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.com.nfe.xml.envio.vo.F55IJC02;
import br.com.nfe.xml.envio.vo.F55IJC80;
import br.com.nfe.xml.envio.vo.F55IJC81;
import br.com.nfe.xml.envio.vo.F55IJC83;
import br.com.nfe.xml.envio.vo.F55IJC84;

@XmlRootElement(name = "nfse")

public class XmlFileEnvioRoot {

	private F55IJC80 f55ijc80;
	private F55IJC81 f55IJC81;
	private F55IJC83 f55IJC83;
	private F55IJC84 f55IJC84;
	private F55IJC02 f55IJC02;

	public XmlFileEnvioRoot() {
		super();
		// TODO Auto-generated constructor stub
	}

	public XmlFileEnvioRoot(F55IJC80 f55ijc80, F55IJC81 f55ijc81, F55IJC83 f55ijc83, F55IJC84 f55ijc84,
			F55IJC02 F55IJC02) {
		super();
		this.f55ijc80 = f55ijc80;
		this.f55IJC81 = f55ijc81;
		this.f55IJC83 = f55ijc83;
		this.f55IJC84 = f55ijc84;
		this.f55IJC02 = F55IJC02;
	}

	@XmlElement(name = "F55IJC80")
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

	@XmlElement(name = "F55IJC83")
	public F55IJC83 getF55IJC83() {
		return f55IJC83;
	}

	public void setF55IJC83(F55IJC83 f55IJC83) {
		this.f55IJC83 = f55IJC83;
	}

	@XmlElement(name = "F55IJC84")
	public F55IJC84 getF55IJC84() {
		return f55IJC84;
	}

	public void setF55IJC84(F55IJC84 f55IJC84) {
		this.f55IJC84 = f55IJC84;
	}

	@XmlElement(name = "F55IJC02")
	public F55IJC02 getF55IJC02() {
		return f55IJC02;
	}

	public void setF55IJC02(F55IJC02 f55IJC02) {
		this.f55IJC02 = f55IJC02;
	}

}
