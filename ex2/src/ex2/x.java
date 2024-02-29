package ex2;

public class x {
	
	public static void main(String[] args) throws Exception {
		
		Principal usuarioDAO = new Principal();
		
		System.out.println("\n\n==== Inserir usuário === ");
		Usuario usuario = new Usuario(11, "pablo", 25);
		if(usuarioDAO.insert(usuario) == true) {
			System.out.println("Inserção com sucesso -> " + usuario.toString());
		}
			
	
		System.out.println("\n\n==== Excluir usuário (código " + usuario.getCodigo() + ") === ");
		usuarioDAO.delete(usuario.getCodigo());
		
		
	}
}