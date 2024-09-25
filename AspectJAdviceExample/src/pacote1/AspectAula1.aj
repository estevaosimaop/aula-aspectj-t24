package pacote1;

public aspect AspectAula1 {
	
	pointcut taskExecution(): execution(* SampleService.performTask(..));

    // Advice que é executado antes de performTask
    before(): taskExecution() {
        System.out.println("[Before] Nossa Tarefa de Performa sera executada...");
    }
    // Advice que é executado após performTask, independente de sucesso ou falha
    after(): taskExecution() {
	      System.out.println("[After] Task has been executed.");
	  }
    
	// Intercepta a execução de qualquer método que retorne uma String
	pointcut stringReturn(): execution(String SampleService.getMessage());
	////  // Advice que é executado após o retorno bem-sucedido de um método
	after() returning(String result): stringReturn() {
	      System.out.println("[After Returning] Method returned: " + result);
  }
	   // Advice que é executado após uma exceção ser lançada
	
	after() throwing(Exception ex): execution(* SampleService.riskyOperation(..)) {
      System.out.println("[After Throwing] Exception caught: " + ex.getMessage());
  }
}



