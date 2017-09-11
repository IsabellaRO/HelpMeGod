package br.pro.hashi.ensino.desagil.lucianogic;

import java.util.LinkedList;
import java.util.List;

import javax.swing.JFrame;

import br.pro.hashi.ensino.desagil.lucianogic.model.AndGate;
//import br.pro.hashi.ensino.desagil.lucianogic.model.AndGate;
import br.pro.hashi.ensino.desagil.lucianogic.model.Gate;
import br.pro.hashi.ensino.desagil.lucianogic.model.MainView;
import br.pro.hashi.ensino.desagil.lucianogic.model.MuxGate;
//import br.pro.hashi.ensino.desagil.lucianogic.model.MuxGate;
import br.pro.hashi.ensino.desagil.lucianogic.model.NandGate;
import br.pro.hashi.ensino.desagil.lucianogic.model.NotGate;
import br.pro.hashi.ensino.desagil.lucianogic.model.OrGate;
//import br.pro.hashi.ensino.desagil.lucianogic.model.OrGate;
//import br.pro.hashi.ensino.desagil.lucianogic.model.XorGate;
//import br.pro.hashi.ensino.desagil.lucianogic.view.MainView;
import br.pro.hashi.ensino.desagil.lucianogic.model.XorGate;

public class Main {
	public static void main(String[] args) {

		// Estrutura basica de um programa Swing. Nao precisa entender os detalhes por enquanto.
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {

            	// Cria o modelo.
            	List<Gate> model = new LinkedList<>();
            	model.add(new NandGate());
            	model.add(new NotGate());
            	model.add(new AndGate());
            	model.add(new OrGate());
            	model.add(new XorGate());
            	model.add(new MuxGate());

            	// Cria a tela principal.
            	MainView mainView = new MainView(model);

            	// Cria a janela.
            	JFrame frame = new JFrame("Lucianogic");

            	// Coloca a tela principal na janela.
         /*   	frame.setContentPane(mainView);*/

            	// Configura a janela para encerrar o programa quando for fechada.
            	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            	// Configura a janela para nao ser redimensionavel.
            	frame.setResizable(false);

            	// Redimensiona a janela de acordo com o tamanho do conteudo.
            	frame.pack();

            	// Mostra a janela.
            	frame.setVisible(true);
            }
        });
    }
}
