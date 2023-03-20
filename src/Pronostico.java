public class Pronostico {
  private  Partido partido;

  private Equipo equipo;

  private ResultadoEnum resultado;

  public int puntos (){

    ResultadoEnum.resultado resul = ResultadoEnum.resultado.empate;
    int puntaje =0;
    if (resul == ResultadoEnum.resultado.empate){
       puntaje = 1;
    } else if (resul== ResultadoEnum.resultado.ganador) {
      puntaje = 3;

    }else if(resul== ResultadoEnum.resultado.perdedor){
      puntaje =0;
    }


    return puntaje;
  }

}
