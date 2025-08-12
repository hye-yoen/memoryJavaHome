package ch6.fianltest;

public class Account {
    private String ano;
    private String owner;
    private int balace;
    
    //입력 저장 함수 
    public Account(String ano,String owner , int balace){
        this.ano = ano;
        this.owner = owner;
        this.balace = balace;
    }

    public String getAno(){ 
        return ano;
    }
    public void setAno(String ano){
        this.ano = ano;
    }
    public String getOwner(){
        return owner;
    }
    public void setOwner(String owner){
        this.owner = owner;
    }
    public int getBalance(){
        return balace;
    }
    public void setBalance(int balace){
        this.balace = balace;
    }
}
