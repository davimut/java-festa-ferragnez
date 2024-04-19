package com.ferragnez.party;

import java.util.Scanner;

//Ciao Ragazzi/e esercizio di oggi: Festa a casa Ferragnez
//nome repo: java-festa-ferragnez
//State lavorando col servizio di sicurezza dei Ferragnez e il vostro compito è di assicurarvi che accedano alla festa solo gli invitati presenti sulla lista (in fondo al post)
//Consegna: creare un progetto java-festa-ferragnez con il package com.ferragnez.party, a cui aggiungere la classe CheckGuest
//Nel programma bisogna: creare e inizializzare l’array contenente i nomi degli invitati chiedere all’utente come si chiama e  verificare che il nome sia presente nella lista; lasciarlo entrare o rispedirlo cortesemente da dove è venuto :occhiali_da_sole:
//Bonus se avete usato il ciclo for per cercare il nome nella lista nella consegna base, implementare lo stesso programma
//usando il ciclo while, e viceversa Buon lavoro e buon weekend! :faccia_leggermente_sorridente: 
//:tada: Lista invitati: Dua Lipa, Paris Hilton, Manuel Agnelli, J-Ax, Francesco Totti, 
//Ilary Blasi, Bebe Vio, Luis, Pardis Zarei, Martina Maccherone, Rachel Zeilic

public class CheckGuest {
	public static void main(String[] args) {

		String[] nomeInvitati = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti","Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };

		System.out.println("Benvenuto alla festa dei Ferragnez !!...");
		Scanner userName = new Scanner(System.in);
		System.out.println("Inserisci il tuo nome e cognome se sei nella lista degli invitati sarai il benvenuto altrimeti!!...");
		String nomeUtente = userName.nextLine();

//		for (int i = 0; i < nomeInvitati.length; i++) {
//			if (nomeUtente.equals(nomeInvitati[i])) {
//				System.out.println(" Sei il benvenuto alla festa dei Ferrgnez ti stavamo aspettando " + nomeUtente);
//				break;
//			} else if (i == nomeInvitati.length - 1) {
//				System.out.println("Purtroppo non sei riconosciuto dagli agenti di sicurezza, la preghiamo di tornare da dove è venuto!!!");
//			}
//       	}
		
                 int i = 0;
        
	         while (i < nomeInvitati.length) { 
	    	       if ( nomeUtente.equals(nomeInvitati[i])) {
		                System.out.println(" Sei il benvenuto alla festa dei Ferrgnez ti stavamo aspettando " + nomeUtente);
				break;
			} else if (i == nomeInvitati.length - 1) {
				System.out.println("Purtroppo non sei riconosciuto dagli agenti di sicurezza, la preghiamo di tornare da dove è venuto!!!");
			}
	    	        i++;
	        }
	}
}
