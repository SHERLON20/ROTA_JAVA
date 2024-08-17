/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */




import javax.swing.JOptionPane;


/**- Faça a leitura da quantidade de rotas do dia.
- Faça a leitura da km de cada ônibus.
- Calcule a quantidade necessária de combustível para atender toda a demanda.
- Faça leitura do valor do litro do óleo diesel.
- No final mostre o resultado de total de km, quantos litros de combustível é necessário para atender às rotas e o valor que a empresa desembolsará

 *
 * 
 */
public class rota {



    public static void main(String[] args) {
        int quantidade;
        quantidade=Integer.parseInt(JOptionPane.showInputDialog(null, "quantas rotas terão hj?"));
        int soma=0;
        int[]rota=new int[quantidade];
for(int i=0;i<quantidade;i++){
    rota[i]=Integer.parseInt(JOptionPane.showInputDialog("digite a quilometragem da "+(i+1)+ " rota de hj:"));
        
        }
for(int i=0;i<quantidade;i++){
soma+=rota[i];
}
double d = soma*2.5;
double oleo=Double.parseDouble(JOptionPane.showInputDialog(null, "qual o valor do litro de oléo?"));
JOptionPane.showMessageDialog(null,"terá um total de: "+soma+"km \n e será necessario:"+d+"litros de oléo \n que terá um custo de $:"+d*oleo+" Reais."
);
}

    }
  



