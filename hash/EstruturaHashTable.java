package hash;
public class EstruturaHashTable implements EstruturaDeDados{

    private Integer tabela[];

    public EstruturaHashTable() {
        tabela = new Integer[1000];
    }

    @Override
    public boolean insert(int chave) {
        int indice = DefineIndice(chave);

        if(tabela[indice] != null)
        {
            return false;
        }

        tabela[indice] = chave;
        return true;
    }

    public int DefineIndice(int chave){
        return chave % 1000 ;
    }

    @Override
    public boolean delete(int chave) {
        int indice = DefineIndice(chave);

        if(tabela[indice] != null){
            tabela[indice] = null;
            return true;
        }
        return false;
    }

    @Override
    public boolean search(int chave) {
        int indice = DefineIndice(chave);

        if(tabela[indice] != null)
        {
            if(tabela[indice] == chave)
            {
                return true;
            }
        }
        return false;
    }
}
