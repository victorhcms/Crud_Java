package Visao;

import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Dominio.Cliente;
import Servico.ClasseClienteServico;

public class ClasseClienteFrm extends JFrame{
    
    private JTable table;

public ClasseClienteFrm(){
    this.setTitle("Classe Cliente");
    this.setSize(new Dimension(800,600));
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
}

public void Exibir(){
    this.table = new JTable();
    this.table.setBounds(30,40,200,300);
    this.PrepararDados();
}

private void PrepararDados(){
    ClasseClienteServico servico = new ClasseClienteServico();
    ArrayList<Cliente> lista = servico.Browse();

    DefaultTableModel mod = new DefaultTableModel(new Object[][]{}, new String[]{"Código","Nome da Classe", "CPF","Endereço", "Telefone"}){
        boolean[] canEdit = new boolean[]{false, false};
        public boolean isCellEditable(int rowIndex, int columIndex){
            return canEdit[columIndex];
        }
    };
    for (Cliente classe : lista) {
        mod.addRow(new Object[]{
            classe.getId(),
            classe.getNome(), 
            classe.getCpf(),
            classe.getEndereco(),
            classe.getTelefone()});
    }

    this.table.setModel(mod);

    JScrollPane painel = new JScrollPane(this.table);
    this.add(painel);
    this.setVisible(true);
}
  

}
