package br.senai.sp.jandira.ui;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Tela {
	
	public void criarTela() {
			
			JFrame telaImc = new JFrame();
			telaImc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			telaImc.setTitle("Calculadora IMC");
			telaImc.setSize(300, 600);
			telaImc.setLayout(null);
			
			JLabel lblTitulo = new JLabel();
			lblTitulo.setText("Cáculo de IMC");
			lblTitulo.setBounds(100, 30, 300, 30);
			
			JLabel lblPeso = new JLabel();
			lblPeso.setText("Seu peso");
			lblPeso.setBounds(20, 0, 0, 0);
			
			
			telaImc.setVisible(true);
	}
}
