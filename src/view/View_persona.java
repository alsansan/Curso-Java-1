package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class View_persona {

	private JFrame frame;
	private JTextField textFieldNombre;
	private JTextField textFieldApellido;
	private JTextField textFieldLegajo;
	private JTextField textFieldIosfa;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View_persona window = new View_persona();
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
	public View_persona() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 504, 349);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTitulo = new JLabel("Persona");
		lblTitulo.setBounds(171, 11, 88, 25);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		frame.getContentPane().add(lblTitulo);
		
		JRadioButton rdbtnAlumno = new JRadioButton("Alumno");
		rdbtnAlumno.setBounds(308, 43, 109, 23);
		rdbtnAlumno.setSelected(true);
		frame.getContentPane().add(rdbtnAlumno);
		
		JRadioButton rdbtnProfesor = new JRadioButton("Profesor");
		rdbtnProfesor.setBounds(308, 69, 109, 23);
		frame.getContentPane().add(rdbtnProfesor);
		
		JLabel lblPersona = new JLabel("Nombre");
		lblPersona.setBounds(25, 42, 73, 20);
		lblPersona.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		frame.getContentPane().add(lblPersona);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(25, 73, 88, 22);
		lblApellido.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		frame.getContentPane().add(lblApellido);
		
		JList listNombres = new JList();
		listNombres.setBounds(60, 221, 369, 78);
		frame.getContentPane().add(listNombres);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(137, 42, 122, 20);
		textFieldNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame.getContentPane().add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		textFieldApellido = new JTextField();
		textFieldApellido.setBounds(137, 74, 122, 20);
		textFieldApellido.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame.getContentPane().add(textFieldApellido);
		textFieldApellido.setColumns(10);
		
		JButton btnAgregar = new JButton("Agregar");
		buttonGroup.add(btnAgregar);
		btnAgregar.setBounds(24, 161, 89, 23);
		frame.getContentPane().add(btnAgregar);
		
		JButton btnModificar = new JButton("Modificar");
		buttonGroup.add(btnModificar);
		btnModificar.setBounds(137, 161, 89, 23);
		frame.getContentPane().add(btnModificar);
		
		JButton btnEliminar = new JButton("Eliminar");
		buttonGroup.add(btnEliminar);
		btnEliminar.setBounds(246, 161, 89, 23);
		frame.getContentPane().add(btnEliminar);
		
		JButton btnBuscar = new JButton("Buscar");
		buttonGroup.add(btnBuscar);
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBuscar.setBounds(366, 161, 89, 23);
		frame.getContentPane().add(btnBuscar);
		
		JButton btnLimpiarCampos = new JButton("Limpiar campos");
		buttonGroup.add(btnLimpiarCampos);
		btnLimpiarCampos.setBounds(184, 187, 105, 23);
		frame.getContentPane().add(btnLimpiarCampos);
		
		JLabel lblLegajo = new JLabel("Legajo");
		lblLegajo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblLegajo.setBounds(25, 109, 47, 17);
		frame.getContentPane().add(lblLegajo);
		
		textFieldLegajo = new JTextField();
		textFieldLegajo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldLegajo.setBounds(82, 107, 86, 20);
		frame.getContentPane().add(textFieldLegajo);
		textFieldLegajo.setColumns(10);
		
		textFieldIosfa = new JTextField();
		textFieldIosfa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldIosfa.setBounds(329, 107, 86, 20);
		frame.getContentPane().add(textFieldIosfa);
		textFieldIosfa.setColumns(10);
		
		JLabel lblIosfa = new JLabel("Iosfa");
		lblIosfa.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblIosfa.setBounds(273, 110, 46, 14);
		frame.getContentPane().add(lblIosfa);
	}
}
