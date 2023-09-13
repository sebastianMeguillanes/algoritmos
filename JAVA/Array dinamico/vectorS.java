import java.util.Vector;

public class vectorS{
    public static void main(String[] args)
    {
        int[] vectorEstatico = new int[10];

        //definir una estructura dinamica
        Vector<Integer> VectorDinamico = new Vector<Integer>();

        for(int i=0; i<10; i++){
            vectorEstatico[i]=i;
            VectorDinamico.add(i);
        }
        for(int i:vectorEstatico)
            System.out.println(i);
        for(int i:VectorDinamico)
            System.out.println(i);   
    }
}