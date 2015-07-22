package me.skylertyler.skylerpgm.map;

import java.util.UUID;

public class MapContributor {

	private UUID uuid;
	private String contribution;

	public MapContributor(UUID uuid, String contribution) {
		this.uuid = uuid;
		this.contribution = contribution;
	}

	public MapContributor(UUID uuid) {
		this(uuid, null);
	}

	public UUID getUUID() {
		return this.uuid;
	}

	public String getContribution() {
		return this.contribution;
	}

	public boolean hasContribution() {
		return this.getContribution() != null;
	}
}
