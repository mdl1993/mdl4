package div.dao.utils;

public class SQLString {

	public static final String ANAGRAFICA_LIST =
		"SELECT * FROM anagrafiche a INNER JOIN province b ON a.id_provincia_nascita = b.id_provincia";

	public static final String ANAGRAFICA_GET =
		"SELECT * FROM anagrafiche a INNER JOIN province b ON a.id_provincia_nascita = b.id_provincia WHERE a.id = :id";

	public static final String ANAGRAFICA_INSERT =
		"INSERT INTO anagrafiche(" +
			"nome, " +
			"cognome, " +
			"codice_fiscale, " +
			"id_provincia_nascita, " +
			"eta, " +
			"sesso, " +
			"categoria_protetta, " +
			"curriculum) " +
		"VALUES(" +
			":nome, " +
			":cognome, " +
			":codiceFiscale, " +
			":provinciaNascita.idProvincia, " +
			":eta, " +
			":sesso, " +
			":categoriaProtetta, " +
			":curriculum)";

	public static final String ANAGRAFICA_UPDATE =
		"UPDATE anagrafiche SET " +
	        "nome = :nome, " +
	        "cognome = :cognome, " +
	        "codice_fiscale = :codiceFiscale, " +
	        "id_provincia_nascita = :provinciaNascita.idProvincia, " +
	        "eta = :eta, " +
	        "sesso = :sesso, " +
	        "categoria_protetta = :categoriaProtetta, " +
	        "curriculum = :curriculum " +
        "WHERE id = :id";

	public static final String ANAGRAFICA_DELETE =
		"DELETE FROM anagrafiche WHERE id = :id";
}