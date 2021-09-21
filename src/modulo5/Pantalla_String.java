package modulo5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pantalla_String {

	private JFrame frame;
	private JTextField txtTexto;
	private JLabel lblMayusculaResult;
	private JLabel lblMinusculaResult;
	private JLabel lblOpor2Result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantalla_String window = new Pantalla_String();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Pantalla_String() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 540, 332);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblManejoDeString = new JLabel("Manejo de String ");
		lblManejoDeString.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 24));
		lblManejoDeString.setBounds(163, 11, 237, 30);
		frame.getContentPane().add(lblManejoDeString);
		
		JLabel lblIngreseUnTexto = new JLabel("ingrese un texto");
		lblIngreseUnTexto.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblIngreseUnTexto.setBounds(28, 90, 134, 20);
		frame.getContentPane().add(lblIngreseUnTexto);
		
		txtTexto = new JTextField();
		txtTexto.setFont(new Font("Tahoma", Font.ITALIC, 16));
		txtTexto.setBounds(178, 92, 189, 26);
		frame.getContentPane().add(txtTexto);
		txtTexto.setColumns(10);
		
		JLabel lblMayusculas = new JLabel("Mayusculas");
		lblMayusculas.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMayusculas.setBounds(28, 155, 117, 25);
		frame.getContentPane().add(lblMayusculas);
		
		JLabel lblMinusculas = new JLabel("Minusculas");
		lblMinusculas.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMinusculas.setBounds(28, 191, 117, 25);
		frame.getContentPane().add(lblMinusculas);
		
		lblMayusculaResult = new JLabel("");
		lblMayusculaResult.setBackground(Color.CYAN);
		lblMayusculaResult.setRequestFocusEnabled(false);
		lblMayusculaResult.setOpaque(true);
		lblMayusculaResult.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMayusculaResult.setBounds(178, 155, 189, 25);
		frame.getContentPane().add(lblMayusculaResult);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//on the fly
				lblMayusculaResult.setText(txtTexto.getText().toUpperCase());
				lblMinusculaResult.setText(txtTexto.getText().toLowerCase());
				lblOpor2Result.setText(txtTexto.getText().toLowerCase().replace('o', '2'));
			}
		});
		btnCalcular.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCalcular.setBounds(384, 248, 105, 35);
		frame.getContentPane().add(btnCalcular);
		
		JLabel lblReempOx = new JLabel("reemp ox2");
		lblReempOx.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblReempOx.setBounds(28, 227, 95, 25);
		frame.getContentPane().add(lblReempOx);
		
		lblMinusculaResult = new JLabel("");
		lblMinusculaResult.setRequestFocusEnabled(false);
		lblMinusculaResult.setOpaque(true);
		lblMinusculaResult.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMinusculaResult.setBackground(Color.CYAN);
		lblMinusculaResult.setBounds(178, 188, 189, 25);
		frame.getContentPane().add(lblMinusculaResult);
		
		lblOpor2Result = new JLabel("");
		lblOpor2Result.setRequestFocusEnabled(false);
		lblOpor2Result.setOpaque(true);
		lblOpor2Result.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblOpor2Result.setBackground(Color.CYAN);
		lblOpor2Result.setBounds(178, 221, 189, 25);
		frame.getContentPane().add(lblOpor2Result);
	}
}
