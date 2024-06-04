package com.desktop2.clinicaodontologica;

import com.desktop2.clinicaodontologica.Controller.ContatoController;
import com.desktop2.clinicaodontologica.Controller.EnderecoController;
import com.desktop2.clinicaodontologica.Controller.FuncionarioController;
import com.desktop2.clinicaodontologica.Controller.PacienteController;
import com.desktop2.clinicaodontologica.Model.Funcionario.Cargo;
import com.desktop2.clinicaodontologica.Model.Funcionario.Funcionario;
import com.desktop2.clinicaodontologica.Model.Paciente.Contato.Contato;
import com.desktop2.clinicaodontologica.Model.Paciente.Contato.TipoContato;
import com.desktop2.clinicaodontologica.Model.Paciente.Endereco.Cidade;
import com.desktop2.clinicaodontologica.Model.Paciente.Endereco.Endereco;
import com.desktop2.clinicaodontologica.Model.Paciente.Endereco.Uf;
import com.desktop2.clinicaodontologica.Model.Paciente.Paciente;
import com.desktop2.clinicaodontologica.Repository.Funcionario.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Date;
import java.util.List;

@SpringBootApplication
public class ClinicaOdontologicaApplication implements CommandLineRunner {

	@Autowired
	private PacienteController pacienteController;
	@Autowired
	private EnderecoController enderecoController;
    @Autowired
    private ContatoController contatoController;
	@Autowired
	private FuncionarioController funcionarioController;


	public static void main(String[] args) {
		SpringApplication.run(ClinicaOdontologicaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		//LISTAR TODOS OS PACIENTES
		/*List<Paciente> pacientes = pacienteController.getAllPacientes();
		for (Paciente paciente : pacientes) {
			System.out.println("-------------- Paciente --------------");
			System.out.println("Nome: " + paciente.getNome());
			System.out.println("Data de Nascimento: " + paciente.getDatanascimento());
			System.out.println("CPF: " + paciente.getCpf());


			System.out.println("Tipo de Contato: " + paciente.getContato().getTipoContato().getTipo());
			System.out.println("Contato: " + paciente.getContato().getInformacao());

			System.out.println("Cidade: " + paciente.getEndereco().getCidade().getNome());
			System.out.println("Estado: " + paciente.getEndereco().getCidade().getUf().getSigla());
			System.out.println("Rua: " + paciente.getEndereco().getRua());
			System.out.println("Numero: " + paciente.getEndereco().getNumero());
			System.out.println();
		}
		 */



		 // ADICIONANDO NOVO PACIENTE
		/*Paciente novoPaciente = new Paciente();
		novoPaciente.setNome("Arthur");
		novoPaciente.setCpf("11111111111");
		novoPaciente.setDatanascimento(Date.valueOf("2004-05-23"));

		Endereco novoEndereco = new Endereco();
		novoEndereco.setRua("Rua 1");
		novoEndereco.setNumero("123");

		Cidade novoCidade = new Cidade();
		novoCidade.setNome("Ivinhema");

		enderecoController.addUfExistente(novoCidade, "MS"); //Exemplo com uma uf ja existente
		novoEndereco.setCidade(novoCidade);

		Contato novoContato = new Contato();
		novoContato.setInformacao("Arthur@.com");

		TipoContato novoTipoContato = new TipoContato();
		novoTipoContato.setTipo("email");

		novoContato.setTipoContato(novoTipoContato);
		novoPaciente.setEndereco(novoEndereco);
		novoPaciente.setContato(novoContato);

		contatoController.newTipoContato(novoTipoContato);
		contatoController.newContato(novoContato);
		enderecoController.newCidade(novoCidade);
		enderecoController.newEndereco(novoEndereco);
		pacienteController.newPaciente(novoPaciente);
		*/


		//CADASTRAR NOVO FUNCIONARIO
		/*Funcionario novoFuncionario = new Funcionario();
		novoFuncionario.setNome("Pedro Antonio");

		funcionarioController.addCargoExistente(novoFuncionario, "Recepcionista");

		novoFuncionario.setUsuario("Pedrinho");
		novoFuncionario.setSenha("123");

		funcionarioController.newFuncionario(novoFuncionario);
		*/

		//LISTAR TODOS OS FUNCIONARIOS
		List<Funcionario> funcionarios = funcionarioController.getAllFuncionario();
		for (Funcionario funcionario : funcionarios) {

			System.out.println(funcionario.getNome());
			System.out.println(funcionario.getSenha());
			System.out.println(funcionario.getCargo().getCargo());
		}


	}
}
