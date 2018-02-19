package br.com.fiap.jpa.entity;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="TB_CLIENTE")
@SequenceGenerator(name="cliente", sequenceName="SQ_TB_CLIENTE", allocationSize=1)
public class Cliente implements Serializable{

	@Id
	@Column(name="CD_CLIENTE") // Trocar o nome da Coluna do Banco de Dados 
	@GeneratedValue(generator="cliente", strategy=GenerationType.SEQUENCE) // Gera o Id automatico para a tabela
	private int id;
	
	@Column(name="NM_ClIENTE", nullable=false, length=150)
	private String nome;
	
	@Column(name="DT_NASCIMENTO", nullable=false)
	@Temporal(TemporalType.DATE)
	private Calendar dataNascimento;
	
	
	@Column(name="CD_FIDELIDADE")
	private Integer codigoCartaoFidelidade;
	
	@Enumerated(EnumType.STRING)
	@Column(name="DS_SEXO")
	private Sexo sexo;
	
	@Lob//Gravar no banco BLOB
	@Column(name="FL_FOTO")
	private byte[] foto;
	
	@Enumerated(EnumType.STRING)
	@Column(name="DS_STATUS")
	private Status staus;

	//Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getDataAniversario() {
		return dataNascimento;
	}

	public void setDataAniversario(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Integer getCodigoCartaoFidelidade() {
		return codigoCartaoFidelidade;
	}

	public void setCodigoCartaoFidelidade(Integer codigoCartaoFidelidade) {
		this.codigoCartaoFidelidade = codigoCartaoFidelidade;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public Status getStaus() {
		return staus;
	}

	public void setStaus(Status staus) {
		this.staus = staus;
	}
		
	//Contrutores
	public Cliente() {

	}

	public Cliente(String nome, Calendar dataNascimento, Integer codigoCartaoFidelidade, Sexo sexo, byte[] foto,
			Status staus) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.codigoCartaoFidelidade = codigoCartaoFidelidade;
		this.sexo = sexo;
		this.foto = foto;
		this.staus = staus;
	}

	
}
