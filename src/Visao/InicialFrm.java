package Visao;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class InicialFrm extends JFrame{

    private JMenuBar menuBar;
    private JMenu arquivoMenu;
    private JMenu editarMenu;
    private JMenu ajudaMenu;

    public InicialFrm(){
        this.menuBar = new JMenuBar();
        setTitle("Pagina do fabiano");
        setMinimumSize(new Dimension(800, 600));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

        public void Exibir(){
            AdicionarMenuArquivo();
            AdicionarMenuEditar();

            setJMenuBar(menuBar);
            AdicionarMenuAjuda();
        }


    private void AdicionarMenuArquivo(){
        arquivoMenu = new JMenu("Arquivo");
        JMenuItem abrItem = new JMenuItem("Abrir");
        JMenuItem sairMenu = new JMenuItem("Sair");
        abrItem.addActionListener(
            //adcinar item entrar e sair do menu
            e -> JOptionPane.showMessageDialog(this, "Abrindo Arquivo..."));
            sairMenu.addActionListener(e -> System.exit(0));
            arquivoMenu.add(abrItem);
            arquivoMenu.add(sairMenu);
            //adiciona do menu os arquivos
            menuBar.add(arquivoMenu);
    }

    private void AdicionarMenuEditar(){
        editarMenu = new JMenu("Editar");
        JMenuItem copiarMenuItem = new JMenuItem("Copiar");
        JMenuItem colarMenuItem = new JMenuItem("Colar");
        copiarMenuItem.addActionListener(e -> JOptionPane.showMessageDialog(this, "Copiando"));
        colarMenuItem.addActionListener(e -> JOptionPane.showMessageDialog(this, "Colando"));

        editarMenu.add(copiarMenuItem);
        editarMenu.add(colarMenuItem);

        menuBar.add(editarMenu);
    }

    private void AdicionarMenuAjuda(){
        ajudaMenu = new JMenu("Ajuda");
        JMenuItem sobrMenuItem = new JMenuItem("Sobre");
        sobrMenuItem.addActionListener(e -> JOptionPane.showMessageDialog(this, "Aplicativo do fabiano em java"));
        ajudaMenu.add(sobrMenuItem);
        menuBar.add(ajudaMenu);
    }



}