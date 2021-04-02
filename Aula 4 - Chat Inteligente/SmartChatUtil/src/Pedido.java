import java.io.Serializable;

public class Pedido implements Serializable {

	private static final long serialVersionUID = -8018531141678337588L;

	private int numPedido;
	private String descricao;
	private String dtCompra;
	private String status;
	private Produto produto;
	
	public int getNumPedido() {
		return numPedido;
	}
	public void setNumPedido(int numPedido) {
		this.numPedido = numPedido;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getDtCompra() {
		return dtCompra;
	}
	public void setDtCompra(String dtCompra) {
		this.dtCompra = dtCompra;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	@Override
	public String toString() {
		return "Pedido [numPedido=" + numPedido + ", descricao=" + descricao + ", dtCompra=" + dtCompra + ", status="
				+ status + ", produto=" + produto + "]";
	}
}
