package br.senai.sp.jandira.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tela {
	
	public void criarTela() {
			
			JFrame telaImc = new JFrame();
			telaImc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			telaImc.setTitle("Calculadora IMC");
			telaImc.setSize(300, 600);
			telaImc.setLayout(null);
			
			JLabel lblTitulo = new JLabel();
			lblTitulo.setText("Cálculo de IMC");
			lblTitulo.setFont(new Font("Arial", Font.BOLD, 20));
			lblTitulo.setBounds(80, 10, 300, 30);
			lblTitulo.setForeground(Color.BLUE);
			
			JLabel lblPeso = new JLabel();
			lblPeso.setText("Seu peso:");
			lblPeso.setBounds(20, 60, 100, 30);
			
			JTextField txtPeso = new JTextField();
			txtPeso.setBounds(90, 60, 80, 30);
			
			JLabel lblAltura = new JLabel();
			lblAltura.setText("Sua altura:");
			lblAltura.setBounds(20, 100, 100, 30);
			
			JTextField txtAltura = new JTextField();
			txtAltura.setBounds(90, 100, 80, 30);
			
			JButton btnCalcular = new JButton("CALCULAR");
			btnCalcular.setBackground(Color.LIGHT_GRAY);
			btnCalcular.setBounds(30, 150, 180, 30);
			
			JLabel lblResultado = new JLabel("Resultados:");
			lblResultado.setFont(new Font("Arial", Font.BOLD, 15));
			lblResultado.setBounds(20, 200, 100, 30);
			
			JLabel lblValorImc = new JLabel("Valor IMC:");
			lblValorImc.setBounds(20, 240, 100, 30);
			
			JLabel lblEstadoImc = new JLabel("Estado IMC:");
			lblEstadoImc.setBounds(20, 280, 100, 30);
			
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
					
					String peso = txtPeso.getText();
					double valorPeso = Integer.parseInt(peso);
					
					
					String altura = txtAltura.getText();
					double valorAltura = Integer.parseInt(altura);
					
					double resultadoImc = valorPeso / (valorAltura * valorAltura);
					
					lblValorImc.setText(String.valueOf(resultadoImc));
				}
			});
			
			
			
			
	}
}
