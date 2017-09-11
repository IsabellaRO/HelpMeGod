package br.pro.hashi.ensino.desagil.lucianogic.model;


import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;



// Esta classe representa a interface de uma calculadora de densidade, com
// os dois campos de entrada (peso e raio) e o campo de saida (resultado).
public class GateView<resultField> extends FixedPanel implements ActionListener, MouseListener {

	// Necessario para serializar objetos desta classe.
	private static final long serialVersionUID = 1L;


	private Image image;

	// A componente JTextField representa um campo para digitacao de texto.
	// https://docs.oracle.com/javase/tutorial/uiswing/components/textfield.html
	
	private JCheckBox resultField;
	

	private Gate gate;

	private JCheckBox in1;
	private JCheckBox in2;
	private JCheckBox in3;


	public GateView(Gate gate) {
		super(370, 220);

		this.gate = gate;

	//	image = loadImage(gate.toString());

		// A componente JLabel representa simplesmente um texto fixo.
		// https://docs.oracle.com/javase/tutorial/uiswing/components/label.html		
		if(gate.getIn() == 1) {
			in1.addMouseListener(this);
			add(in1,  10,  10, 50, 25);
		}
		
		else if(gate.getIn() == 2) {
			in1.addMouseListener(this);
			in2.addMouseListener(this);
			add(in1,  10,  10, 50, 25);
			add(in2,  10,  20, 50, 25);
			
		}
		
		else{
			in1.addMouseListener(this);
			in2.addMouseListener(this);
			in3.addMouseListener(this);
			add(in1,  10,  10, 50, 25);
			add(in2,  10,  20, 50, 25);
			add(in3,  10,  30, 50, 25);
			
		}
		// Esta linha garante que, sempre que o usuario digitar algo
		// em weightField, o metodo keyPressed abaixo sera chamado.
		// Voce usou a interface KeyListener no Projeto 1, lembra?
		

		// Esta linha garante que, sempre que o usuario digitar algo
		// em radiusField, o metodo keyPressed abaixo sera chamado.
		// Voce usou a interface KeyListener no Projeto 1, lembra?

		// Esta linha garante que resultField nao seja digitavel.
		resultField.setEnabled(false);

		add(in1,  10,  10, 50, 25);
		add(in2,  70,  45, 50, 25);
		add(in3, 130,  80, 50, 25);
		add(resultField, 310, 185, 50, 25);
		
		
	}


	// Necessario para carregar os arquivos de imagem.
//	private Image loadImage(String filename) {
	//	URL url = getClass().getResource("/img/" + filename + ".png");
//		ImageIcon icon = new ImageIcon(url);
	//	return icon.getImage();
	//}


	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(image, 310, 10, 50, 50, null);

		// Evita bugs visuais em alguns sistemas operacionais.
		getToolkit().sync();
    }


	@Override
	public void mouseClicked(MouseEvent arg0) {
		resultField.setSelected(gate.read());
		
	}


	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
