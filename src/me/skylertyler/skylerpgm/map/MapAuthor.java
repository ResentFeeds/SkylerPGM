package me.skylertyler.skylerpgm.map;

import java.util.UUID;

public class MapAuthor {

	private UUID uuid;
	private String contribution;

	public MapAuthor(UUID uuid, String contribution) {
		this.uuid = uuid;
		this.contribution = contribution;
	}

	public MapAuthor(UUID uuid) {
		this(uuid, null);
	}

	public UUID getUUID() {
		return this.uuid;
	}

	public boolean hasContribution() {
		return this.getContribution() != null;
	}

	public String getContribution() {
		return this.contribution;
	}

}
