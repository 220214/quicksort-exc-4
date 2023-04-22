package controller;

public class ordenacao {

	public ordenacao() {
		super ();
	}
public int[]quickSort(int []vt, int inicio, int fim){
	if(fim>inicio) {
		int ppf = div(vt,inicio,fim);
		quickSort(vt,inicio,ppf -1);
		quickSort(vt,ppf + 1 , fim);
		}
	return vt;
	}
private int div (int []vt , int inicio, int fim) {
	int pE = inicio +1;
	int pD = fim;
	int pivo = vt[inicio];
	while (pE <=pD) {
		while (pE <= pD && vt[pE]<= pivo) {
			pE++;
		}
		while (pD>=pE && vt[pD]>pivo) {
			pD --;
		}
		if(pE <pD) {
			trocar(vt, pE,pD);
			pE ++;
			pD --;
		}
		
		}
	trocar (vt, inicio,pD);
	return pD;
}
private void trocar(int[] vt, int i, int j) {
	int aux =vt[j];
	vt[j]=vt[i];
	vt[i]= aux;
	
}
}