package types;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Objects;


public class TypesTournament implements Types, Serializable, Comparable<TypesTournament> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2465967083363947302L;
	private Timestamp registerDate;
	private String name;
	private TypesFame fame;
	// private List<Jeu> jeux;
	private TypesGame game;
	private int id;
	private ArrayList<TypesPool> pool;
	private ArrayList<Integer> registered;
	
	public TypesTournament(Timestamp registerDate, String name, TypesFame fame, TypesGame game, int id) {
		this.registerDate = registerDate;
		this.name = name;
		this.fame = fame;
		this.game = game;
		this.id = id;
		this.registered = new ArrayList<>();
		this.pool = new ArrayList<>();
	}
	
	public void setId(int id) {
		this.id = id;
	}
	

	public Timestamp getRegisterDate() {
		return registerDate;
	}

	public String getName() {
		return name;
	}

	public TypesFame getFame() {
		return fame;
	}

	public TypesGame getGame() {
		return game;
	}
	
	public int getId() {
		return id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(registerDate, id, game, name, fame);
	}
	
	public void setPool(ArrayList<TypesPool> pool) {
		this.pool = pool;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TypesTournament other = (TypesTournament) obj;
		return id == other.id;
	}
	
	public ArrayList<Integer> getRegistered() {
		return registered;
	}
	
	public ArrayList<TypesPool> getPool() {
		return pool;
	}
	
	public void registerTeam(int team) {
		registered.add(team);
	}
	
	public void unregisterTeam(int team) {
		registered.remove(Integer.valueOf(team));
	}
	
	public int getNbInscrit() {
		return registered.size();
	}
	
	public boolean isFull() {
		return registered.size()==16;
	}
	
	
	
	public void setRegistered(ArrayList<Integer> inscris) {
		this.registered = inscris;
	}

	@Override
	public int compareTo(TypesTournament o) {
		return this.getRegisterDate().compareTo(o.getRegisterDate());
	}
	
	
	
	
	
	

}
