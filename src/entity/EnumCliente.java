package entity;

public enum EnumCliente {
    ESPECIAL ("Especial"),
    COMUM ("Comum"),
    UNIVERSITARIO ("Universitário");
    
    private String descricao;
    
    private EnumCliente(String descricao){
        this.descricao = descricao;
    }
    
    @Override
    public String toString(){
        return descricao;
    }
}
