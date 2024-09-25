package pacote1;
public class SampleService {

    public void performTask() {
        System.out.println("Executing task...");
    }

    public String getMessage() {
        return "Ola do Servico Exemplo!";
    }

    public void riskyOperation() throws Exception {
        System.out.println("Performing a risky operation...");
        throw new Exception("An error occurred during the risky operation.");
    }
}
