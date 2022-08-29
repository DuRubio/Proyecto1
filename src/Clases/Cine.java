package Clases;

public class Cine {

	private int[][] butacas;
	private int nFilas;
	private int nColumnas;

	public Cine(int nFilas, int nColumnas) {
		this.nFilas = nFilas;
		this.nColumnas = nColumnas;
		this.butacas = new int[nColumnas][nFilas];

	}

	public boolean verificarDisponibilidad(int columna, int fila) {
		if (butacas[columna][fila] == 0)
			return true;
		return false;
	}

	public boolean ocuparButaca(int columna, int fila) {
		if (verificarDisponibilidad(columna, fila)) {
			butacas[columna][fila] = 1;
			return true;
		}
		return false;
	}

	public String getButacas() {
		String mensaje = "";
		for (int i = 0; i < nColumnas; i++) {
			for (int j = 0; j < nFilas; j++) {
				if (butacas[i][j] == 0) {
					mensaje += "Columna " + (i + 1) + " " + "Fila " + (j + 1) + " Disponible \n";
				} else {
					mensaje += "Columna " + (i + 1) + " " + "Fila " + (j + 1) + " Ocupado \n";
				}
			}
		}
		return mensaje;
	}

	public String getLibres() {
		String mensaje = "";
		for (int i = 0; i < nColumnas; i++) {
			for (int j = 0; j < nFilas; j++) {
				if (butacas[i][j] == 0)
					mensaje += "Columna " + (i + 1) + " " + "Fila " + (j + 1) + " Disponible \n";
			}
		}
		return mensaje;

	}

//	public int contarOcupadas() {
//		int butacasOcupadas = 0;
//		for (int i = 0; i < nFilas; i++) {
//			for (int j = 0; j < nColumnas; j++) {
//				if (butacas[i][j] != 1)
//					butacasOcupadas++;
//			}
//		}
//		return butacasOcupadas;
//	}

	public boolean hayEspacioPara(int columna, int cantidadButacas) {

//		int n = 0;
//		while (n < cantidadButacas) {
//			for (int j = 0; j < nFilas; j++) {
//				if (butacas[columna][j] != 0) {
//					ocuparButaca(columna, j);
//					n++;
//				}
//			}
//			
//		}
//		if (n == cantidadButacas)
//			return true;
//		return false;
//
		int flag = 0;

		for (int i = 0; i < nFilas; i++) {

			if (verificarDisponibilidad(columna, i) == true) {
				flag++;

				if (flag == cantidadButacas) {
					for (int j = 0; j < flag; j++) {
						butacas[columna][j] = 1;
					}
					return true;
				}
			} else {
				flag = 0;
				return false;

			}
		}
		return false;

	}

}

