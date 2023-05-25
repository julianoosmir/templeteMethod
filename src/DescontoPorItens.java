import java.math.BigDecimal;

public class DescontoPorItens extends Desconto {

    public DescontoPorItens(Desconto proximo) {
        super(proximo);
    }

    @Override
    protected BigDecimal efetuarDesconto(Orcamento orcamento) {
        return orcamento.getValor().multiply(BigDecimal.valueOf(0.10));
    }

    @Override
    protected boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getQuantidadeitens() > 5;
    }

}
