package pacote1;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;

public aspect LoggingAspect {
//	 // Intercepta qualquer execução do método performTask()
//    pointcut taskExecution(): execution(* SampleService.performTask(..));
//
//    // Advice que é executado antes de performTask
//    before(): taskExecution() {
//        System.out.println("[Before] Task is about to be executed.");
//    }
////
////    // Advice que é executado após performTask, independente de sucesso ou falha
//    after(): taskExecution() {
//        System.out.println("[After] Task has been executed.");
//    }
////
////    // Intercepta a execução de qualquer método que retorne uma String
//    pointcut stringReturningMethods(): execution(String SampleService.getMessage());
////
////    // Advice que é executado após o retorno bem-sucedido de um método
//    after() returning(String result): stringReturningMethods() {
//        System.out.println("[After Returning] Method returned: " + result);
//    }
////
////    // Advice que é executado após uma exceção ser lançada
//    after() throwing(Exception ex): execution(* SampleService.riskyOperation(..)) {
//        System.out.println("[After Throwing] Exception caught: " + ex.getMessage());
//    }
////
    
}
