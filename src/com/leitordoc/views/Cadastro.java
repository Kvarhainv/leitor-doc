package com.leitordoc.views;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JPasswordField;
import com.jgoodies.forms.layout.Sizes;

public class Cadastro extends JFrame implements ActionListener{
	
	public JPanel contentPane, painel_superior, painel_esquerdo, painel_inferior, painel_direito, painel_central;
	public JTextField campo_nome, campo_email;
	public JLabel icone, nome, senha, email;
	public JPasswordField campo_senha;
	public JButton bt_cancelar, bt_salvar;
	
	public Cadastro() {
		super("Leitor Doc - Cadastro");
		getContentPane().setBackground(new Color(128, 128, 128));
		setIconImage(Toolkit.getDefaultToolkit().getImage(Cadastro.class.getResource("/com/leitordoc/views/icons/leitor_doc.png")));
		this.setSize(1280, 960);
		
		painel_superior = new JPanel();
		FlowLayout flowLayout = (FlowLayout) painel_superior.getLayout();
		flowLayout.setVgap(50);
		painel_superior.setBackground(new Color(128, 128, 128));
		getContentPane().add(painel_superior, BorderLayout.NORTH);
		
		painel_esquerdo = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) painel_esquerdo.getLayout();
		flowLayout_2.setHgap(50);
		painel_esquerdo.setBackground(new Color(128, 128, 128));
		getContentPane().add(painel_esquerdo, BorderLayout.WEST);
		
		painel_inferior = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) painel_inferior.getLayout();
		flowLayout_1.setVgap(50);
		painel_inferior.setBackground(new Color(128, 128, 128));
		getContentPane().add(painel_inferior, BorderLayout.SOUTH);
		
		painel_direito = new JPanel();
		FlowLayout flowLayout_3 = (FlowLayout) painel_direito.getLayout();
		flowLayout_3.setHgap(50);
		painel_direito.setBackground(new Color(128, 128, 128));
		getContentPane().add(painel_direito, BorderLayout.EAST);
		
		painel_central = new JPanel();
		painel_central.setBackground(new Color(192, 192, 192));
		getContentPane().add(painel_central, BorderLayout.CENTER);
		painel_central.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				new ColumnSpec(ColumnSpec.FILL, Sizes.bounded(Sizes.PREFERRED, Sizes.constant("200dlu", true), Sizes.constant("200dlu", true)), 0),
				ColumnSpec.decode("max(125dlu;pref):grow"),
				ColumnSpec.decode("max(58dlu;pref)"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(58dlu;pref)"),
				ColumnSpec.decode("max(250dlu;default)"),},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("max(111dlu;default)"),
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		icone = new JLabel("");
		icone.setIcon(new ImageIcon(Cadastro.class.getResource("/com/leitordoc/views/icons/user.png")));
		painel_central.add(icone, "3, 3, 4, 1, center, default");
		
		nome = new JLabel("Nome / Email");
		nome.setFont(new Font("Tahoma", Font.BOLD, 15));
		painel_central.add(nome, "3, 6");
		
		campo_nome = new JTextField();
		painel_central.add(campo_nome, "3, 8, 4, 1");
		campo_nome.setColumns(40);
		
		email = new JLabel("Email");
		email.setFont(new Font("Tahoma", Font.BOLD, 15));
		painel_central.add(email, "3, 10");
		
		campo_email = new JTextField();
		painel_central.add(campo_email, "3, 12, 4, 1, fill, default");
		campo_email.setColumns(10);
		
		senha = new JLabel("Senha");
		senha.setFont(new Font("Tahoma", Font.BOLD, 15));
		painel_central.add(senha, "3, 14");
		
		campo_senha = new JPasswordField();
		campo_senha.setEchoChar('*');
		painel_central.add(campo_senha, "3, 15, 4, 1, fill, default");
		
		bt_cancelar = new JButton("Cancelar");
		bt_cancelar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		bt_cancelar.setBackground(new Color(192, 192, 192));
		bt_cancelar.addActionListener(this);
		
		painel_central.add(bt_cancelar, "4, 17");

		bt_salvar = new JButton("Salvar");
		bt_salvar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		bt_salvar.setBackground(new Color(192, 192, 192));
		bt_salvar.addActionListener(this);
		
		painel_central.add(bt_salvar, "6, 17");
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

	public JTextField getCampo_nome() {
		return campo_nome;
	}

	public void setCampo_nome(JTextField campo_nome) {
		this.campo_nome = campo_nome;
	}

	public JTextField getCampo_email() {
		return campo_email;
	}

	public void setCampo_email(JTextField campo_email) {
		this.campo_email = campo_email;
	}

	public JPasswordField getCampo_senha() {
		return campo_senha;
	}

	public void setCampo_senha(JPasswordField campo_senha) {
		this.campo_senha = campo_senha;
	}

	public JButton getCancelar() {
		return bt_cancelar;
	}

	public void setCancelar(JButton cancelar) {
		this.bt_cancelar = cancelar;
	}

	public JButton getSalvar() {
		return bt_salvar;
	}

	public void setSalvar(JButton salvar) {
		this.bt_salvar = salvar;
	}

	
}