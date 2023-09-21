
public class Fila {
	
	private static Fila instancia;
    
    // Construtor privado para impedir a criação de instâncias fora da classe.
    private Fila() {
        // Inicialize a fila de impressão aqui, se necessário.
    }
    
    // Método público para obter a única instância da fila de impressão.
    public static synchronized Fila getInstance() {
        if (instancia == null) {
            instancia = new Fila();
        }
        return instancia;
    }
    
    public void ImprimeDocumento() {
        // Implemente a lógica para imprimir um documento.
    }
    
    public void RemoveDocumento() {
        // Implemente a lógica para remover um documento da fila.
    }
    
    public void RemoveTodosDocumentos() {
        // Implemente a lógica para remover todos os documentos da fila.
    }
    	
}
