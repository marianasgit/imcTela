package br.senai.sp.jandira.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.senai.sp.jandira.model.CalculoImc;

public class Tela {
	
	public void criarTela() {
		
			//Fontes da tela
			Font fontTitulo = new Font("Georgia", Font.BOLD, 20);
			Font fontNormal = new Font("Arial", Font.PLAIN, 14);
			Font fontResultado = new Font("Arial", Font.BOLD,14);
			
			//Cores da tela
			Color azul = new Color(0, 0, 180);
			Color cinza = new Color(159, 159, 159);
			
		
			CalculoImc calculo = new CalculoImc();
			
			JFrame telaImc = new JFrame();
			telaImc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			telaImc.setTitle("Calculadora IMC");
			telaImc.setSize(300, 600);
			telaImc.setLayout(null);
			
			JLabel lblTitulo = new JLabel();
			lblTitulo.setText("Cálculo de IMC");
			lblTitulo.setFont(fontTitulo);
			lblTitulo.setBounds(60, 10, 300, 30);
			lblTitulo.setForeground(azul);
			
			JLabel lblPeso = new JLabel();
			lblPeso.setText("Seu peso:");
			lblPeso.setBounds(20, 60, 100, 30);
			lblPeso.setFont(fontNormal);
			
			JTextField txtPeso = new JTextField();
			txtPeso.setBounds(90, 60, 80, 30);
			
			JLabel lblAltura = new JLabel();
			lblAltura.setText("Sua altura:");
			lblAltura.setBounds(20, 100, 100, 30);
			lblAltura.setFont(fontNormal);
			
			JTextField txtAltura = new JTextField();
			txtAltura.setBounds(90, 100, 80, 30);
			
			JButton btnCalcular = new JButton("CALCULAR");
			btnCalcular.setBackground(cinza);
			btnCalcular.setBounds(30, 150, 180, 30);
			
			JLabel lblResultado = new JLabel("Resultados:");
			lblResultado.setFont(fontResultado);
			lblResultado.setBounds(20, 200, 100, 30);
			
			JLabel lblValorImc = new JLabel("Valor IMC:");
			lblValorImc.setBounds(20, 240, 130, 30);
			lblValorImc.setFont(fontNormal);
			
			
			JLabel lblEstadoImc = new JLabel("Estado IMC:");
			lblEstadoImc.setBounds(20, 280, 200, 30);
			lblEstadoImc.setFont(fontNormal);
			
			
			telaImc.getContentPane().add(lblTitulo);
			telaImc.getContentPane().add(lblPeso);
			telaImc.getContentPane().add(txtPeso);
			telaImc.getContentPane().add(lblAltura);
			telaImc.getContentPane().add(txtAltura);
			telaImc.getContentPane().add(btnCalcular);
			telaImc.getContentPane().add(lblResultado);
			telaImc.getContentPane().add(lblValorImc);
			telaImc.getContentPane().add(lblEstadoImc);
			
			telaImc.setVisible(true);
			
			btnCalcular.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println("clicado");
					
					calculo.setPeso(txtPeso.getText());
					
					calculo.setAltura(txtAltura.getText());
					
					lblValorImc.setText("Valor IMC:     " + calculo.mostrarImcComoString());
					
					lblEstadoImc.setText("Estado IMC:     " +calculo.ObterStatus());
					
					
				}
			});
			
			
			
			
	}
}
