public class Partido {

    private Equipo equipo1;
    private Equipo equipo2;
    private int golesEquipo1;
    private int golesEquipo2;

    public Enum<ResultadoEnum.resultado> resultado(String equipo){
        ResultadoEnum.resultado resultadoPartido = null;
        if (golesEquipo1==golesEquipo2) {
            resultadoPartido = ResultadoEnum.resultado.empate;

        } else if(golesEquipo1>golesEquipo2){
            resultadoPartido= ResultadoEnum.resultado.ganador;
        }else if (golesEquipo1<golesEquipo2){
            resultadoPartido = ResultadoEnum.resultado.perdedor;
        }
        
return  resultadoPartido;

    }

}
