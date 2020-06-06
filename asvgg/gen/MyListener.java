public class MyListener extends asvggBaseListener{
    private Map<String,Integer> variables;

    public MyListener(){
        variables = new HashMap<>();
    }

    @Override
    public void exitVariavel(VariavelContext ctx){
        String variableName = ctx.ID(0).getText();
    }
}