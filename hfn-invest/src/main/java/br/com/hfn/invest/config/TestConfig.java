package br.com.hfn.invest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


@Configuration
@Profile("test")
public class TestConfig {
	
	/*@Autowired
	private TicketNegociacaoRepository ticketRepo;
	@Autowired
	private CategoriaAtivoFinanceiroRepository categoriaRepo;
	@Autowired
	private EmpresaRepository empresaRepo;
	@Autowired
	private AtivoFinanceiroRepository ativoFinanceiroRepo;
	@Autowired
	private CotacaoAtivoFinanceiroRepository cotacaoAtivoFinanceiroRepo;*/
		
	
	@Bean
	public boolean instantiateDatabase(){
		
		/*TicketNegociacao t1 = new TicketNegociacao(null,"MDIA3");
		TicketNegociacao t2 = new TicketNegociacao(null,"BBDC3");
		TicketNegociacao t3 = new TicketNegociacao(null,"BBDC4");
		TicketNegociacao t4 = new TicketNegociacao(null,"HGLG11");
		ticketRepo.saveAll(Arrays.asList(t1,t2,t3,t4));
		
		CategoriaAtivoFinanceiro cat1 = new CategoriaAtivoFinanceiro(CategoriaAtivoFinanceiroEnum.TESOURO_BR.getId(), CategoriaAtivoFinanceiroEnum.TESOURO_BR.getNome(), CategoriaAtivoFinanceiroEnum.TESOURO_BR.getDescricao());
		CategoriaAtivoFinanceiro cat2 = new CategoriaAtivoFinanceiro(CategoriaAtivoFinanceiroEnum.FIIS.getId(), CategoriaAtivoFinanceiroEnum.FIIS.getNome(), CategoriaAtivoFinanceiroEnum.FIIS.getDescricao());
		CategoriaAtivoFinanceiro cat3 = new CategoriaAtivoFinanceiro(CategoriaAtivoFinanceiroEnum.ON.getId(), CategoriaAtivoFinanceiroEnum.ON.getNome(), CategoriaAtivoFinanceiroEnum.ON.getDescricao());
		CategoriaAtivoFinanceiro cat4 = new CategoriaAtivoFinanceiro(CategoriaAtivoFinanceiroEnum.PN.getId(), CategoriaAtivoFinanceiroEnum.PN.getNome(), CategoriaAtivoFinanceiroEnum.PN.getDescricao());
		CategoriaAtivoFinanceiro cat5 = new CategoriaAtivoFinanceiro(CategoriaAtivoFinanceiroEnum.UNIT.getId(), CategoriaAtivoFinanceiroEnum.UNIT.getNome(), CategoriaAtivoFinanceiroEnum.UNIT.getDescricao());
		categoriaRepo.saveAll(Arrays.asList(cat1,cat2,cat3,cat4,cat5));
		
		Empresa emp1 = new Empresa(null,"M. Dias Branco", "07206816000115");
		Empresa emp2 = new Empresa(null,"Banco Bradesco S.A.", "60746948000112");
		Empresa emp3 = new Empresa(null,"CSHG Logística", "11728688000147");
		empresaRepo.saveAll(Arrays.asList(emp1, emp2, emp3));
		
		AtivoFinanciero at1 = new AtivoFinanciero(emp1, t1, new Date(System.currentTimeMillis()),cat3);
		AtivoFinanciero at2 = new AtivoFinanciero(emp2, t2, new Date(System.currentTimeMillis()),cat3);
		AtivoFinanciero at3 = new AtivoFinanciero(emp2, t3, new Date(System.currentTimeMillis()),cat4);
		AtivoFinanciero at4 = new AtivoFinanciero(emp3, t4, new Date(System.currentTimeMillis()),cat2);
		ativoFinanceiroRepo.saveAll(Arrays.asList(at1,at2,at3,at4));
		
		CotacaoAtivoFinanceiro cotac1 = new CotacaoAtivoFinanceiro(emp1,t1,new Date(System.currentTimeMillis()),33.2000,33.2000,32.6300,32.6900,1193000L);
		CotacaoAtivoFinanceiro cotac2 = new CotacaoAtivoFinanceiro(emp1,t1,new Date(System.currentTimeMillis()+1),33.2000,33.2000,32.6300,32.6900,1193000L);
		cotacaoAtivoFinanceiroRepo.saveAll(Arrays.asList(cotac1,cotac2));*/
		
		return true;
	}
	
}
