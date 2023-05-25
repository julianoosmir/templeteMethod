import java.math.BigDecimal;

public class DescontoPorValor extends Desconto {

    public DescontoPorValor(Desconto desconto) {
        super(desconto);

    }

    @Override
    protected BigDecimal efetuarDesconto(Orcamento orcamento) {
        return orcamento.getValor().multiply(BigDecimal.valueOf(0.50));
    }

    @Override
    protected boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getValor().intValue() > 500;
    }

}
