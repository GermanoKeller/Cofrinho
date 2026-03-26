package classes;


public class Dolar extends Moeda {
    //criação do construtor Dolar recebendo o mesmo atributo da classe Moeda
    public Dolar(double valor) {
        super(valor);
    }

    //sobrescrita do método info retornando o tipo da moeda e o valor
    @Override
    public String info() {
        return "Dolar: " + getValor();
    }

    //sobrescrita do método converter onde é realizado o calculo do valor informado multiplicado pela cotação do Dolar em 02/12/2024.
    @Override
    public double converter() {
        return getValor() * 6.06;
    }

    //criação dos métodos equals e hashCode
    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
