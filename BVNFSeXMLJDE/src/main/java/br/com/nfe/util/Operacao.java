package br.com.nfe.util;

public class Operacao<T, U> {
	private T envio;
	private U cancelamento;

	public Operacao(T envio, U cancelamento) {
		this.envio = envio;
		this.cancelamento = cancelamento;
	}

	public T getEnvio() {
		return envio;
	}

	public void setEnvio(T envio) {
		this.envio = envio;
	}

	public U getCancelamento() {
		return cancelamento;
	}

	public void setCancelamento(U cancelamento) {
		this.cancelamento = cancelamento;
	}

	@Override
	public String toString() {
		return "Operacao [envio=" + envio + ", cancelamento=" + cancelamento + "]";
	}

}
