package instrument;

public class ProcesarElementoPivote {
    public static void eliminarElementoPivote(java.util.List<java.lang.Integer> elementos, int pivote) {
        _parameters = new java.util.ArrayList<String>();
        _parameters.add("elementos");
        _parameters.add("pivote");
        ar.edu.ungs.pps2.jgentest.model.ConcolicExpression symbResolver= new ar.edu.ungs.pps2.jgentest.model.ConcolicExpression();
        java.util.Map<String, String> varSymValMap = new java.util.HashMap<String, String>();
        varSymValMap.put("pivote","pivote0");
        varSymValMap.put("elementos","elementos0");
        elementos.remove(((java.lang.Object)(pivote)));
    }

    public java.util.LinkedHashSet<ar.edu.ungs.pps2.jgentest.model.SymbCondition> _conditions = new java.util.LinkedHashSet<ar.edu.ungs.pps2.jgentest.model.SymbCondition>();

    public java.util.List<String> _parameters = null;
}