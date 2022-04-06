package br.com.bv.vo;

public class ServicesVO {

	private String consultaServiceURL;
	private String envioNFeServiceURL;
	private String participanteServiceURL;
	private String itemServiceURL;
	private String unidadeServiceURL;
	private String natOpServiceURL;
	private String paramIcmsServiceURL;
	private String infoComplDocServiceURL;
	private String servicoServiceURL;

	public ServicesVO() {
	}

	public String getConsultaServiceURL() {
		return consultaServiceURL;
	}

	public void setConsultaServiceURL(String consultaServiceURL) {
		this.consultaServiceURL = consultaServiceURL;
	}

	public String getEnvioNFeServiceURL() {
		return envioNFeServiceURL;
	}

	public void setEnvioNFeServiceURL(String envioNFeServiceURL) {
		this.envioNFeServiceURL = envioNFeServiceURL;
	}

	public String getParticipanteServiceURL() {
		return participanteServiceURL;
	}

	public void setParticipanteServiceURL(String participanteServiceURL) {
		this.participanteServiceURL = participanteServiceURL;
	}

	public String getItemServiceURL() {
		return itemServiceURL;
	}

	public void setItemServiceURL(String itemServiceURL) {
		this.itemServiceURL = itemServiceURL;
	}

	public String getUnidadeServiceURL() {
		return unidadeServiceURL;
	}

	public void setUnidadeServiceURL(String unidadeServiceURL) {
		this.unidadeServiceURL = unidadeServiceURL;
	}

	public String getNatOpServiceURL() {
		return natOpServiceURL;
	}

	public void setNatOpServiceURL(String natOpServiceURL) {
		this.natOpServiceURL = natOpServiceURL;
	}

	public String getParamIcmsServiceURL() {
		return paramIcmsServiceURL;
	}

	public void setParamIcmsServiceURL(String paramIcmsServiceURL) {
		this.paramIcmsServiceURL = paramIcmsServiceURL;
	}

	public String getInfoComplDocServiceURL() {
		return infoComplDocServiceURL;
	}

	public void setInfoComplDocServiceURL(String infoComplDocServiceURL) {
		this.infoComplDocServiceURL = infoComplDocServiceURL;
	}

	public String getServicoServiceURL() {
		return servicoServiceURL;
	}

	public void setServicoServiceURL(String servicoServiceURL) {
		this.servicoServiceURL = servicoServiceURL;
	}

	@Override
	public String toString() {
		return "ServicesVO [consultaServiceURL=" + consultaServiceURL + ", envioNFeServiceURL=" + envioNFeServiceURL
				+ ", participanteServiceURL=" + participanteServiceURL + ", itemServiceURL=" + itemServiceURL
				+ ", unidadeServiceURL=" + unidadeServiceURL + ", natOpServiceURL=" + natOpServiceURL + ", paramIcmsServiceURL="
				+ paramIcmsServiceURL + ", infoComplDocServiceURL=" + infoComplDocServiceURL + ", servicoServiceURL="
				+ servicoServiceURL + "]";
	}

}
