package view;

import controller.ordenacao;

public class Principal {

	public static void main(String[] args) {
		int []vt = {69, 68, 32, 36, 91, 19, 28, 44, 88, 73, 37, 99, 1};
		ordenacao ord = new ordenacao();
		vt= ord.quickSort(vt, 0,vt.length -1);
		for(int valor: vt) {
			System.out.print(valor);
			System.out.println(" ");
		}
	}

}
