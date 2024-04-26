

package br.unigran.git_atividade;
import java.util.List;
import java.util.Date;
import java.util.LinkedList;

public class Produto {
    private String nome;
    private Date dataValidade;

    private List<Produto> listaProdutos = new LinkedList(); 
    
    public void addlista( Produto p){
        listaProdutos.add( p);  
    }
    public List listar(){
        return listaProdutos;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return nome+"-"+dataValidade;
                }
}
