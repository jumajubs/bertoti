package principal;

import java.util.ArrayList;
import java.util.List;

import modelos.Produto;
import modelos.Venda;
import negocios.ClienteNegocio;
import negocios.ProdutoNegocio;
import negocios.VendaNegocio;

public class GeradorRelatorio {
	private ClienteNegocio clienteNegocio  = new ClienteNegocio();
	private VendaNegocio vendaNegocio = new VendaNegocio();
	private ProdutoNegocio produtoNegocio = new ProdutoNegocio();
	
	public List<Venda> gerarRelatorioVendasPorCliente(int id) {
		
		
		vendaNegocio.consultarVendaPorCliente(clienteNegocio.consultarClientePorId(id));
		List<Venda> relatorioVendasGeradaPorcliente = new ArrayList<>();
		
		return relatorioVendasGeradaPorcliente;
	}
	
	public List<Produto> gerarRelatorioProdutosMaisVendidos(int id) {
		
		
		produtoNegocio.consultarProdutoPorVenda(vendaNegocio.consultarVendaPorCliente(clienteNegocio.consultarClientePorId(id)));
		List<Produto> relatorioVendasGeradaPorcliente = new ArrayList<>();
		
		return relatorioVendasGeradaPorcliente;
	}
}
