
package SEBAS_Paquete1;

public class TOTAL{
    
    int pcc, scc, tcc;
    
    public TOTAL(int pcc, int scc, int tcc)
    {
        this.pcc=pcc;
        this.scc=scc;
        this.tcc=tcc;
    }
    
    public int calcula_total()
    {
        return (5000*pcc)+(3500*scc)+(2000*tcc);
    }
}
//