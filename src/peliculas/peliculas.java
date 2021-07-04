package peliculas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.JButton;

public class peliculas extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField peli;
	JComboBox lista;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					peliculas frame = new peliculas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public peliculas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 605, 269);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		peli = new JTextField();
		peli.setBounds(22, 84, 258, 20);
		contentPane.add(peli);
		peli.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Escribe el t\u00EDtulo de la pel\u00EDcula");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(22, 58, 258, 20);
		contentPane.add(lblNewLabel);
		
		lista = new JComboBox();
		lista.setBackground(Color.WHITE);
		lista.setBounds(314, 83, 253, 22);
		contentPane.add(lista);
		
		JLabel lblNewLabel_1 = new JLabel("Lista de pel\u00EDculas");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(314, 58, 253, 17);
		contentPane.add(lblNewLabel_1);
		
		JButton guardar = new JButton("A\u00F1adir");
		guardar.setBounds(249, 158, 89, 23);
		contentPane.add(guardar);
		guardar.addActionListener(this);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		lista.addItem(peli.getText());
		
	}
}
